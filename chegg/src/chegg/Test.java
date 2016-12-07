package chegg;

import java.util.Random;
import java.util.Scanner;

public class Test {
	public static void permute(int[] a, int k){
		if (k == a.length){
			for (int i = 0; i < a.length; i++){
				/*if i+1 is equals to length of array then we will not add an comm
				 * otherwise we will print comma
				 * */
				if(i+1==a.length){
					System.out.print(a[i] + " ");
				}else{
					System.out.print(a[i] + ", ");
				}
			}
			System.out.println();
		}else{
			for (int i = k; i < a.length; i++){
				int temp = a[k];
				a[k] = a[i];
				a[i] = temp;

				permute(a, k + 1);

				temp = a[k];
				a[k] = a[i];
				a[i] = temp;
			}
		}
	}

	public static void main(String args[])
	{
		Random random = new Random();
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the length of list: ");
		int N = sc.nextInt();
		int[] sequence = new int[N];

		for (int i = 1; i < N+1; i++)
			sequence[i-1] = i;

		System.out.println("The original sequence is: ");
		for (int i = 0; i < N; i++)
			System.out.print(sequence[i] + " ");

		System.out.println("\nThe permuted sequences are as follows: ");
		permute(sequence, 0);

		sc.close();
	}
}
