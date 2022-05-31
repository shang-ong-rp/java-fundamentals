package LU3;

//Worksheet 3 Practice 4
public class Array_WS3_P4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Exercise 1
		String[]  cakeSizeArray = { "Mini", "Small", "Medium", "Large" };
			
		//Exercise 2
		Double[] cakePriceArray  = {16.0, 20.0, 32.0, 42.0 };
				
		//Exercise 3
		System.out.println("1 " + cakeSizeArray[0] + " " + cakePriceArray[0]);
		System.out.println("2 " + cakeSizeArray[1] + " " + cakePriceArray[1]*2);
		System.out.println("1 " + cakeSizeArray[3] + " " + cakePriceArray[3]);
		Double totalBill = cakePriceArray[0] + 2* cakePriceArray[1] + cakePriceArray[3];
		System.out.println("Total: " + totalBill);
	}
}
