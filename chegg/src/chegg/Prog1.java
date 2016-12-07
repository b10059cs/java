package chegg;

import java.io.File;
import java.util.Scanner;

public class Prog1 {

	/**
	 * Displays a list of commands for user
	 */
	public static void printCommands() {
		System.out.println("Welcome to the CS-102 Storm Tracker Program\n");
		System.out.println("Current available commands:\n");
		System.out.println("1. Search for a storm name");
		System.out.println("2. Search for a storm year");
		System.out.println("3. Print all storms");
		System.out.println("4. Exit");
	}

	public static void main(String args[]) {

		File file = new File("/home/lalchand/Desktop/chegg/input.txt");
		if (!file.exists()) // Check if file is there

			System.out.println("file does not exist.");
		else {
			// Create Database object
			Database db = new Database(file);
			// Scanner to get user input
			Scanner scan = new Scanner(System.in);
			// Variable to get user command
			int cmd = 0;

			// Start
			while (true) {
				printCommands();

				System.out.print("Your choice? ");
				cmd = scan.nextInt();
				scan.nextLine();
				// look up storm name
				if (cmd == 1) {
					System.out.println("Print out storm name: ");
					String name = scan.nextLine();
					db.getStormsByName(name);
				}
				// look up storm year
				else if (cmd == 2) {
					System.out.println("Print out storm year: ");
					int year = scan.nextInt();
					db.getStormsByYear(year);
				}
				// prints out the data
				else if (cmd == 3) {
					db.printAll();
				}
				// shuts down program
				else if (cmd == 4) {
					scan.close();
					System.exit(0);
				} else {
					System.out.println("Please select command 1-4");
				}
				System.out.println();
			}
		}
	}

}
