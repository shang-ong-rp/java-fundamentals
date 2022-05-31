package LU2;

public class EnterSingapore_WS2_P5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Exercise 2
		String name = Helper.readString("First time entering Singapore? <y/n>: ");
	
		if(name.equals("y"))
			  System.out.println("Welcome to Singapore!");
		
		System.out.println("Thank you for using me.");

	}
}
