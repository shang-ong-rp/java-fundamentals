package LU6;

public class Demo_Person_WS6 {
	
	public String name;
	public char gender;
	
	public Demo_Person_WS6(String name, char gender) {
		this.name = name;
		this.gender = gender;
	}
	public String getName() {
		return name;
	}

	public char getGender() {
		return gender;
	}
	
	public void displayInfo() {
		System.out.println("name field from Person class: " + name);
		System.out.println("gender field from Person class: " + gender);
	}
}
