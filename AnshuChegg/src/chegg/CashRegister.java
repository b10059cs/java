package chegg;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;

public class CashRegister {

	/* Class variable declaration */
	private String barCode;
	private String name;
	private double price;
	private String category;
	/* Object creation of map to store element */
	Map<String, CashRegister> items = new HashMap<>();;
	Scanner input = new Scanner(System.in);

	/*
	 * Default constructor
	 */
	public CashRegister() {

	}

	public void addItem() throws Exception {
		CashRegister item = new CashRegister();
		String categoryChoice;
		/* for reading\n */
		input.nextLine();// It read \n because we are using nextLine in program

		System.out.println("Please Enter Barcode:");
		item.barCode = input.nextLine();
		System.out.println("Please Enter Name:");
		item.name = input.nextLine();
		System.out.println("Please Enter Cost:");
		item.price = input.nextDouble();

		System.out.println("Please Enter Category(A- Food, B-Clothes, C-Other):");
		categoryChoice = input.next();
		if (categoryChoice.equalsIgnoreCase("A")) {
			item.category = "Food";
		} else if (categoryChoice.equalsIgnoreCase("B")) {
			item.category = "Clothes";
		} else if (categoryChoice.equalsIgnoreCase("C")) {
			item.category = "Other";
		}
		if (items.get(item.barCode) != null) {
			throw new Exception("Item Already Exist Please Enter unique barcode");
		} else {

			/* Inserting element into map */
			items.put(item.barCode, item);
			System.out.println("item \"Barcode: " + item.barCode + ", Name: " + item.name + ", Cost:$" + item.price
					+ ", Category:" + item.category + "\"  is added in CashRegister");

		}
	}

	/* Displaying element based on barcode */
	public void dispalyAll() {
		/* Printing items from Map */
		System.out.println("You have selected to Display allItems stored in CashRegister");
		for (String key : items.keySet()) {
			CashRegister item = items.get(key);
			System.out.println("Barcode: " + item.barCode + ", Name: " + item.name + ", Cost:$" + item.price
					+ ", Category:" + item.category);
		}

	}

	public void updatePrice(String barCode, double price) {
		/*
		 * Getting item from map by barcode update the price again put into Map
		 */
		CashRegister item = items.get(barCode);
		item.price = price;
		items.put(barCode, item);

	}

	public void deleteItem(String barCode) {
		/*
		 * Removing cashRegister from map using barCode
		 */
		items.remove(barCode);

	}

	/*
	 * Displaying specific element from Map using barcode
	 */
	public void dispalyItem(String barCode) {
		/* Getting Element from Items Map */
		CashRegister item = items.get(barCode);
		/* Printing Element details */
		System.out.println("Barcode: " + item.barCode + ", Name: " + item.name + ", Cost:$" + item.price + ", Category:"
				+ item.category);

	}

	public static void main(String[] args) {

		/* Variable declaration */
		String choice;
		String name, barcode, category;
		double price;
		String categoryChoice;

		/* Creating object of CashRegister class */
		CashRegister cashRegister = new CashRegister();

		Scanner input = new Scanner(System.in);

		while (true) {
			System.out.print("1. Add new Item in CashRegister\n2. Update price for Item in CashRegister\n"
					+ "3. Delete Item from CashRegister\n" + "4. Display all Items stored in CashRegister\n"
					+ "5. Display item details (ask for barcode)\n" + "6. Exit\n");

			choice = input.next();

			switch (choice) {

			case "1":
				try {
					cashRegister.addItem();
				} catch (Exception e) {
					System.out.println(e.getMessage());
				}
				break;
			case "2":
				input.nextLine();// It read \n because we are using nextLine in
									// program
				System.out.println("Please Enter the barcode");
				barcode = input.nextLine();
				System.out.println("Pleae Enter new price");
				price = input.nextDouble();
				input.nextLine();
				cashRegister.updatePrice(barcode, price);
				break;
			case "3":
				input.nextLine();// It read \n because we are using nextLine in program
				System.out.println("Please enter the barcode");
				barcode = input.nextLine();
				cashRegister.deleteItem(barcode);
				break;
			case "4":
				cashRegister.dispalyAll();
				break;
			case "5":
				System.out.println("Please Enter the barcode");
				barcode = input.next();
				cashRegister.dispalyItem(barcode);
				break;
			case "6":
				System.out.println("Are you sure you want to Exit(y/n)?");
				String ch = input.next();
				if (ch.equalsIgnoreCase("y")) {
					System.out.println("Good Bye Have a Nice Day! ");
					System.exit(1);
				}
				break;
			default:
				System.out.println("Please Enter valid choice");
				break;

			}
		}

	}

}
