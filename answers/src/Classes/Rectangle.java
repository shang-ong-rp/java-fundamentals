package Classes;

public class Rectangle {
	public double width;
	public double height;

	public Rectangle(double width, double height) {

		this.width = width;
		this.height = height;
	}

	public double calculateArea() {
		double area = width * height;
		return area;
	}

	public double calculatePerimeter() {
		double perimeter = (2 * width) + (2 * height);
		return perimeter;
	}
	
	public double calculateVolume(double base) {
	    double volume = base * width * height ;
	    return volume;
	  }
	
	public void display(){
		this.calculateArea();
	}
	
}


