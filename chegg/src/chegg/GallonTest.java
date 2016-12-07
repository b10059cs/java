package chegg;

import java.util.Scanner;
/*Main class start*/
public class GallonTest {
	/*created constant LITERPERGALLON variable */
	public static final float LITERPERGALLON=3.78541178f;
	public static void main(String[] args) {
		/*Variable  declaration for input*/
		int gallons;
		/*Creating scanner class object for taking input from console*/
		Scanner scanner=new Scanner(System.in);
		/*Prompt for user input*/
		System.out.print("Enter the number of gallons: ");
		gallons=scanner.nextInt();
		/*Printing required Message*/
		System.out.println("Number of liters is: "+(LITERPERGALLON*gallons));

		/*closing scanner object*/
		scanner.close();
	}

}
/*Main Class end*/