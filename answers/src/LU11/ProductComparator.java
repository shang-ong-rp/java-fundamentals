package LU11;

import java.util.ArrayList;  
import java.util.Collections;  
import java.util.List;
import java.util.stream.Stream;

public class ProductComparator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Product> list = new ArrayList<Product>();  
        
        //Adding Products  
        list.add(new Product(1,"HP Laptop",25000.00));
        list.add(new Product(2,"Dell Mouse",150.00));
        list.add(new Product(3,"Keyboard",300.00));
        list.add(new Product(4,"Samsung A5",17000.00));  
        list.add(new Product(5,"Iphone 6S",65000.00));  
        list.add(new Product(6,"Sony Xperia",25000.00));  
        list.add(new Product(7,"Nokia Lumia",15000.00));  
        list.add(new Product(8,"Redmi 4",26000.00));  
        list.add(new Product(9,"Lenevo Vibe",19000.00));  
        
        System.out.println("Sorting on the basis of id...");
        for(Product p:list){  
            System.out.println(p.id + " | " + p.name + " | " + p.price);  
        }
          
        System.out.println("Sorting on the basis of name...");
        // implementing lambda expression  
        Collections.sort(list,(p1,p2) -> {
        	return p1.name.compareTo(p2.name);  
        });
        
        for(Product p:list){  
            System.out.println(p.id + " | " + p.name + " | " + p.price);  
        }
        
        // using lambda to filter data
        System.out.println("Sorting on the basis of price...");  
        Stream<Product> filtered_data = list.stream().filter(p -> p.price > 20000);        
		// using lambda to iterate through collection  
		filtered_data.forEach(
			p -> System.out.println(p.id + " | " + p.name + " | " + p.price)  
		);  

	}
}
