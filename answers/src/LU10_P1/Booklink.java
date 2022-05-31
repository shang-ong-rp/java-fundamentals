package LU10_P1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class Booklink {

	// TODO: L06 Booklink Task 1 - Create an ArrayList of Item objects named
	// items.
	private ArrayList<Item> items = new ArrayList<Item>();

	public static void main(String[] args) {
		Booklink bl = new Booklink();
		bl.start();
	}

	private void start() {

		// TODO: L06 Booklink Task 2 - Call the loadItems method.
		loadItems();

		int option = -1;

		while (option != 3) {

			menu();
			option = Helper.readInt("Enter choice > ");

			if (option == 1) {
				showAllItems();
			} else if (option == 2) {
				searchByCategory();
			} else if (option == 3) {
				System.out.println("Thank you for visiting Jenny's Booklink!");
			}
		}
	}

	private void menu() {
		// TODO: L06 Booklink Task 3 - Write code to create the menu.

		Helper.line(80, "=");
		System.out.println("JENNY'S BOOKLINK");
		Helper.line(80, "=");
		System.out.println("1. View All Items");
		System.out.println("2. Search Items By Category");
		System.out.println("3. Quit");
	}

	private void showAllItems() {
		// TODO: L06 Booklink Task 4 - Write code to display all item descriptions
		// and author from items.

		String output = String.format("%-35s%-10s\n", "ITEM DESCRIPTION", "CATEGORY");

		for (Item i : items) {
			output += String.format("%-35s%-10s\n", i.getDescription(), i.getInfo().getCategory());
		}
		System.out.println(output);
	}

	private void searchByCategory() {

		System.out.println("SEARCH BY CATEGORY");
		String searchStr = Helper.readString("Category name > ");

		// TODO: L06 Booklink Task 5 - Write code to display items in
		// the category entered by the user.

		String output = String.format("%-35s%-10s\n", "ITEM DESCRIPTION", "CATEGORY");
		boolean matchFound = false;
		for (Item i : items) {
			String category = i.getInfo().getCategory();
			if (category.toUpperCase().contains(searchStr.toUpperCase())) {
				output += String.format("%-35s%-10s\n", i.getDescription(), i.getInfo().getCategory());
				matchFound = true;
			}
		}

		if (matchFound == true) {
			System.out.println(output);
			
			// TODO: L06 Booklink Task 7 (Enhancement) - Write code to prompt the
			// user if the results of the search should be saved.
			// Call the saveSearch method if the results are to be saved.
			char saveOption = Helper.readChar("Do you wish to save this results? (Y/N) > ");

			if (saveOption == 'Y' || saveOption == 'y') {
				saveSearch(output);
			}		
		} else {
			System.out.println("No match found.");
		}
	}

	private void loadItems() {
		// TODO: L06 Booklink Task 6 - Write code to load the item information
		// from items.txt into the ArrayList of Book objects named items
		try {
			File file = new File("items.txt");
			FileReader fr = new FileReader(file);
			BufferedReader br = new BufferedReader(fr);

			String line = br.readLine();
			while (line != null) {

				String[] itemInfo = line.split(",");

				String description = itemInfo[0].trim();
				String category = itemInfo[1].trim();
				double price = Double.parseDouble(itemInfo[2].trim());

				ItemInfo a = new ItemInfo(category, price);
				Item b = new Item(description, a);

				items.add(b);
				line = br.readLine();
			}
			br.close();

		} catch (FileNotFoundException e) {
			System.out.println("The file could not be found :(");
		} catch (IOException io) {
			System.out.println("There was an error reading from the file.");
		}
	}

	// TODO: L06 Booklink Task 8 (Enhancement) - Create a private method that
	// returns nothing named saveSearch. This method takes in a String, and
	// writes this String value to a file.
	private void saveSearch(String itemsByCategory) {
		System.out.println("Writing to file...");

		try {

			File file = new File("itemsByCategory.txt");
			FileWriter fw = new FileWriter(file);
			BufferedWriter bw = new BufferedWriter(fw);

			bw.write(itemsByCategory);
			bw.close();

			System.out.println("File write successful!");

		} catch (IOException io) {
			System.out.println("There was an error writing to the file.");
		}
	}
}
