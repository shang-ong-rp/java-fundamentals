package LU10_P1;

public class DemoBankAccount {
	private String accountNo;
	private double balance;

	public DemoBankAccount(String a, double b) {
		accountNo = a;
		balance = b;
	}

	public String getAccountNo() {
		return accountNo;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double b) {
		balance = b;
	}

	public void display() {
		System.out.println("Account number: " + accountNo);
		System.out.println("Balance: $" + balance);
	}

}
