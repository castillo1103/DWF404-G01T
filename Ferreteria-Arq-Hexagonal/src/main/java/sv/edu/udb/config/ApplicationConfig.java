package sv.edu.udb.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import sv.edu.udb.application.ProductService;
import sv.edu.udb.ports.out.ProductRepositoryPort;

@Configuration
public class ApplicationConfig {

    @Bean
    public ProductService productService(ProductRepositoryPort productRepositoryPort) {
        return new ProductService(productRepositoryPort);
    }
}
