package chegg;

import java.util.Scanner;

public class Assignment5 {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		String choice;
		char command;
		Geek myGeek=new Geek("Eisenstein", 0);
		System.out.println(myGeek.getName());
		System.out.println(myGeek.getNoOfQuestionAsked());
		System.out.println(myGeek.isEven(1, 2));
		System.out.println(myGeek.isEven(2, 2));
		System.out.println(myGeek.getNoOfQuestionAsked());
		System.out.println(myGeek.sum(1, 1));
		System.out.println(myGeek.leapYear(1980));
		System.out.println(myGeek.getNoOfQuestionAsked());
		

	}

}
