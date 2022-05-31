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

public class DemoEncapsulationArray {
	public static void main(String[] args) {

		// Creating Car objects
		Car myLexus = new Car("SFT789X", "red", 50);
		Car myBMW = new Car("JB345M", "blue", 50);
		Car myMerc = new Car("KL123K", "white", 10);

		// Declaring and creating an ArrayList of Car objects
		Car[] carArr = new Car[5];

		// Add
		carArr[0] = myLexus;
		carArr[1] = myBMW;
		carArr[2] = myMerc;

		//Display all Car license plates in the array 
		for (int i = 0; i < carArr.length; i++) {
			System.out.println(carArr[i].licenseNo); //error
			carArr[i].licenseNo = "dsdas";
		}

		//Display all Car license plates in the array with encapsulation
		for (int i = 0; i < carArr.length; i++) {
			if(carArr[i] != null)
				System.out.println(carArr[i].getLicenseNo());
		}
	}
}
