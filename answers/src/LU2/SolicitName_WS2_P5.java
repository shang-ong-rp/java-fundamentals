package LU2;

//Worksheet 2 Practice 5
public class SolicitName_WS2_P5 {

	public static void main(String[] args) {

		//Exercise 3 and 4
		String name = Helper.readString("Enter your name: ");
		int age = Helper.readInt("Enter your age:  ");
		int gender = Helper.readInt("Indicate your gender (0 - male, 1 - female): ");
		
		if(gender == 0)
			System.out.print("Good evening! Mr. ");
		else
			System.out.print("Good evening! Ms. ");
	
//		System.out.print("Good evening! ");
//		if(age>7) {
//			if(gender == 0)
//				System.out.print("Mr. ");
//			else
//				System.out.print("Ms. ");
//		}
		System.out.println(name);
	} // end Main
} // end Class
