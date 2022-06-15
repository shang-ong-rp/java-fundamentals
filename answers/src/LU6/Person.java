package EmpDemo;

public class Person {

	public String name;
	public char gender;
	
	public Person(String name, char gender) {
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
