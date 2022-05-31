package LU8;

public class ArithmeticExceptionExample {

	public static void main(String[] args) {

		int result = 0;
		int numerator = Helper.readInt("Enter a numerator > ");
		int denominator = Helper.readInt("Enter a denominator > ");

		if (denominator != 0) {
			result = numerator / denominator;

			System.out.println("Did we reach here?");
			System.out.println("Result: " + result);
		} else {
			System.out.println("***Error! Cannot divide by 0!");
		}
	}
}
