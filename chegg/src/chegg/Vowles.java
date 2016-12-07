package chegg;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;

public class Vowles {
	public static void main(String args[]) {
		/* creating instance variable of List */
		List<String> letters = new ArrayList<String>();
		/* vowels instance variable for holding vowels */
		List<String> vowels = new ArrayList<String>();
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
		System.out.println("Please enter the letters with comma seperated");
		String input = scanner.nextLine();
		/* closing scanner object */
		scanner.close();

		String[] letter = input.split(",");

		/* Inserting letters into List */
		for (String values : letter) {
			letters.add(values);
		}

		/* ListIterator for iterating list */
		ListIterator<String> itr = letters.listIterator();
		while (itr.hasNext()) {
			String val = itr.next();
			/* checking if value is any vowels */
			if (val.equals("a") || val.equals("e") || val.equals("i") || val.equals("o") || val.equals("u")) {
				/* If vowels already exist in tree map */
				if (map.containsKey(val)) {
					Integer value = map.get(val);
					map.put(val, ++value);
					vowels.add(val);
				} else {
					map.put(val, 1);
					vowels.add(val);
				}
			}
		}
		/* Removing all element from letters list */
		letters.removeAll(letters);
		/* Getting size of vowels */
		int listSize = vowels.size();

		System.out.println("There are " + listSize + " vowels in the list:");
		/* Iterating treeMap */

		Set<String> keys = map.keySet();
		for (String key : keys) {
			System.out.print(key + "- " + map.get(key) + " ");
		}

	}

}
