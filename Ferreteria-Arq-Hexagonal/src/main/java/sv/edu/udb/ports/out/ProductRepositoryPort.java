package sv.edu.udb.ports.out;

import sv.edu.udb.domain.Product;
import java.util.List;

public interface ProductRepositoryPort {
    Product save(Product product);
    List<Product> findAll();
}
