package LU6;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

public class EmpManagementEnhanced {

	public static void main(String[] args) {
		double hourlyRate = 10.80;
		
		DateTimeFormatter formatter1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		DateTimeFormatter formatter2 = DateTimeFormatter.ofPattern("dd MMMM yyyy");
		ArrayList<Emp> employeeList = new ArrayList<Emp>();
		employeeList.add(new FullTimer(544, "Alice", LocalDate.parse("10/01/1980", formatter1),
				LocalDate.parse("01/01/2010", formatter1), 3500.00));
		employeeList.add(new FullTimer(563, "Bobby", LocalDate.parse("12/09/1981", formatter1),
				LocalDate.parse("01/01/2012", formatter1), 3000.00));
		employeeList.add(new FullTimer(555, "Charlie", LocalDate.parse("09/10/1977", formatter1),
				LocalDate.parse("01/08/2008", formatter1), 5000.00));

		employeeList.add(new Freelancer(675, "Denise", LocalDate.parse("12/09/1981", formatter1),
				LocalDate.parse("01/01/2015", formatter1), 5));
		employeeList.add(new Freelancer(676, "Eddy", LocalDate.parse("05/06/1978", formatter1),
				LocalDate.parse("28/04/2015", formatter1), 8));

		LocalDate today = LocalDate.now();

		int option = 0;

		while (option != 4) {

			menu();
			option = Helper.readInt("Enter option > ");

			if (option == 1) {
				Helper.line(40, "-");
				System.out.println("EMPLOYEE TYPE");
				System.out.println("1. Full Timer");
				System.out.println("2. Freelancer");
				int empType = Helper.readInt("Enter type of employee > ");

				Helper.line(60, "-");
				System.out.println("ENTER NEW EMPLOYEE DETAILS");

				int id = Helper.readInt("Enter id > ");
				String name = Helper.readString("Enter name > ");
				String dob = Helper.readString("Enter date of birth in this format: dd/MM/yyyy > ");

				String dateJoined = Helper.readString("Enter date joined in this format: dd/MM/yyyy > ");
				LocalDate dobLD = LocalDate.parse(dob, formatter1);
				LocalDate dateJoinedLD = LocalDate.parse(dateJoined, formatter1);

				if (empType == 1) {
					double salary = Helper.readDouble("Enter salary > $");
					employeeList.add(new FullTimer(id, name, dobLD, dateJoinedLD, salary));
					System.out.println("***Full Timer added!");

				} else if (empType == 2) {
					int hoursWorked = Helper.readInt("Enter hours worked > ");

					employeeList.add(new Freelancer(id, name, dobLD, dateJoinedLD, hoursWorked));
					System.out.println("***Frelancer added!");

				} else {
					System.out.println("***Invalid employee type!");
				}

			} else if (option == 2) {

				String fullTimerOutput = String.format("FULL TIMERS\n%-5s %-10s %-25s %-25s %-10s \n", "ID",
						"NAME", "DOB", "DATE JOINED", "SALARY");

				String freelancerOutput = String.format("FREELANCERS\n%-5s %-10s %-25s %-25s %-15s %-15s\n", "ID",
						"NAME", "DOB", "DATE JOINED", "HOURLS WORKED", "SALARY");

				Helper.line(60, "-");

				for (Emp emp : employeeList) {

					if (emp instanceof FullTimer) {
						FullTimer ft = (FullTimer) emp;
						fullTimerOutput += String.format("%-5d %-10s %-25s %-25s  $%-10.2f \n", ft.getId(),
								ft.getName(), ft.getDateOfBirth().format(formatter2),
								ft.getDateJoined().format(formatter2), ft.getSalary());
					} else {
						Freelancer fl = (Freelancer) emp;
						freelancerOutput += String.format("%-5d %-10s %-25s %-25s %-15d $%-15.2f\n",
								fl.getId(), fl.getName(), fl.getDateOfBirth().format(formatter2),
								fl.getDateJoined().format(formatter2), fl.getHoursWorked(), 
								fl.getHoursWorked() * hourlyRate);
					}
				}

				System.out.println(fullTimerOutput);
				System.out.println(freelancerOutput);

			} else if (option == 3) {
				int yearsOfService = Helper.readInt("More than years of service > ");

				Helper.line(60, "-");
				System.out.println("EMPLOYEES WITH MORE THAN " + yearsOfService + " YEARS OF SERVICE: ");
				for (Emp emp : employeeList) {
					if (Period.between(emp.getDateJoined(), today).getYears() >= yearsOfService) {
						System.out.println(emp.getName());
					}
				}
			} else if (option == 4) {

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
		System.out.println("2. View Employee List");
		System.out.println("3. Search Employees by years of service");
		System.out.println("4. Quit");
	}
}
