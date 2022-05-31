package LU7;
import java.util.ArrayList;

/*
 * I declare that this code was written by me. 
 * I will not copy or allow others to copy my code. 
 * I understand that copying code is considered as plagiarism.
 * 
 * Student Name: Bobo Chan
 * Student ID: 12345
 * Class: W68X
 * Date/Time created: Saturday 26-12-2020 16:23
 */

public class DemoEncapsulationArrayList {
	public static void main(String[] args) {

		// Creating Car objects
		Car myLexus = new Car("SFT789X", "red", 50);
		Car myBMW = new Car("JB345M", "blue", 50);
		Car myMerc = new Car("KL123K", "white", 10);

		// Declaring and creating an ArrayList of Car objects
		ArrayList<Car> carList = new ArrayList<Car>();

		// Add
		carList.add(myLexus);
		carList.add(myBMW);
		carList.add(myMerc);

		// Display all Car license plates in the ArrayList
//		for (int x = 0; x < carList.size(); x++) {
//			System.out.println(carList.get(x).licenseNo);  //error
//		}
		
		//Display all Car license plates in the ArrayList with encapsulation
		for (int i = 0; i < carList.size(); i++) {

			System.out.println(carList.get(i).getLicenseNo());
		}


	}
}


