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
		
				
		//TODO LambdaDemo Task 2: 
		//Write the code to prepare lambda expressions to test for positive numbers
		

		//TODO P10 LambdaDemo Task 3: 
		//Write the code to prepare lambda expressions to test for negative numbers
		
	}
}
