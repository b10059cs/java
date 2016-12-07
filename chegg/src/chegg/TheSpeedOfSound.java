package chegg;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TheSpeedOfSound {
	//variable declarations
	// unit for speed is feet per second
	public static final int AIRSPEED = 1100;//constant for air
	public static final int WATERSPEED = 4900;//constant for water
	public static final int STEELSPEED = 16400;//constant for steel

	//main method start
	public static void main(String[] args) {
		//creating list object for storing medium
		//it will check that user entered medium is in one of air,water,steel
		List<String> medium = new ArrayList<String>();
		//adding medium in list
		medium.add("air");
		medium.add("water");
		medium.add("steel");
		//variable declarations for input
		String material;
		int distance;
		Scanner input = new Scanner(System.in);
		//user input
		System.out.println("Enter one of the following: air, water, or steel: ");
		material = input.nextLine();
		//checking condition as given medium is air,water or steel
		if (medium.contains(material)) {
			System.out.println("Please enter distance in feet");
			distance = input.nextInt();

			if (material.equalsIgnoreCase("air")) {
				System.out.println("It will take " + (distance / TheSpeedOfSound.AIRSPEED) + " Seconds");
			} else if (material.equalsIgnoreCase("water")) {
				System.out.println("It will take " + (distance / TheSpeedOfSound.WATERSPEED) + " Seconds");
			}
			if (material.equalsIgnoreCase("steel")) {
				System.out.println("It will take " + (distance / TheSpeedOfSound.STEELSPEED) + " Seconds");
			}

		} else {
			System.out.println("Sorry, you must enter air, water, or steel.");
		}

	}
}
