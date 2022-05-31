package LU2;
import Helper;

public class ex_ifelse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Enter 3 Integrate Numbers and I'll sum them.");
		int score = Helper.readInt("Enter score > ");
		char grade = ' ';
		
		// use nested if-else statements to assign grade based on score
		if (score >= 90)
			grade = 'A';
		else{
			if (score >= 80)
				grade = 'B';
			else{
				if (score >= 70)
					grade = 'C';
				else{
					if (score >= 60)
						grade = 'D';
					else
						grade = 'F';
				}
			}
		}	
			
		// use if-else if-if statements to assign grade based on score
//		if (score >= 90)
//			grade = 'A';
//		else if (score >= 80)
//			grade = 'B';
//		else if (score >= 70)
//			grade = 'C';
//		else if (score >= 60)
//			grade = 'D';
//		else
//			grade = 'F';
		
		System.out.println("Grade is " + grade);

	}
}
