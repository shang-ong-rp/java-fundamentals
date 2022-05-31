package LU6;

public class Demo_Facilitator_WS6 extends Demo_Person_WS6 {
	
	String email;
	String qualifications;
	int pay;
	
	public Demo_Facilitator_WS6(String name, char gender, String email, String qualifications, int pay) {
		super(name, gender);
		this.email = email;
		this.qualifications = qualifications;
		this.pay = pay;
	}
	
	public String getEmail() {
		return email;
	}
	
	public String getQualifications() {
		return qualifications;
	}
	
	public int getPay() {
		return pay;
	}
	
	public void displayInfo() {
		super.displayInfo();
		System.out.println("email field from Facilitator class: " + email);
		System.out.println("qualifications field from Facilitator class: " + qualifications);
		System.out.println("pay field from Facilitator class: " + pay);
	}
}
