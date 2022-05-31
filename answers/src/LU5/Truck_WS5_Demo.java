package LU5;

public class Truck_WS5_Demo {

	//Exercise 1
	public String license;
	public double cost;
	public double lifeSpan;
			
	public Truck_WS5_Demo(String truck_license, double truck_cost, double truck_lifeSpan) {
		license = truck_license;
		cost = truck_cost;
		lifeSpan = truck_lifeSpan;
	}
			
	public void printCost() {
		System.out.println("The cost of truck is " +cost);
	}
			
	public double calculateValue(double age) {
		double valueRemaining = ( (lifeSpan - age)/lifeSpan);
		return valueRemaining;
	}
}
