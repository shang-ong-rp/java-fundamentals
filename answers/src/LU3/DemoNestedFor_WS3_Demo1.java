package LU3;

//Worksheet 3 Demonstration code of a Nested Loop
public class DemoNestedFor_WS3_Demo1 {

	public static void main(String[] args) {
		
		String studentID = "";
		    
		while(studentID.equals("quit") != true) {
			Double total=0.0;
			int score;
			studentID = Helper.readString("Student ID or Enter 'quit' to exit:");
			if(studentID.equals("quit")!= true) {
				for(int i=1;i<6;i++){
					score = Helper.readInt("Enter test score " + i +": ");
					total = total + score;
				}
				System.out.println("The average score is " + total/5);
			}
		}
		System.out.println("Program exits");
		
	} // end Main
} // end Class
