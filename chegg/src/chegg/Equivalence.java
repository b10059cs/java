package chegg;

import java.util.Scanner;

public class Equivalence {
	/*Income tax calculation method*/
	public void calculateTax(double income){
		double tax=0;
		/*Based on provided data in question*/
		if(income<10){
			tax=tax+0;
		}else if(income>=10 && income<20){
			tax=tax+(income*10)/100;
		}else if(income>=20 && income<40){
			/*add 10 % of 10k means 1k needs to be added in tax*/
			tax=tax+1+((income-20)*12)/100;
		}else if(income>=40 && income<80){
			/*add 10 % of 10k means 1k and 12% of 20k needs to be added in tax*/
			tax=tax+1+2.4+((income-40)*15)/100;
		}else if(income>=80){
			/*add 10 % of 10k means 1k and 12% of 20k and 15 % of 40k needs to be added in tax*/
			tax=tax+1+2.4+6+((income-80)*20)/100;
		}

		System.out.println("Total Tax is: $"+tax+"K");
	}
	/*Main method start*/
	public static void main(String args[]){
		/*Variable declaration*/
		double income;
		Scanner input=new Scanner(System.in);
		/*Class object creation*/
		Equivalence equivalence=new Equivalence();
		/*Prompt for income*/
		System.out.println("Please Enter the income");
		income=input.nextDouble();
		/*calling calculateTax method*/
		equivalence.calculateTax(income);

	}
}
