package LU5;

public class EZLinkCard_WS5_P1 {
	public String cardNumber;
	public double balance;
	/*
	public EZLinkCard_WS5_P1(String ez_cardNumber, double ez_balance) {
		cardNumber = ez_cardNumber;
		balance =  ez_balance;
	}*/
	public EZLinkCard_WS5_P1(String cardNumber, double balance) {
		this.cardNumber = cardNumber;
		this.balance =  balance;
	}
	
	
	public void topup(double value) {
		balance = balance + value;
	}

	public void deduct(double value) {
		balance = balance - value;
	}
	
	public void display() {
		
		System.out.println("cardNumber: " + cardNumber);
		System.out.println("balance: " + balance);
		System.out.println();
	}
}
