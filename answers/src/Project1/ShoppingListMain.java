package Project1;
import java.util.*;

public class ShoppingListMain {
	
    public static void main(String[] args)
    {
        boolean end = false;
        
        System.out.println("Welcome to Marketropolis Market!");
        ShoppingList mycart = new ShoppingList();
        
        Scanner inp = new Scanner(System.in);
        
		do {
		    System.out.print("\n(S) Get which item? > ");
	        String a = inp.next();
	        
		    System.out.print("\n(D) How much is it? > $");
		    double b = inp.nextDouble();
		    
		    System.out.print("\n(I) How many? > ");
		    int c = inp.nextInt();
		    
		    mycart.addToCart(a, b, c);
		    
		    System.out.print("\n(Y/N) Get another item? > ");
	        String d = inp.next();
	        
		    switch (d) {
	        	case "y":
	        		//check if there is Shopping Cart left
	        		if(mycart.getCapacity() == 0) {
	        			System.out.println("Shopping Cart is full.");
	        			end = true;
	        		}
	        		break;
	            case "n":
	            	end = true;
	            	break;
	            default:
	
		    }
		    
		    // If end is True, proceed to Checkout
		    if(end) {
		    	System.out.println("Checkout and please pay.");
            	System.out.println(mycart.toString());
		    }
		    
	    } while (!end);
		
	} // end main
} // end class
