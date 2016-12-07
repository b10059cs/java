package chegg;

public class Geek {
	/*Variable declaration*/
	private String name;
	private int noOfQuestionAsked;
	/*parameterized constructor*/
	public Geek(String name, int noOfQuestionAsked) {
		super();
		this.name = name;
		this.noOfQuestionAsked = noOfQuestionAsked;
	}
	/*Getter method for getting name of geek*/
	public String getName() {
		return name;
	}
	/*getter method for number of question asked to geek*/
	public int getNoOfQuestionAsked() {
		return this.noOfQuestionAsked;
	}
	/*sum of two numbers is even or not*/
	public boolean isEven(int num1,int num2) {
		this.noOfQuestionAsked++;
		if ((num1+num2)%2==0) {			
			return true;
		}else{
			return false;
		}

	}
	/*returning sum between two number*/
	public int sum(int num1,int num2) {
		int max,min,sum=0;

		if(num1==num2) {
			return num1;
		}else{
			if(num1>num2) {
				max=num1;
				min=num2;
			}else{
				max=num2;
				min=num1;
			}
			for (int i=min;i<=max;i++) {
				sum+=i;
			}
			return sum;
		}
	}
	/*testing given number is leap year or  not*/
	public boolean leapYear(int year) {

		this.noOfQuestionAsked++;
		if (year%100==0){
			if(year%400==0) {
				return true;
			}else{
				return false;
			}
		}else if (year%4==0) {
			return true;
		}else{
			return false;
		}

	}
}
