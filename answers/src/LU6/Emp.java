package LU6;

public class Emp extends Person {
	private int id;
	private String email;
	private double salary;
	
	public Emp(int id, String email, char gender, double salary) {
		super("", gender);
		this.id = id;
		this.email = email;
		this.salary = salary;
	}

	public int getId() {
		return id;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public double getSalary() {
		return salary;
	}
	
	public void displayInfo() {
		super.displayInfo();
		System.out.println("id field from Emp class: " + id);
		System.out.println("email field from Emp class: " + email);
		System.out.println("salary field from Emp class: " + salary);
	}
}
