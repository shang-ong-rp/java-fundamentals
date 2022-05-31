package LU7;

public class StaffArray {

	public static void main(String[] args) {

		// a) Write code to create 3 Staff objects with the information provided
		Staff staff1 = new Staff("Jack", 21);
		Staff staff2 = new Staff("Bob", 35);
		Staff staff3 = new Staff("Alice", 27);

		// b) Write code to create an array of Staff objects named staffArr
		Staff[] staffArr = new Staff[3];

		// c) Write code to add the Staff objects created in a) to staffArr.
		staffArr[0] = staff1;
		staffArr[1] = staff2;
		staffArr[2] = staff3;

		// d) Write code to call the showAllStaffNames method to display all
		// staff names.
		showAllStaffNames(staffArr); //StaffArray.showAllStaffNames(staffArr);	
	}

	public static void showAllStaffNames(Staff[] staffArr) {

		// e) Using a for loop, write code to display all staff names.
		for (int i = 0; i < staffArr.length; i++) {
			if(staffArr[i] != null)
				System.out.println(staffArr[i].getName());
		}
	}
}


