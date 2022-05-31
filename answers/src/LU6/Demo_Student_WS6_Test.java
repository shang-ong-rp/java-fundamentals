package LU6;

public class Demo_Student_WS6_Test {
	
	public static void main(String[] args) {
		
		//Student
		Demo_Student_WS6 student = new Demo_Student_WS6("John M.", 'M', 84342, "Brook Seconday School");
		student.displayInfo();
		
		//Facilitator
		Demo_Facilitator_WS6 facilitator = new Demo_Facilitator_WS6("John M.", 'M', "john@email.add", "Brook Seconday School", 12345);
		facilitator.displayInfo();
		
	}
}
