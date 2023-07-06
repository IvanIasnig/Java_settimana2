package classi;

public class Product {
    private Long id;
    private String name;
    private String category;
    private Double price;

    
    // Costruttori, getter, setter, metodi equals(), hashCode() e toString()
    public Product (Long id, String name, String category, double price) {
    	
    	this.id = id;
    	this.name = name;
    	this.category = category;
    	this.price = price;
    }
    
    public void setId(Long id) {
    	this.id = id;
    }
    
    public Long getId() {
    	return id;
    }
    
    public void setName(String name) {
    	this.name = name;
    }
    
    public String getName() {
    	return name;
    }
    
    public void setCategory(String category) {
    	this.category = category;
    }
    
    public String getCategory() {
    	return category;
    }
    
    public void setPrice(double price) {
    	this.price = price;
    }
    
    public double getPrice() {
    	return price;
    }
    
    @Override
    public String toString() {
        return "id=" + id + ", name=" + name + ", category=" + category + ", price=" + price + " ";
    }
    
}