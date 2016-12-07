package chegg;

import java.util.Scanner;
/*Calculator class start*/
public class Calculator {
	public static void main(String args[]){
		/*Variable declaration*/
		String expression;
		/*Scanner object for input*/
		Scanner input=new Scanner(System.in);
		/*Prompt for expression*/
		System.out.println("Please Enter expression");
		expression=input.nextLine();
		input.close();
		/*Calling Evaluate method*/
		String result=P3.evaluate(expression);
		/*Printing result if it is not null*/
		if(result!=null) {
			System.out.println(result);
		}
	}
}
