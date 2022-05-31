package LU7;

public class Staff {

	private String name;
	private int age;

	public Staff(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		//this.age = age;

		if (checkAge(age) == true) {
			this.age = age;
		} else {
			System.out.println("Invalid age");
		}
	}

	private boolean checkAge(int age) {

		boolean isValid = false;

		if (age >= 13 && age <= 62) {
			isValid = true;
		}

		return isValid;
	}
	
	public void display() {
		System.out.println("Name    : " + name);
		System.out.println("Age     : " + age);
	}
}

