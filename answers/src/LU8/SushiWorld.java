package LU8;

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
		ArrayList<Item> itemList = new ArrayList<Item>();

		/*
		 * The load() method's goal is to load the contents of a text file,
		 * parse it and create entries the corresponding sushis.
		 */
		
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
		 */

		String itemType = Helper.readString("Enter new item type > ");
		double itemPrice = Helper.readDouble("Enter new item price > $");

		
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
