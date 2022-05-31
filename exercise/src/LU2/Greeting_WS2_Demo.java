package LU2;

//Worksheet 2 Demonstration
public class Greeting_WS2_Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int hour = Helper.readInt("Enter Hourse (0-23) > : ");

		  if(hour < 12) {
			  System.out.println("Good Morning!");
		  }
		  else if(hour < 18) {
			  System.out.println("Good Afternoon!");
		  }
		  else {
			  System.out.println("Good Evening!");
		  }
		  
	}//end main
} // end Class
