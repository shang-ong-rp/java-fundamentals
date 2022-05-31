package LU4;

// Methods WS4 P3 Exercise 1
public class StudentInfoMethod_WS4_P3 {

	public static void printStudentInfo(String studentName, String zone, int curYear) {
		System.out.println("Student: " + studentName);
		System.out.println("Zone: " + zone);
		System.out.println("Current Year of Study: " + curYear);
		System.out.println();
	}

	public static void main(String[] args) {

		//Exercise 1
		String studentName = "James";
		String zone = "Bukit Batok";
		int curYear = 3;
		printStudentInfo(studentName,zone,curYear);
				
		studentName = "Nancy Kark";
		zone = "Jurong East";
		curYear = 2;
		printStudentInfo(studentName,zone,curYear);
	}
}
