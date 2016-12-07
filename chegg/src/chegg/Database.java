package chegg;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Database {

	private static final int maxarraysize = 50;
	// Attributes
	private Storm[] stormArr;
	private int add;

	/**
	 * Constructor Accepts a file and attempts to read it Fills the storm array
	 * with the data
	 */
	public Database(File fileName) {
		// Initialize array
		this.stormArr = new Storm[maxarraysize];
		this.add = 0;

		// Scanner to read from the file
		Scanner scan = new Scanner(System.in);
		try {
			scan = new Scanner(fileName);

			// Read data from the file
			while (scan.hasNextLine()) {
				// Year of storm/ Name of storm/ mmdd storm started/ mmdd storm
				// ended/ magnitude of storm
				String line = scan.nextLine();
				String[] stormdata = line.split("/");
				if (stormdata.length < 5)
					System.out.println("Database entry not in the correct format: " + line);

				// Add data to array
				this.stormArr[this.add] = new Storm(stormdata[1], Integer.parseInt(stormdata[0]), stormdata[2],
						stormdata[3], Integer.parseInt(stormdata[4]));
				this.add += 1;
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}

	/**
	 * Returns a storm array which matches the name
	 *
	 * @param name
	 */
	public void getStormsByName(String name) {
		boolean found = false;
		for (Storm storm : stormArr) {
			if ((storm != null) && (storm.getStormName().equalsIgnoreCase(name))) {
				found = true;
				System.out.print(storm);
			}
		}

		if (!found)
			System.out.println("\"" + name + "\" was not found as a storm name.");
	}

	/**
	 * Returns a storm array which matches the year
	 *
	 * @param year
	 */
	public void getStormsByYear(int year) {
		boolean found = false;
		for (Storm storm : stormArr) {
			if ((storm != null) && (storm.getStormYear() == year)) {
				found = true;
				System.out.print(storm);
			}
		}

		if (!found)
			System.out.println("\"" + year + "\" was not found as a storm year.");
	}

	/**
	 * Prints all storm details
	 */
	public void printAll() {
		if (this.stormArr.length == 0)
			System.out.println("No data.");
		else {
			for (Storm storm : stormArr) {
				if (storm != null)
					System.out.print(storm);
			}
		}
	}

}
