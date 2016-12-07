package chegg;

import java.util.Scanner;

public class Palindrome {

	private static int MAX_CHARS = 80;

	public static boolean isPalindrome(char[] a, int used) {

		int k = 0;
		/*
		 * checking given string is palindrome otr not checking first character
		 * and last character are same or not same for all character
		 */
		for (int i = used - 1; i >= 0; i--) {
			if (a[i] != a[k]) {
				return false;
			}
			k++;
		}

		return true;
	}

	public static void main(String args[]) {

		/* Scanner class for taking input */
		Scanner input = new Scanner(System.in);
		String phrase;

		while (true) {
			System.out.println("This program will test whatever text");
			System.out.println("you enter to see if is a palindrome");
			System.out.println("(reads the same backwards and forwards).");
			System.out.println("Enter text (just leters and blanks with a period at the end, please.");

			phrase = input.nextLine();
			if (phrase.length() > Palindrome.MAX_CHARS) {
				System.out.println("Too many characters: maximum is 80.");
			} else {

				char character[] = phrase.toLowerCase().toCharArray();

				Boolean flag = Palindrome.isPalindrome(character, character.length);
				if (flag) {
					System.out.println("YES, the phrase is a palindrome");
				} else {
					System.out.println("NO, the phrase is NOT a palindrome");
				}
				System.out.println("Would you like to test another String (y/n)?");
				String choice = input.next();
				input.nextLine();
				if (choice.equalsIgnoreCase("y")) {

				} else {
					System.exit(1);
				}
			}
		}
	}
}
