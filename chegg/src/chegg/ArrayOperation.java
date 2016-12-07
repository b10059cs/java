package chegg;

import java.util.Scanner;

public class ArrayOperation {
	/* input method implementation */
	public static double[] input() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter the size of array");
		int n = sc.nextInt();
		double number[] = new double[n];
		/* Inserting element to array */
		for (int i = 0; i < n; i++) {
			number[i] = sc.nextDouble();
		}
		/* printing array by calling print method */
		print(number);
		return number;
	}

	public static void print(double number[]) {
		/* Printing array */
		for (int i = 0; i < number.length; i++) {
			System.out.print(number[i] + " ");
		}
		System.out.println();

	}

	/* sqrtnumber method implemantation */
	public static void sqrtNumber(double number[]) {
		/* Printing sqrt of numbers */
		System.out.println("Square root of Number of an array");
		for (int i = 0; i < number.length; i++) {
			double num = Math.sqrt(number[i]);
			System.out.println(num);
		}
	}

	public static void main(String args[]) {
		/* Calling initaize array */
		double number[] = input();
		/* calling sqrtnumber */
		sqrtNumber(number);
	}
}
