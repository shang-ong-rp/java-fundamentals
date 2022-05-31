package LU10_P1;

public class DemoBankCustomer {

	private String name;
	private DemoBankAccount account;

	public DemoBankCustomer(String n, DemoBankAccount a) {
		name = n;
		account = a;
	}

	public DemoBankCustomer(String n, String accNum, double balance) {
		name = n;
		account = new DemoBankAccount(accNum, balance);
	}

	public DemoBankAccount getAccount() {
		return account;
	}

	public String getName() {
		return name;
	}

	public void display() {
		System.out.println("Customer Name: " + name);
		account.display();
	}
}
