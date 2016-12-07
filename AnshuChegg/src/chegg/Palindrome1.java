package chegg;

import java.util.Scanner;

public class Palindrome1 {
	/* method is used for checking given char array is Palindrome or not */
	public static boolean isPalindrome(char[] a) {
		char[] original;
		original = removeBlanks(a).clone();
		a = reverse(original);

		if (String.valueOf(a).contentEquals(String.valueOf(original))) {
			return true;
		}
		return false;

	}

	/*
	 * Removing blank space from char array first converting char array to
	 * String Then replace all blank and white spaces from string Then convert
	 * back to char array
	 */
	private static char[] removeBlanks(char[] a) {
		/* Converting char array to String */
		String line = String.valueOf(a);
		/* Removing Blank spaces from string */
		String lineWithoutSpaces = line.replaceAll("\\s+", "");
		/* Converting String into char array */
		a = lineWithoutSpaces.toCharArray();
		return a;

	}

	/*
	 * Reversing string first convert char array to string Then using String
	 * buffer we reversed the string then convert back to char array and
	 * returned that char array
	 */
	private static char[] reverse(char[] a) {
		/* Converting char array to String */
		String line = String.valueOf(a);
		StringBuffer buffer = new StringBuffer(line);
		buffer.reverse();
		a = buffer.toString().toCharArray();
		return a;

	}

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		while (true) {
			/* Prompt for reading input from user */
			System.out.println("Please Enter the string");
			String line = input.nextLine();
			/* getting index of . */
			int period = line.indexOf(".");
			/* Getting sub string */
			String toCheck = line.substring(0, period).toLowerCase();
			/* Converting into char array */
			char[] ca = toCheck.toCharArray();

			/* Calling removeBlanks method */

			Boolean flag = Palindrome1.isPalindrome(ca);
			/*
			 * If returned flag is true the given input is palindrome otherwise
			 * it is not
			 */
			if (flag) {
				System.out.println("The Input is a Palindrome");
			} else {
				System.out.println("The Input is not a Palindrome");
			}
			/* Prompt for user input on loop condition */
			System.out.println("Do u want to test another string(yes or quit)");
			String choice = input.nextLine();
			if (choice.equalsIgnoreCase("quit")) {
				System.exit(1);
			}

		}

	}

}
