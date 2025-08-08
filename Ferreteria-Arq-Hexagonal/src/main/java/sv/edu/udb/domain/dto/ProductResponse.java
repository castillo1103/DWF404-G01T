package sv.edu.udb.domain.dto;

public class ProductResponse {

    private Long id;
    private String name;
    private Double price;

    public ProductResponse() {}

    public ProductResponse(Long id, String name, Double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    // Getters y Setters
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public Double getPrice() { return price; }
    public void setPrice(Double price) { this.price = price; }
}
