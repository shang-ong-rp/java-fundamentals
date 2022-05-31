package LU2;

public class ex_outputNvariables {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String name = "Jonny";
		System.out.println(name + "! Time for lunch!"); 
		// The result is “Jonny! Time for lunch!”

		int mark = 67.8; //double mark = 67.8;
		System.out.println("Your mark for this test is " + mark); 
		// The result is “Your mark for this test is 67.8”, an implicit type casting is performed to convert mark to String

		int a = 5, b = 7;
		int c = 5 + 7; // The + operator here performs arithmetic addition
		System.out.println(a + " + " + b + " = " + c);
		// The result is “5 + 7 = 12”, the + operator here performs string concatenation

	}
}
