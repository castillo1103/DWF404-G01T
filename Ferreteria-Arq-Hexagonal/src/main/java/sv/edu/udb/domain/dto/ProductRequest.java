package sv.edu.udb.domain.dto;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;

public class ProductRequest {

    @NotBlank
    private String name;

    @Min(0)
    private Double price;

    public ProductRequest() {}

    public ProductRequest(String name, Double price) {
        this.name = name;
        this.price = price;
    }

    // Getters y Setters
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public Double getPrice() { return price; }
    public void setPrice(Double price) { this.price = price; }
}
