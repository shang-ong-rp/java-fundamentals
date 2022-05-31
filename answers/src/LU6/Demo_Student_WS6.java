package LU6;

public class Demo_Student_WS6 extends Demo_Person_WS6 {

	int id;
	String school;
	
	public Demo_Student_WS6(String name, char gender, int id, String school) {
		super(name,gender);
		this.id = id;
		this.school = school;
	}
	
	public int getId() {
		return id;
	}

	public String getSchool() {
		return school;
	}
	
	public void displayInfo() {
		super.displayInfo();
		System.out.println("id field from Student class: " + id);
		System.out.println("school field from Student class: " + school);
	}
}
