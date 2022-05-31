package LU8;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class DemoFood {

	public static void main(String[] args) {

		try {

			File file = new File("D:\\Modules\\Java_CET\\Fundamentals of Java Programming\\Course Material\\4 Participant Handouts\\answers\\src\\LU8\\hawker_favourites.txt");
			FileReader fr = new FileReader(file);
			BufferedReader br = new BufferedReader(fr);

			String line = br.readLine();

			String output = String.format("%-15s%-10s\n", "HAWKER FOOD", "PRICE");

			while (line != null) {
				String[] foodInfo = line.split(",");

				output += String.format("%-15s%-10.2f\n", foodInfo[0], Double.parseDouble(foodInfo[1]));
				line = br.readLine();
			}

			br.close();

			System.out.println(output);

		} catch (FileNotFoundException e) {
			System.out.println("The file could not be found :(");
		} catch (IOException io) {
			System.out.println("There was an I/O error.");
		}
	}

}
