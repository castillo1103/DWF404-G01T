package sv.edu.udb.adapters.persistence;

import org.springframework.stereotype.Component;
import sv.edu.udb.domain.Product;
import sv.edu.udb.ports.out.ProductRepositoryPort;

import java.util.List;

@Component
public class ProductPersistenceAdapter implements ProductRepositoryPort {

    private final SpringDataProductRepository repository;

    public ProductPersistenceAdapter(SpringDataProductRepository repository) {
        this.repository = repository;
    }

    @Override
    public Product save(Product product) {
        return repository.save(product);
    }

    @Override
    public List<Product> findAll() {
        return repository.findAll();
    }
}
