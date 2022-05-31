package LU5;

public class TruckMain_WS5_Demo {

	public static void main(String[] args) {
		
		Truck_WS5_Demo truck1= new Truck_WS5_Demo("SXD2122",100000.0,10);
		truck1.printCost();		
		double currentValue = truck1.calculateValue(5.0);
		System.out.println("Value of truck now is " +currentValue);

	}
}
