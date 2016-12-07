package chegg;

import java.util.Scanner;

public class MyFirstProgram {
	// start main method-----
	public static void main(String[] args) {
		// --Declare and assign needed local variables
		double dSalary = 0.0;
		double dRate = 0.0510;
		double dTotal = 0.0;

		Scanner scn = new Scanner(System.in);

		// Prompt user for the salary and accept the input--
		System.out.printf("Hello! Please enter the starting salary: ");
		dSalary = scn.nextDouble();
		dTotal = dTotal + dSalary;

		// --Start a loop to calculate for 10 years
		for (int i = 1; i <= 100; i++) {
			System.out.printf("Year %d\t %.2f\t %.2f\n", i, (dRate * 100), dSalary);

			dTotal += dSalary;
			dRate -= 0.001;
			dSalary = dSalary * (1 + dRate);

		}
		// --output the final Line--
		System.out.printf("\n Total Earnings \t %.2f\n", dTotal);

	}

}
