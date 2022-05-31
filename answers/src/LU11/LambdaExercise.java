package LU11;

public class LambdaExercise {

	public static void main(String[] args) {

		// Preparing lambda expressions to test for even numbers
		NumberChecker checkEven = (x) -> (x % 2) == 0; // test for even numbers

		// Allow user to enter some input and test the input
		int a = Helper.readInt("Enter a number to check if it is even > ");
		System.out.println(checkEven.test(a));

		//TODO LambdaDemo Task 1: 
		//Write the code to prepare lambda expressions to test for odd numbers
		NumberChecker checkOdd = (x) -> (x % 2) == 1;
		int b = Helper.readInt("Enter a number to check if it is odd > ");
		System.out.println(checkOdd.test(b));
				
		//TODO LambdaDemo Task 2: 
		//Write the code to prepare lambda expressions to test for positive numbers
		NumberChecker checkPositive = (x) -> x > 0;
		int c = Helper.readInt("Enter a number to check if it is positive > ");
		System.out.println(checkPositive.test(c));

		//TODO P10 LambdaDemo Task 3: 
		//Write the code to prepare lambda expressions to test for negative numbers
		NumberChecker checkNegative = (x) -> x < 0;
		int d = Helper.readInt("Enter a number to check if it is negative > ");
		System.out.println(checkNegative.test(d));
	}
}
