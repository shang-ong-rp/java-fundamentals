package LU8;

public class DemoArithmeticException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int result = 0;

		try {
		  result = 3 / 0;
		  System.out.println("Did we reach here?");
		} // end try
		catch (ArithmeticException ae) {
		  System.out.println("Error! Cannot divide by 0");
		  ae.printStackTrace();
		} // end catch

		System.out.println("Result is " + result);

	}
}
