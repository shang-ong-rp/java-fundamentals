package LU11;

import java.util.stream.IntStream;

public class LambdaStreamDemo {

	public static void main(String[] args) {
		
		// compute the sum of the squares of integers 1-5
		System.out.println("Compute the sum of the squares of integers...");
		System.out.println(IntStream.range(1, 6)
			    .map(n -> n * n)
			    .sum());
		
		// compute the sum of squares of odd integers
		System.out.println("Compute the sum of cubes of odd integers...");
		System.out.println(IntStream.of(3, 1, 4, 1, 5, 9, 2, 6, 5, 3)
		    .filter(n -> n % 2 != 0)
		    .map(n -> n * n * n)
		    .sum());
	}
}