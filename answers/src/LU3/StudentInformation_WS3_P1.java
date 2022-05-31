package LU3;
//Worksheet 3 Practice 1
public class StudentInformation_WS3_P1 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Exercise 4
		  String studentName;
		  int studentID = -1;
		  
		  System.out.println("Enter 0 for student ID to quit.");
		  
		  while(studentID != 0) {
			  studentID = Helper.readInt("Enter your student ID:  ");
			  studentName = Helper.readString("Enter your name: ");
			  System.out.println(studentID +" : " + studentName);
		  }
		  
		  System.out.println("Program ends");
		  
	}
}
