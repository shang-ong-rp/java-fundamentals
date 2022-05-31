package Classes;

public class Person {

	public double amount;

	public Person(double amount) {
		this.amount = amount;
	}

	public boolean spend(double moneyOut) {
		boolean enoughMoney = false;
		if (moneyOut <= amount) {
			amount = amount - moneyOut;
			enoughMoney = true;
		}
		return enoughMoney;
	}

	public void showMoney() {
		System.out.println(String.format("I have $%.2f at the moment", amount));
	}
}

//
//
//public void earn(double moneyIn) {
//	amount += moneyIn;
//}