package chegg;

public class TrianglePrinting {
	/*
	 * Printing triangle print pattern1 according question
	 */
	public static void pattern1(int number) {
		/* For loop start outer */
		for (int i = 0; i < number; i++) {
			/* Printing space */
			/* for loop inner start for space */
			for (int space = 0; space < i; space++) {
				System.out.print(" ");
			}
			/* for loop inner End for space */
			/* Printing star */
			/* for loop start for star */
			for (int star = i; star < number; star++) {
				System.out.print("*");
			}
			/* for loop End for star */
			System.out.println();// for new line
		}

	}

	/*
	 * Printing triangle print pattern2 according question
	 */
	public static void pattern2(int number) {
		/* For loop start outer */
		for (int i = number - 1; i >= 0; i--) {
			/* Printing space */
			/* for loop inner start for space */
			for (int space = 0; space < i; space++) {
				System.out.print(" ");
			}
			/* for loop inner End for space */
			/* Printing star */
			/* for loop start for star */
			for (int star = i; star < number; star++) {
				System.out.print("*");
			}
			/* for loop End for star */
			System.out.println();// for new line
		}

	}
}
