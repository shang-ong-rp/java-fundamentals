package inheritance;

import java.util.ArrayList;
import java.util.Arrays;

public class EnhancedForLoop {

	public static void main(String[] args) {

		// Array Example
		String[] nameArray = { "Alice", "Bob", "Charlie", "Daisy" };

		// Standard for loop
		for (int i = 0; i < nameArray.length; i++) {
			System.out.println(nameArray[i]);
		}

		// Enhanced for loop
		for (String name : nameArray) {
			System.out.println(name);
		}

		// ArrayList Example
		ArrayList<String> nameList = new ArrayList<String>();

		nameList.addAll(Arrays.asList("Alice", "Bob", "Charlie", "Daisy"));

		// Standard for loop
		for (int i = 0; i < nameList.size(); i++) {
			System.out.println(nameList.get(i));
		}

		// Enhanced for loop
		for (String name : nameList) {
			System.out.println(name);
		}

		// Object example

		Student s1 = new Student("Alice", 18);
		Student s2 = new Student("Bob", 19);
		Student s3 = new Student("Charlie", 17);
		Student s4 = new Student("Daisy", 17);

		// Array Example
		Student[] studentArray = { s1, s2, s3, s4 };

		// Standard for loop
		for (int i = 0; i < studentArray.length; i++) {
			System.out.println(studentArray[i]);
		}

		// Enhanced for loop
		for (Student stud : studentArray) {
			System.out.println(stud.getName());
		}

		// ArrayList Example
		ArrayList<Student> studentList = new ArrayList<Student>();

		studentList.addAll(Arrays.asList(s1, s2, s3, s4));

		// Standard for loop
		for (int i = 0; i < studentList.size(); i++) {
			System.out.println(studentList.get(i).getName());
		}

		// Enhanced for loop
		for (Student stud : studentList) {
			System.out.println(stud.getName());
		}
	}
}
