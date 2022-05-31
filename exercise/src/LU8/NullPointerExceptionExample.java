package LU8;

public class NullPointerExceptionExample {

	public static void main(String[] args) {

		String[] nameArray = new String[10];

		nameArray[0] = "Alice";
		nameArray[3] = "Bob";
		nameArray[5] = "Charlie";
		nameArray[6] = "David";

		for (String n : nameArray) {

			System.out.println(n.toUpperCase());

		}
	}
}

// public class NullPointerExceptionExample {
//
// public static void main(String[] args) {
//
// String[] nameArray = new String[10];
//
// nameArray[0] = "Alice";
// nameArray[3] = "Bob";
// nameArray[5] = "Charlie";
// nameArray[6] = "David";
//
// for (String n : nameArray) {
// if (n != null) {
// System.out.println(n.toUpperCase());
// } else {
// System.out.println("An error occurred.");
// }
// }
// }
// }

// public class NullPointerExceptionExample {
//
// public static void main(String[] args) {
//
// String[] nameArray = new String[10];
//
// nameArray[0] = "Alice";
// nameArray[3] = "Bob";
// nameArray[5] = "Charlie";
// nameArray[6] = "David";
//
// for (String n : nameArray) {
// try {
// System.out.println(n.toUpperCase());
// } catch (NullPointerException np) {
// System.out.println("An error occurred.");
// }
// }
//
// System.out.println("This is outside the try-catch");
// }
// }
