package LU2;

public class CalSum_WS2_P4 {

	public static void main(String[] args) {
		
		int number1;
		int number2;
		int number3;
		
		number1 = Helper.readInt("Enter first number: ");
		number2 = Helper.readInt("Enter Second number: ");
		number3 = Helper.readInt("Enter Third number: ");
		
		int sum = number1 + number2 +number3;
		System.out.println(sum);


	}

}
