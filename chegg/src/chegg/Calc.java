package chegg;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

/*Main class start*/
public class Calc {
	public static void main(String args[]) throws IOException {

		Scanner input = new Scanner(System.in);
		/* Variable declarations */
		String op1 = "+", op2 = "-", op3 = "*", op4 = "/";
		final String SENT = "-999";
		int max = 0, min = 0, lineCount = 0;

		System.out.println("==================");
		System.out.println("Simple Calculator");
		System.out.println("==================");
		/* Reading file path */
		File file = new File("/home/lalchand/Desktop/test.txt");
		BufferedReader br = new BufferedReader(new FileReader(file));
		String line;
		/* Reading file line by line */
		while (!(line = br.readLine()).equals(SENT)) {

			lineCount++;// increasing line count
			System.out.println("Operation: " + line);

			Scanner lineBreaker = new Scanner(line);

			int n1 = -1, n2 = -1, result = 0;
			/* Checking next number is integer or not */
			if (lineBreaker.hasNextInt()) {
				n1 = lineBreaker.nextInt();
			}
			/* For operator */
			String operator = lineBreaker.next();
			/* Second Operands */
			if (lineBreaker.hasNextInt()) {
				n2 = lineBreaker.nextInt();
			}
			/* Calculating result */
			if (n1 != -1 && n2 != -1) {
				if (operator.equals(op1)) {
					result = n1 + n2;
					System.out.println("Result :" + result);
				} else if (operator.equals(op2)) {
					result = n1 - n2;
					System.out.println("Result :" + result);
				} else if (operator.equals(op3)) {
					result = n1 * n2;
					System.out.println("Result :" + result);
				} else if (operator.equals(op4)) {
					if (n2 == 0) {
						System.out.println("division by zero is not valid");
					} else {
						result = n1 / n2;
						System.out.println("Result :" + result);
					}
				} else {
					System.exit(1);
				}
				/* For max and min value */
				if (max < result) {
					max = result;
				}
				if (lineCount == 1) {
					min = result;
				} else if (min > result) {
					min = result;
				}
				/* Printing debug information */
				System.out.println();
				System.out.println("Debug Information:");
				System.out.println("Number of lines read=" + lineCount);
				System.out.println("Current Max:" + max);
				System.out.println("Current Min:" + min);
				System.out.println();
			}
			lineBreaker.close();
		}

	}
}
