package sv.edu.udb.service;

import org.springframework.stereotype.Service;
import sv.edu.udb.model.Tarea;
import sv.edu.udb.repository.TareaRepository;

import java.util.List;
import java.util.Optional;

@Service
public class TareaService {
    private final TareaRepository repository;

    public TareaService(TareaRepository repository) {
        this.repository = repository;
    }

    public List<Tarea> listarTodas() {
        return repository.findAll();
    }

    public Optional<Tarea> obtenerPorId(Long id) {
        return repository.findById(id);
    }

    public List<Tarea> buscarPorTitulo(String titulo) {
        return repository.findByTituloContainingIgnoreCase(titulo);
    }

    public Tarea guardar(Tarea tarea) {
        return repository.save(tarea);
    }

    public Tarea actualizar(Long id, Tarea tarea) {
        return repository.findById(id).map(t -> {
            t.setTitulo(tarea.getTitulo());
            t.setDescripcion(tarea.getDescripcion());
            t.setEstado(tarea.getEstado());
            return repository.save(t);
        }).orElseGet(() -> {
            tarea.setId(id);
            return repository.save(tarea);
        });
    }

    public void eliminar(Long id) {
        repository.deleteById(id);
    }
}
