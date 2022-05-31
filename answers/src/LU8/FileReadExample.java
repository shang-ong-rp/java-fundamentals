package LU8;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReadExample {

	public static void main(String[] args) {

		try {

			File fileName = new File("D:\\\\Modules\\\\Java_CET\\\\Fundamentals of Java Programming\\\\Course Material\\\\4 Participant Handouts\\\\answers\\\\src\\\\Helper.java");
			BufferedReader inputStream = new BufferedReader(new FileReader(fileName));
			String line = inputStream.readLine();
			if(line != null)
				System.out.println("The contents of " + fileName + " is:");
			while (line != null) {
				System.out.println(line);
				line = inputStream.readLine();
			}
			inputStream.close();

		} catch (FileNotFoundException e) {
			// e.printStackTrace();
			System.out.println("The file could not be found :(");
		} catch (IOException io) {
			// io.printStackTrace();
			System.out.println("There was an I/O error.");
		}
	}
}
