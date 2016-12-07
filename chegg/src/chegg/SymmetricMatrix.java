package chegg;

import java.util.Scanner;

public class SymmetricMatrix {
	/* Displaying Matrix */
	public static void display(int A[][]) {
		for (int row = 0; row < A.length; row++) {
			System.out.print("\t\t\t");
			for (int col = 0; col < A.length; col++) {
				System.out.print(A[row][col] + "\t");
			}
			System.out.println();
		}
	}

	/* Checking given matrix is symmetric or Not */
	public static boolean isSymmetric(int A[][]) {
		for (int row = 0; row < A.length; row++) {
			for (int col = 0; col < row; col++) {
				if (A[row][col] != A[col][row]) {
					return false;
				}
			}
		}
		return true;
	}

	public static void main(String args[]) {
		int M;
		Scanner sc = new Scanner(System.in);
		System.out.print("Please Enter the size of rows = ");
		M = sc.nextInt();
		if (M <= 2 || M >= 10) {
			System.out.println("THE MATRIX SIZE IS OUT OF RANGE");
		} else {
			int A[][] = new int[M][M];
			/*Inserting element into matrix*/
			for (int row = 0; row < M; row++) {
				for (int col = 0; col < M; col++) {
					A[row][col] = sc.nextInt();
				}
			}
			System.out.println("ORIGINAL MATRIX");
			display(A);//calling display method
			if (isSymmetric(A))
				System.out.println("THE GIVEN MATRIX IS SYMMETRIC");
			else
				System.out.println("THE GIVEN MATRIX IS NOT SYMMETRIC");

		}
	}
}
