package LU8;

import java.io.*;

public class DemoFilenotfoundException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String fileName = null;  // outside try block, can be used in catch
		
	    try {
	    	fileName = Helper.readString("Enter file name: "); //Read user input
	    	
	        //Read the file
	        BufferedReader inputStream = new BufferedReader(new FileReader("D:\\Modules\\Java_CET\\Fundamentals of Java Programming\\Course Material\\4 Participant Handouts\\answers\\src\\" + fileName));
	        String line = null;
	        line = inputStream.readLine();
	        System.out.println("The first line in " + fileName + " is:");
	        System.out.println(line);
	        inputStream.close();
	    }
	    catch(FileNotFoundException e) {
	    	System.out.println("File " + fileName + " not found.");
	    }
	    catch(IOException e) {
	        System.out.println("Error reading from file " + fileName);
	    }

	}
}
