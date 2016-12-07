package chegg;

import java.util.Scanner;

public class NonDecreasingArray {
	/*Checking Given array is non decreasing or not*/
	public static Boolean checkNonDecreaing(int[] number) {
		for (int i = 1; i < number.length; i++) {
			if (number[i - 1] > number[i]) {
				return Boolean.FALSE;
			}
		}
		return Boolean.TRUE;
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter the size of array");
		int n=sc.nextInt();
		int number[] = new int[n];
		System.out.println("Please Enter the Array Value");
		/*Taking input from user*/
		for (int i = 0; i < n; i++) {
			number[i] = sc.nextInt();
		}
		sc.close();
		/*calling checkNonDecreaing method to check it is NonDecreaing array or not*/
		Boolean flag=checkNonDecreaing(number);
		if(flag==Boolean.TRUE){
			System.out.println("GivenArray is Non decreasing");
			
		}else{
			System.out.println("GivenArray is  decreasing");
		}
	}

}
