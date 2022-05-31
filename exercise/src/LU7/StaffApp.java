package LU7;

public class StaffApp {

	public static void main(String[] args) {

		Staff myStaff = new Staff("Shang",33);

		myStaff.setName("Jack");
		myStaff.setAge(-10); //wrong
		myStaff.setAge(21);
		myStaff.checkAge(21);
		myStaff.display();
	}
}

