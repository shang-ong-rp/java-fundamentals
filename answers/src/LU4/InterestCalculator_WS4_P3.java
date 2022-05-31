package LU4;

//Methods WS4 P3 Exercise 2
public class InterestCalculator_WS4_P3 {

	public static double calcInterest(double premium, double interest_rate) {
		double interest = premium * interest_rate;
		return interest;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		InterestCalculator_WS4_P3 ic = new InterestCalculator_WS4_P3();
		double premium = 1000.0, interest_rate = 0.02;
		System.out.println( "Interest: " + ic.calcInterest(premium, interest_rate));
	} // end Main
} // end Class
