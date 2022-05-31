package LU4;

public class Square {

	public double width;

	public Square(double width) {
		this.width = width;
	}

	public double calcArea() {
		double area = width * width;
		return area;
	}

	public double calcPerimeter() {
		double perimeter = width * 2 + width * 2;
		return perimeter;
	}

	public double calcVolume(double base) {
		double volume = base * width * width;
		return volume;
	}

	public void display() {
		System.out.println("Area: " + calcArea());
		System.out.println("Perimeter: " + calcPerimeter());
	}
}

// public double calcVolume(double base) {
// double volume = base * width * height;
// return volume;
// }