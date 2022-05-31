package LU8;

import java.io.*;

public class DemoWriteFile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String fileName = null;  // outside try block, can be used in catch
		
	    try {
	    	fileName = Helper.readString("Enter file name: "); //Read user input
	    	
	    	//Create the file
	    	File f = new File(fileName + ".txt"); // Opening the file
	    	PrintWriter p1 = new PrintWriter(new FileWriter(f), true); // creating printWriter object by initiating fileWriter
	        
	    	// printing sample text
	    	p1.println("This is line 1"); 
	        p1.println("This is line 2.");

	        p1.close();
	        f.setReadOnly(); // changing the file operation to read-only
	        
	        System.out.print("File is created...");
	    	
	    }
	    catch(IOException e) {
	        System.out.println("Error writing to file " + fileName);
	        e.printStackTrace();
	    }

	}
}
