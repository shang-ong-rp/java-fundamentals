package LU8;

public class IndexOutOfBoundsExample {

	public static void main(String[] args) {
		String[] nameArray = new String[10];

		try {
			nameArray[0] = "Alice";
			nameArray[3] = "Bob";
			nameArray[10] = "Charlie";
			nameArray[5] = "David";

		} catch (ArrayIndexOutOfBoundsException aio) {
			System.out.println("You went out of the index!");
		}
	}
}

// public class IndexOutOfBoundsExample {
//
// public static void main(String[] args) {
// String[] nameArray = new String[10];
//
// nameArray[0] = "Alice";
// nameArray[3] = "Bob";
// nameArray[10] = "Charlie";
// nameArray[5] = "David";
//
// }
//
// }
