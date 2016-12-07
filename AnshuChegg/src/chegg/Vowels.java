package chegg;

import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;

public class Vowels {
	public static void main(String args[]) {
		/* creating HashMap for storing vowels and count */
		TreeMap<String, Integer> map = new TreeMap<String, Integer>();
		/* Inserting vowels into treemap */
		map.put("a", 0);
		map.put("e", 0);
		map.put("i", 0);
		map.put("o", 0);
		map.put("u", 0);

		/*
		 * creating instance variable of Scanner class for taking input from
		 * console
		 */
		Scanner scanner = new Scanner(System.in);
		/*
		 * prompt for user input
		 */
		System.out.println("Please enter the String");
		String input = scanner.nextLine();
		/* closing scanner object */
		scanner.close();

		/* Converting into char array */
		char character[] = input.toCharArray();
		/* Iterating character array */
		for (int i = 0; i < character.length; i++) {
			String val = character[i] + "";
			if (val.equalsIgnoreCase("a") || val.equalsIgnoreCase("e") || val.equalsIgnoreCase("i")
					|| val.equalsIgnoreCase("o") || val.equalsIgnoreCase("u")) {
				/* If vowels already exist in tree map */

				if (map.containsKey(val.toLowerCase())) {
					Integer value = map.get(val.toLowerCase());
					map.put(val.toLowerCase(), ++value);

				} else {
					map.put(val.toLowerCase(), 1);

				}
			}

		}

		Set<String> keys = map.keySet();
		for (String key : keys) {
			System.out.print(key + "- " + map.get(key) + "\n");
		}

	}

}
