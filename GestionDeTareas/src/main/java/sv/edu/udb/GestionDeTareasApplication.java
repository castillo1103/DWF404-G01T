package sv.edu.udb;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import sv.edu.udb.model.Tarea;
import sv.edu.udb.repository.TareaRepository;

@SpringBootApplication
public class GestionDeTareasApplication {

	public static void main(String[] args) {
		SpringApplication.run(GestionDeTareasApplication.class, args);
	}

	// Carga datos iniciales en H2 al arrancar
	@Bean
	CommandLineRunner initData(TareaRepository repository) {
		return args -> {
			repository.save(new Tarea("Comprar ingredientes", "Comprar verduras y carnes para la cena", "Pendiente"));
			repository.save(new Tarea("Lavar ropa", "Lavar la ropa blanca y de color separado", "En Progreso"));
			repository.save(new Tarea("Estudiar Java", "Practicar Spring Boot y arquitectura limpia", "Pendiente"));
		};
	}
}
