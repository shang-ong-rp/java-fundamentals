package LU6_Inheritance;

public class Outer {
	public void display() {
		Inner in = new Inner();
		in.show();
	}

	class Inner {
		public void show() {
			System.out.println("Inside inner");
		}
	}
}



