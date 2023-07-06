package classi;

import java.time.LocalDate;
import java.util.List;

public class Order {
    private Long id;
    private String status;
    private LocalDate orderDate;
    private LocalDate deliveryDate;
    private List<Product> products;
    private Customer customer;

    // Costruttori, getter, setter, metodi equals(), hashCode() e toString()
    public Order (Long id, String status, LocalDate orderDate, LocalDate deliveryDate, List<Product> products, Customer customer ) {
    	this.id = id;
    	this.status = status;
    	this.orderDate = orderDate;
    	this.deliveryDate = deliveryDate;
    	this.customer = customer;
    }
    
    public void setId(Long id) {
    	this.id = id;
    }
    
    public Long getId() {
    	return id;
    }
    
    public void setStatus(String status) {
    	this.status = status;
    }
    
    public String getStatus() {
    	return status;
    }
    
    public void setOrderDate(LocalDate orderDate) {
    	this.orderDate = orderDate;
    }
    
    public LocalDate getOrderDate() {
    	return orderDate;
    }
    
    public void setProducts(List<Product> products) {
    	this.products = products;
    }
    
    public List<Product> getProducts() {
    	return products;
    }
    
    public void setCustomer(Customer customer) {
    	this.customer = customer;
    }
    
    public Customer getCustomer () {
    	return customer;
    }
    
}
