package udb.arquitectura.monolitica.controller;

import udb.arquitectura.monolitica.model.Reserva;
import udb.arquitectura.monolitica.service.ReservaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/reservas")
public class ReservaController {

    @Autowired
    private ReservaService reservaService;

    @PostMapping
    public String crearReserva(@RequestBody Reserva reserva) {
        reservaService.crearReserva(reserva);
        return "Reserva creada exitosamente";
    }

    @GetMapping
    public List<Reserva> listarReservas() {
        return reservaService.listarReservas();
    }

    @GetMapping("/{nombreUsuario}")
    public Optional<Reserva> buscarPorNombreUsuario(@PathVariable String nombreUsuario) {
        return reservaService.buscarPorNombreUsuario(nombreUsuario);
    }
}
