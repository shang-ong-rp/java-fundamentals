package LU4_Classes;

public class ShapeMain {

	public static void main(String[] args) {
		Square sq = new Square(8.0);
		Circle c = new Circle(3.0);
		double areaBlueRegion = sq.calcArea() - c.calculateArea();
		System.out.println("Area of the blue region: " + areaBlueRegion);	
	}
}