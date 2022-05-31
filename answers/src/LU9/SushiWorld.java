package LU9;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class SushiWorld {

	public static void main(String[] args) {

		ArrayList<Item> itemList = load();

		int option = -1;

		while (option != 5) {

			menu();
			option = Helper.readInt("Enter choice > ");
			if (option == 1) {
				viewAllItems(itemList);
			} else if (option == 2) {
				addItem();
				itemList = load();
			} else if (option == 3) {
				getMostExpensive(itemList);
			} else if (option == 4) {
				getCheapest(itemList);
			} else if (option == 5) {
				System.out.println("Thank you for using Sushi World!");
			} else {
				System.out.println("Invalid option!");
			}

		}
	}

	private static void menu() {
		Helper.line(70, "-");
		System.out.println("WELCOME TO SUSHI WORLD");
		Helper.line(70, "-");
		System.out.println("1. View all items");
		System.out.println("2. Add item ");
		System.out.println("3. Most expensive item");
		System.out.println("4. Cheapest item");
		System.out.println("5. Quit");
	}

	private static ArrayList<Item> load() {
		/*
		 * The load() method's goal is to load the contents of a text file,
		 * parse it and create entries the corresponding sushis.
		 */
		
		ArrayList<Item> itemList = new ArrayList<Item>();

		try {

			File file = new File("D:\\Modules\\Java_CET\\Fundamentals of Java Programming\\Course Material\\4 Participant Handouts\\answers\\src\\LU9\\sushi.txt");
			FileReader fr = new FileReader(file);
			BufferedReader br = new BufferedReader(fr);

			String line = br.readLine();

			while (line != null) {

				String[] itemInfo = line.split(",");
				Item item = new Item(itemInfo[0], Double.parseDouble(itemInfo[1]));
				itemList.add(item);
				line = br.readLine();
			}
			br.close();
		} catch (FileNotFoundException e) {
			System.out.println("The file could not be found :(");
		} catch (IOException io) {
			System.out.println("There was an I/O error.");
		}
		return itemList;
	}

	private static void viewAllItems(ArrayList<Item> itemList) {
		String output = "";
		output += String.format("%-20s%-10s\n", "ITEM", "PRICE");

		for (Item i : itemList) {
			output += String.format("%-20s%-10.2f\n", upperFirstLetter(i.getType()),
			i.getPrice());
		}
		System.out.println(output);
	}

	private static void addItem() {
		/*
		 * The addItem() method's goal is to allow users to add a sushi to the menu.
		 * Export to CSV format.
		 */

		String itemType = Helper.readString("Enter new item type > ");
		double itemPrice = Helper.readDouble("Enter new item price > $");

		try {
			File file = new File("D:\\Modules\\Java_CET\\Fundamentals of Java Programming\\Course Material\\4 Participant Handouts\\answers\\src\\LU9\\sushi.csv");
			FileWriter fw = new FileWriter(file, true);
			BufferedWriter bw = new BufferedWriter(fw);
			bw.write(String.format("\n%s,%f", itemType, itemPrice));
			bw.close();
		} catch (IOException io) {
			io.printStackTrace();
		}
	}

	private static void getMostExpensive(ArrayList<Item> itemList) {
		Item mostExp = itemList.get(0);

		for (Item i : itemList) {
			if (mostExp.getPrice() < i.getPrice()) {
				mostExp = i;
			}
		}

		System.out.println(String.format("The most expensive item is the %s. It costs $%.2f", mostExp.getType(),
				mostExp.getPrice()));
	}

	private static void getCheapest(ArrayList<Item> itemList) {
		Item cheapest = itemList.get(0);

		for (Item i : itemList) {
			if (cheapest.getPrice() > i.getPrice()) {
				cheapest = i;
			}
		}

		System.out.println(String.format("The cheapest item is the %s. It costs $%.2f", cheapest.getType(),
				cheapest.getPrice()));
	}

	private static String upperFirstLetter(String str) {

		String[] words = str.split(" ");

		String updated = "";

		for (String s : words) {

			updated += s.substring(0, 1).toUpperCase();
			updated += s.substring(1).toLowerCase();
			updated += " ";
		}

		return updated;
	}
}

// enhancement
// private static String upperFirstLetter(String str) {
//
// String[] words = str.split(" ");
//
// String updated = "";
//
// for (String s : words) {
//
// updated += s.substring(0, 1).toUpperCase();
// updated += s.substring(1).toLowerCase();
// updated += " ";
//
// }
//
// return updated;
//
// }

// private static void calcAveragePrice(ArrayList<Item> itemList) {
// double sum = 0.0;
//
// for (Item i : itemList) {
// sum += i.getPrice();
// }
//
// int itemCount = itemList.size();
//
// double average = sum / itemCount;
//
// System.out.println(String.format("Average price of items: $%.2f", average));
// }
