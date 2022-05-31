package inheritance;

public class NestedClassDemo {
	public static void main(String[] args) {

		// Usual way of instantiating a class
		Outer ot = new Outer();
		ot.display();

		// Example of Inner class instantiated outside Outer class
		Outer.Inner in = ot.new Inner();
		in.show();
	}
}


