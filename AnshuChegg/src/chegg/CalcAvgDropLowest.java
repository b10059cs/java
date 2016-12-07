package chegg;

import java.util.Arrays;
import java.util.Scanner;

public class CalcAvgDropLowest {

	public static void main(String[] args) {
		/* Scanner class for taking input from user */
		Scanner input = new Scanner(System.in);
		int len = args.length;
		/*
		 * checking length of provided numbers must be greater then or equal to
		 * 5 or less then 10
		 */
		if (len >= 5 && len <= 10) {
			double[] numbers = new double[len];
			/* Prompt for lowest numbers dropped before avg calculation */
			System.out.println("How many of the lowest values should be dropped before calculating the average");
			int n = input.nextInt();
			System.out.print("Given the numbers ");
			/* Inserting element into numbers array */
			for (int i = 0; i < len; i++) {
				numbers[i] = Double.parseDouble(args[i]);
				System.out.print(numbers[i] + " ");
			}
			/* Sorting array usng sort method of Arrays class */
			Arrays.sort(numbers);

			double sum = 0.0;
			/* not including first n number in avg calculation */
			for (int i = 0; i < len; i++) {
				if (i >= n) {
					sum += numbers[i];
				}
			}
			System.out.println(
					"The average of all the numbers except the lowest " + n + " numbers is " + (sum / (len - n)));

		} else {
			System.out.println("Please provide total numbers 5 to 10");
		}

	}

}
