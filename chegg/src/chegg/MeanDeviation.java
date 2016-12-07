package chegg;

import java.util.Scanner;

public class MeanDeviation {

	/*
	 * Calculation for mean total sum of number/ total number
	 */
	public double mean(int number[]) {
		/* Variable declarations */
		double sum = 0, mean;
		/* For loop for calculating sum */
		for (int i = 0; i < number.length; i++) {
			sum += number[i];
		}
		/* Calculating mean */
		mean = sum / number.length;

		return mean;
	}

	/* Standard Deviation method */
	public double standardDeviation(int number[], double mean) {
		/* Variable declaration */
		double sum = 0;
		/* For loop for calculating sum of squares of number-mean */
		for (int i = 0; i < number.length; i++) {

			double num = number[i] - mean;
			sum += (num * num);

		}
		/* Calculating deviation */
		double deviation = Math.sqrt(sum / number.length);

		return deviation;
	}

	public static void main(String[] args) {
		/* Scanner class for input */
		Scanner input = new Scanner(System.in);
		/* Class object creation */
		MeanDeviation meanDeviation = new MeanDeviation();
		System.out.println("Please Enter the total number");
		int N = input.nextInt();
		/* Creating array of integer */
		int number[] = new int[N];
		/* Taking numbers from user */
		for (int i = 0; i < N; i++) {
			System.out.println("Please Enter " + (i + 1) + " Number");
			number[i] = input.nextInt();
		}
		/* calling mean method for mean calculation */
		double mean = meanDeviation.mean(number);
		System.out.println("Mean of Given Number is " + mean);

		double deviation = meanDeviation.standardDeviation(number, mean);
		System.out.println("Standard Deviation of Given Number is " + String.format("%.2f", (double) deviation));
	}

}
