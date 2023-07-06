package classi;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
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
        products.add(new Product(5L, "Clothing 1", "Baby", 75.0));
        products.add(new Product(6L, "Shoes 1", "Women", 85.7));
        products.add(new Product(7L, "Electronics 1", "Electronics", 200.0));
        products.add(new Product(8L, "Toy 2", "Boys", 60.0));
        products.add(new Product(9L, "Toy 3", "Girls", 65.3));
        products.add(new Product(10L, "Electronics 2", "Baby", 250.0));
        
        orders.add(new Order(121,"Completed", LocalDate.of(2023, 2, 1), LocalDate.of(2023, 2, 5), Arrays.asList(products.get(0), products.get(1)), Mario));
        orders.add(new Order(122,"Completed", LocalDate.of(2023, 2, 2), LocalDate.of(2023, 2, 6), Arrays.asList(products.get(2), products.get(3)), Luigi));
        orders.add(new Order(123,"In Progress", LocalDate.of(2023, 2, 3), LocalDate.of(2023, 2, 7), Arrays.asList(products.get(4), products.get(5)), Mario));
        orders.add(new Order(124,"In Progress", LocalDate.of(2023, 2, 4), LocalDate.of(2023, 2, 8), Arrays.asList(products.get(6), products.get(7)), Luigi));
        orders.add(new Order(125,"Completed", LocalDate.of(2023, 2, 5), LocalDate.of(2023, 2, 9), Arrays.asList(products.get(8), products.get(9)), Mario));
        orders.add(new Order(126,"Completed", LocalDate.of(2023, 3, 1), LocalDate.of(2023, 3, 5), Arrays.asList(products.get(1), products.get(2)), Luigi));
        orders.add(new Order(127,"In Progress", LocalDate.of(2023, 3, 2), LocalDate.of(2023, 3, 6), Arrays.asList(products.get(3), products.get(4)), Mario));
        orders.add(new Order(128,"In Progress", LocalDate.of(2023, 3, 3), LocalDate.of(2023, 3, 7), Arrays.asList(products.get(5), products.get(6)), Luigi));
        orders.add(new Order(129,"Completed", LocalDate.of(2023, 3, 4), LocalDate.of(2023, 3, 8), Arrays.asList(products.get(7), products.get(8)), Mario));
        orders.add(new Order(120,"Completed", LocalDate.of(2023, 3, 5), LocalDate.of(2023, 3, 9), Arrays.asList(products.get(9), products.get(0)), Luigi));
        
        
        List<Product> booksOver100 = products.stream()
                .filter(x -> "Books".equals(x.getCategory()) && x.getPrice() > 100)
                .toList();
        
        List<Order> babyOrders = orders.stream()
        	    .filter(order -> order.getProducts().stream()
        	        .anyMatch(product -> "Baby".equals(product.getCategory())))
        	    .toList();

        List<Product> boys = products.stream()
                .filter(x -> "Boys".equals(x.getCategory()))
                .map(p -> new Product(p.getId(), p.getName(), p.getCategory(), p.getPrice() * 0.9))
                .toList();
        
        List<Product> orderFebApr = orders.stream()
        	    .filter(order -> order.getCustomer().getTier() == 2 &&
        	                     order.getOrderDate().isAfter(LocalDate.of(2023, 1, 31)) &&
        	                     order.getOrderDate().isBefore(LocalDate.of(2023, 4, 2)))
        	    .flatMap(order -> order.getProducts().stream())
        	    .toList();
        
        	System.out.println("-------------ES 1--------------");
            booksOver100.forEach(System.out::println);
            
            System.out.println("-------------ES 2--------------");
            babyOrders.forEach(System.out::println);
            
            System.out.println("-------------ES 3--------------");
            boys.forEach(System.out::println);
            
            System.out.println("-------------ES 4--------------");
            orderFebApr.forEach(System.out::println);
            
	}

}
