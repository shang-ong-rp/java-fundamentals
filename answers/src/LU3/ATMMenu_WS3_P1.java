package LU3;
//Worksheet 3 Practice 1
public class ATMMenu_WS3_P1 {

	public static void main(String[] args) {
		
		// Exercise 5
		int choice = -1;
		  		  
		while(choice != 0) {
			System.out.println("~ ATM ~");
			System.out.println("Enter 1 to check balance");
			System.out.println("Enter 2 to withdraw");
			System.out.println("Enter 3 to top-up cash card");
			System.out.println("Enter 0 to quit");

			choice = Helper.readInt("Enter choice:  ");
			System.out.println("You have selected " + choice);
			System.out.println("");
		}
		  
		System.out.println("Program ends");

	}
}
