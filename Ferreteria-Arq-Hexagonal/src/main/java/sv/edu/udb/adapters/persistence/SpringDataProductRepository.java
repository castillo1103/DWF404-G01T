package sv.edu.udb.adapters.persistence;

import org.springframework.data.jpa.repository.JpaRepository;
import sv.edu.udb.domain.Product;

public interface SpringDataProductRepository extends JpaRepository<Product, Long> {}
