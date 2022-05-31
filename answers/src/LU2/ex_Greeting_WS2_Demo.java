package LU2;
import Helper;

public class ex_Greeting_WS2_Demo {

	//Demo
	public static void main(String[] args) {
	
		int hour = Helper.readInt("Enter Hourse (0-23) > : ");

		if(hour < 12){
			System.out.println("Good Morning!");
		}	else if(hour < 18){
			System.out.println("Good Afternoon!");
		}else {
			System.out.println("Good Evening!");
		}
	
	}//end main
}
