package LU10_P1;

import java.util.ArrayList;

public class DemoBank {

	// TODO: L06 Bank Task 1 - Create an ArrayList of BankCustomer objects named
	// customers
	private ArrayList<DemoBankCustomer> customers = new ArrayList<DemoBankCustomer>();

	public static void main(String[] args) {
		DemoBank bank = new DemoBank();
		bank.start();
	}

	private void start() {

		int option = -1;

		while (option != 3) {

			menu();
			option = Helper.readInt("Enter Choice > ");

			if (option == 1) {
				addCustomer();
			} else if (option == 2) {
				showAllCustomers();
			} else if (option == 3) {
				System.out.println("Thank you for using our service!");
			}
		}
	}

	private void menu() {
		Helper.line(60, "=");
		System.out.println("WELCOME TO JAVA BANK");
		Helper.line(60, "=");
		System.out.println("1. Add Customer");
		System.out.println("2. View all customers");
		System.out.println("3. Quit");
	}

	private void addCustomer() {

		String name = Helper.readString("Enter name > ");
		String accNum = Helper.readString("Enter account number > ");
		double balance = Helper.readDouble("Enter balance > $");

		// TODO: L06 Bank Task 2 - Add a new customer into customers.
		DemoBankCustomer newCustomer = new DemoBankCustomer(name, accNum, balance);
		customers.add(newCustomer);
	}

	private void showAllCustomers() {
		Helper.line(40, "=");
		System.out.println("SHOWING ALL CUSTOMERS");
		Helper.line(40, "=");

		// TODO: L06 Bank Task 3 - Using a loop, display all customer
		// information.
		for (DemoBankCustomer customer : customers) {
			customer.display();
			Helper.line(40, "-");
		}
	}

}
