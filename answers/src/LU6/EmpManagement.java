package EmpDemo;

import java.util.ArrayList;
import java.util.Arrays;
public class EmpManagement {
	
	public static void main(String[] args) {
	
		ArrayList<Emp> employeeList = new ArrayList<Emp>();
		employeeList.add(new Emp(854, "alice@hotmail.com", 'f', 3500.00));
		employeeList.add(new Emp(863, "bob@gmail.com", 'm', 3000.00));
		employeeList.add(new Emp(855, "chip@singtel.sg", 'm', 5000.00));
		employeeList.add(new Emp(843, "denise@gmail.com", 'f', 6500.00));
		employeeList.add(new Emp(871, "eddy@m1.com.sg", 'm', 6000.00));

		ArrayList<Integer> employeeIDs = new ArrayList<Integer>();
		employeeIDs.add(854);
		employeeIDs.add(863);
		employeeIDs.add(855);
		employeeIDs.add(843);
		employeeIDs.add(871);

		int option = 0;

		while (option != 7) {

			menu();
			option = Helper.readInt("Enter option > ");

			if (option == 1) {

				Helper.line(50, "-");
				System.out.println("ENTER NEW EMPLOYEE DETAILS");

				int id = Helper.readInt("Enter id > ");
				String email = Helper.readString("Enter email > ");
				char gender = Helper.readChar("Enter gender (m/f) > ");
				double salary = Helper.readDouble("Enter salary > $");

				employeeList.add(new Emp(id, email, gender, salary));
				employeeIDs.add(id);
				System.out.println("***Employee added!");

			} else if (option == 2) {

				int selectedID = Helper.readInt("Enter employee ID to update > ");

				Helper.line(50, "-");
				System.out.println("Selected ID: " + String.format("%d",selectedID));
				Helper.line(50, "-");

				int idIndex = -1;

				for (int idx = 0; idx < employeeList.size(); idx++) {
					if (employeeList.get(idx).getId() == selectedID) { 
						idIndex = idx; 
						break;
					}
				}
				
				if (idIndex < 0) {
					System.out.println("***Invalid employee ID!");
				} else {
					String newEmail = Helper.readString("Enter new email > ");
					if(isValid(newEmail)) {
						employeeList.get(idIndex).setEmail(newEmail);
						System.out.println("***Employee email updated!");
						employeeList.get(idIndex).displayInfo();
					} else {
						System.out.println("***Invalid email format!");
					}
				}

			} else if (option == 3) {

				String empOutput = String.format("%-5s %-20s %-10s %-10s \n", "ID", "PERSONAL EMAIL", "GENDER", "SALARY");

				Helper.line(50, "-");

				for (Emp emp : employeeList) {
					empOutput += String.format("%-5d %-20s %-10c $%-10.2f \n", emp.getId(), emp.getEmail(), emp.getGender(), emp.getSalary());
				}

				System.out.println(empOutput);

			} else if (option == 4) {

				Helper.line(50, "-");

				for (Emp emp : employeeList) {
					emp.displayInfo();
				}
			} else if (option == 5) {
				
				char selectedGender = Helper.readChar("Enter gender of staff to display (m/f) > ");

				Helper.line(50, "-");
				System.out.println("Selected Gender: " + String.format("%c",selectedGender));
				Helper.line(50, "-");
				String empOutput = String.format("%-5s %-20s %-10s %-10s \n", "ID", "PERSONAL EMAIL", "GENDER", "SALARY");

				for (Emp emp : employeeList) {
					if (emp.getGender() == selectedGender) {
						empOutput += String.format("%-5d %-20s %-10c $%-10.2f \n", emp.getId(), emp.getEmail(), emp.getGender(), emp.getSalary());
					}
				}

				System.out.println(empOutput);
				
			} else if (option == 6) {

				int selectedID = Helper.readInt("Enter employee ID to update > ");

				Helper.line(50, "-");
				System.out.println("Selected ID: " + String.format("%d",selectedID));
				Helper.line(50, "-");

				int idIndex = employeeIDs.indexOf(selectedID);
				
				if (idIndex == -1) {
					System.out.println("***Invalid employee ID!");
				} else {
					String newEmail = Helper.readString("Enter new email > ");
					if(isValid(newEmail)) {
						employeeList.get(idIndex).setEmail(newEmail);
						System.out.println("***Employee email updated!");
						System.out.println(Arrays.toString(employeeIDs.toArray()));
						employeeList.get(idIndex).displayInfo();
					} else {
						System.out.println("***Invalid email format!");
					}
				}

			} else if (option == 7) {

				System.out.println("Thank you for using Employee Management Program!");

			} else {
				System.out.println("***Invalid option!");
			}
		}
	}

	private static void menu() {
		Helper.line(60, "=");
		System.out.println("WELCOME TO HUNNYBEE EMPLOYEE MANAGEMENT PROGRAM");
		Helper.line(60, "=");
		System.out.println("1. Add New Employee");
		System.out.println("2. Update Employee Personal Email");
		System.out.println("3. View Employee List");
		System.out.println("4. Display Info of Classes");
		System.out.println("5. Filter Employees by Gender");
		System.out.println("6. Update Employee Email (2nd Method)");
		System.out.println("7. Quit");
	}

	private static boolean isValid(String email) {
		if (email.indexOf('@') == -1) {
			return false;
		} else if (email.indexOf('.', email.indexOf('@')) == -1) {
			return false;
		} else {
			return true;
		}
	}

}
