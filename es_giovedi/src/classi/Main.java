package classi;


import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Product> products = new ArrayList<>();
		List<Order> orders = new ArrayList<>();
		
		Customer Mario = new Customer(1, "Mario", 2);
		Customer Luigi = new Customer(2, "Luigi", 3);
		
		products.add(new Product(1L, "Book 1", "Books", 90.5));
        products.add(new Product(2L, "Book 2", "Books", 120.2));
        products.add(new Product(3L, "Book 3", "Books", 180.9));
        products.add(new Product(4L, "Toy 1", "Baby", 50.0));
        products.add(new Product(5L, "Clothing 1", "Men", 75.0));
        products.add(new Product(6L, "Shoes 1", "Women", 85.7));
        products.add(new Product(7L, "Electronics 1", "Electronics", 200.0));
        products.add(new Product(8L, "Toy 2", "Boys", 60.0));
        products.add(new Product(9L, "Toy 3", "Girls", 65.3));
        products.add(new Product(10L, "Electronics 2", "Electronics", 250.0));
        

        
        List<Product> booksOver100 = products.stream()
                .filter(x -> "Books".equals(x.getCategory()) && x.getPrice() > 100)
                .toList();

            System.out.println(booksOver100.toString());
	}

}
