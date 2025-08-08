package sv.edu.udb.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import sv.edu.udb.model.Tarea;
import sv.edu.udb.service.TareaService;

import java.util.List;

@RestController
@RequestMapping("/api/tareas")
public class TareaController {
    private final TareaService service;

    public TareaController(TareaService service) {
        this.service = service;
    }

    // Listar todas
    @GetMapping
    public List<Tarea> listar() {
        return service.listarTodas();
    }

    // Buscar por id
    @GetMapping("/{id}")
    public ResponseEntity<Tarea> obtener(@PathVariable Long id) {
        return service.obtenerPorId(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    // Buscar por titulo (query param ?titulo=algo)
    @GetMapping("/buscar")
    public List<Tarea> buscarPorTitulo(@RequestParam String titulo) {
        return service.buscarPorTitulo(titulo);
    }

    // Crear nueva tarea
    @PostMapping
    public Tarea crear(@RequestBody Tarea tarea) {
        return service.guardar(tarea);
    }

    // Actualizar tarea
    @PutMapping("/{id}")
    public ResponseEntity<Tarea> actualizar(@PathVariable Long id, @RequestBody Tarea tarea) {
        Tarea tareaActualizada = service.actualizar(id, tarea);
        return ResponseEntity.ok(tareaActualizada);
    }

    // Eliminar tarea
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> eliminar(@PathVariable Long id) {
        service.eliminar(id);
        return ResponseEntity.noContent().build();
    }
}
