package sv.edu.udb.application;

import org.springframework.stereotype.Service;
import sv.edu.udb.domain.Product;
import sv.edu.udb.domain.dto.ProductRequest;
import sv.edu.udb.domain.dto.ProductResponse;
import sv.edu.udb.ports.out.ProductRepositoryPort;

import java.util.List;

@Service
public class ProductService {

    private final ProductRepositoryPort productRepository;

    public ProductService(ProductRepositoryPort productRepository) {
        this.productRepository = productRepository;
    }

    public ProductResponse create(ProductRequest req) {
        Product product = new Product();
        product.setName(req.getName());
        product.setPrice(req.getPrice());

        Product saved = productRepository.save(product);

        return new ProductResponse(saved.getId(), saved.getName(), saved.getPrice());
    }

    public List<Product> getAll() {
        return productRepository.findAll();
    }
}
