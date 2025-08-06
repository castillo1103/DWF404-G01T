package udb.arquitectura.monolitica.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import udb.arquitectura.monolitica.model.Reserva;

import java.util.Optional;

public interface ReservaRepository extends JpaRepository<Reserva, Long> {
    Optional<Reserva> findByNombreUsuario(String nombreUsuario);
}
