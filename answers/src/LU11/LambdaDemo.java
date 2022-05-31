package LU11;

import java.util.Scanner;
import java.util.function.IntBinaryOperator;
import java.util.Random;

public class LambdaDemo {

	public static void main(String[] args) {
		// defining the function
		LambdaDemoInterface add = (x, y) -> (x + y);
		LambdaDemoInterface sub = (x, y) -> (x - y);
		LambdaDemoInterface multiple = (x, y) -> (x * y);
		LambdaDemoInterface divide = (x, y) -> (x / y);
		
		//execute or run our functions
		System.out.println(add.run(2, 3));
		System.out.println(sub.run(2, 3));
		System.out.println(multiple.run(2, 3));
		System.out.println(divide.run(2, 3));
		
		Scanner console = new Scanner(System.in);

		// quiz the user on 3 addition problems
		giveProblems(console, 3, "+", (x, y) -> x + y);

		// quiz the user on 3 multiplication problems
		giveProblems(console, 3, "*", (x, y) -> x * y);

	}
	
	public static void giveProblems(Scanner console, int count, String text, IntBinaryOperator operator) {
	    Random r = new Random();
	    int numRight = 0;
	    for (int i = 1; i <= count; i++) {
	        int x = r.nextInt(12) + 1;
	        int y = r.nextInt(12) + 1;
	        System.out.print(x + " " + text + " " + y + " = ");
	        int answer = operator.applyAsInt(x, y);
	        int response = console.nextInt();
	        if (response == answer) {
	            System.out.println("you got it right");
	            numRight++;
	        } else {
	            System.out.println("incorrect...the answer was "
	                               + answer);
	        }
	    }
	    System.out.println(numRight + " of " + count + " correct");
	    System.out.println();
	}
}
