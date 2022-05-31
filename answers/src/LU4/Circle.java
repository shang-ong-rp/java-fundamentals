package LU4;

public class Circle {

	public double radius;
	public double pi;

	public Circle(double radius) {
		this.radius = radius;
		this.pi = 3.14;
	}

	public double calculateArea() {
		double area = pi * radius * radius;
		return area;
	}

	public double calculatePerimeter() {
		double perimeter = 2 * pi * radius;
		return perimeter;
	}

	public double calculateDiameter() {
		double diameter = radius + radius;
		return diameter;
	}

}
