package LU7;
import java.util.ArrayList;

public class StaffArrayList {

	public static void main(String[] args) {

		// a) Write code to create 3 Staff objects with the information provided
		Staff staff1 = new Staff("Jack", 21);
		Staff staff2 = new Staff("Bob", 35);
		Staff staff3 = new Staff("Alice", 27);

		// b) Write code to create an ArrayList of Staff objects named staffList
		ArrayList<Staff> staffList = new ArrayList<Staff>();

		// c) Write code to add the Staff objects created in a) to staffList.
		staffList.add(staff1);
		staffList.add(staff2);
		staffList.add(staff3);

		// d) Write code to call the showAllStaffNames method to display all staff
		// names.
		StaffArrayList.showAllStaffNames(staffList);

	}

	public static void showAllStaffNames(ArrayList<Staff> staffList) {

		// e) Using a for loop, write code to display all staff names.
		for (int i = 0; i < staffList.size(); i++) {
			System.out.println(staffList.get(i).getName());
		}
	}
}
