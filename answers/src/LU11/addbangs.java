package LU11;

public class addbangs {

	public static void main(String[] args) {
		// defining the function
		addbangsInterface add_bangs = s -> (s + "!!!");
		//execute or run our functions
		System.out.println(add_bangs.run("hello"));
	}
}
