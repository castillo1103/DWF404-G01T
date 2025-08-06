package udb.arquitectura.monolitica.service;

import udb.arquitectura.monolitica.model.Reserva;
import udb.arquitectura.monolitica.repository.ReservaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ReservaService {

    @Autowired
    private ReservaRepository reservaRepository;

    public Reserva crearReserva(Reserva reserva) {
        return reservaRepository.save(reserva);
    }

    public List<Reserva> listarReservas() {
        return reservaRepository.findAll();
    }

    public Optional<Reserva> buscarPorNombreUsuario(String nombreUsuario) {
        return reservaRepository.findByNombreUsuario(nombreUsuario);
    }
}
