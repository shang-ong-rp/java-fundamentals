package Classes;

public class SquareMain {

	public static void main(String[] args) {

		Square square1 = new Square(1.5);
		square1.display();

		double volume = square1.calcVolume(3.0);
		System.out.println("Volume of square1: " + volume);

	}

}

// System.out.println(rect.calcVolume(3.0));

// Given the base is 3.0, write the code to display the volume.

// double vol = sq.calcVolume(3.0);
// System.out.println(vol);