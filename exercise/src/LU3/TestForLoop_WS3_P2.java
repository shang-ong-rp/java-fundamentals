package LU3;

//Worksheet 3 Practice 2
public class TestForLoop_WS3_P2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int counter = 0;
		
		// Exercise 1
		System.out.println("Exercise 1");
		for(int counter1 = 0; counter1 < 6; counter1++) {
			System.out.println(counter1);
		}
			
		// Exercise 2
		System.out.println("Exercise 2");
		for(int counter2 = 1; counter2 < 6; counter2++) {
			System.out.println(counter2);
		}
		
		// Exercise 3
		System.out.println("Exercise 3");
		for(int counter3 = 5; counter3 > 0; counter3--) {
			System.out.println(counter3);
		}
			
		// Exercise 4
		System.out.println("Exercise 4");
		int sum = 0;
		for(int i=1;i<10;i+=2){
			sum = sum + i;
		}
		System.out.println("The sum is " + sum);
			
		// Exercise 5
		System.out.println();
		System.out.println("Exercise 4");
		Double total = 0.0;
		int score;
		for(int i=1;i<6;i++) {
			score = Helper.readInt("Enter test score " + i +": ");
			total = total + score;
		}
		System.out.println("The average score is " + total/5);

	} // end Main
} //end Class
