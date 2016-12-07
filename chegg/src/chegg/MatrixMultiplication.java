package chegg;

public class MatrixMultiplication {

	/* Matrix multiplication method */
	public int[][] matrixMultiplication(int A[][], int B[][]) {

		// row and column of result matrix will be row of A and col of B
		int result[][] = new int[A.length][B[1].length];
		/* saving value in result matrix */
		for (int k = 0; k < result.length; k++) {
			for (int i = 0; i < B[1].length; i++) {
				/* storing temporary result */
				int sum = 0;
				for (int j = 0; j < B.length; j++) {
					sum += A[k][j] * B[j][i];
				}
				/* Storing multiplication in result array */
				result[k][i] = sum;
			}
		}
		/* Returning matrix */
		return result;
	}

	/* Main method start */
	public static void main(String[] args) {
		/* Matrix initialization */
		int matrixA[][] = { { 1, 2 }, { 3, 4 } };
		int matrixB[][] = { { 5, 6, 7 }, { 8, 9, 10 } };
		/* creating object of class */
		MatrixMultiplication mul = new MatrixMultiplication();

		/* condition check if col of matrixA and row of matrix is same or not */
		if (matrixA[1].length != matrixB.length) {
			System.out.println(
					"We can not multiply matrix. MatrixA col and MatrixB row should be same number of element");

		} else {
			/* calling multiplication method */
			int result[][] = mul.matrixMultiplication(matrixA, matrixB);
			System.out.println("***********Matrix Multiplication**********");
			/* Printing resultant matrix */
			for (int i = 0; i < result.length; i++) {
				for (int j = 0; j < result[1].length; j++) {
					System.out.print(result[i][j] + " ");
				}
				System.out.println();
			}
		}

	}

}
