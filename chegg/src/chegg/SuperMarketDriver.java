package chegg;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import java.util.Scanner;

public class SuperMarketDriver {
	/*Variable Declaration*/
	private  int numberOfEmployees;
	private final int tax=30;
	private final int parking=10;
	SuperMarket employees[];
	/*List for storing Employee of Super market*/
	List<SuperMarket> list=new ArrayList<SuperMarket>();

	/*readInput method for reading employee information*/
	public  void readInput(){
		/*User Input*/
		Scanner input=new  Scanner(System.in);
		System.out.println("Please enter the number of Employees");
		numberOfEmployees=input.nextInt();
		/*Creating array of supermarket*/
		employees=new SuperMarket[numberOfEmployees];
		int i=0;
		/*Loop run  number of employees times*/
		while(numberOfEmployees>0){
			employees[i]=new SuperMarket();
			System.out.println("Please Enter Employee Id");
			employees[i].setEmployeeId(input.nextInt());
			System.out.println("Please Enter Hourly Rate of Pay");
			employees[i].setHourlyRate(input.nextDouble());
			System.out.println("Please  Enter Number of regular hour");
			employees[i].setRegularHour(input.nextDouble());
			System.out.println("Please  Enter overtime hours");
			employees[i].setOvertimeHour(input.nextDouble());

			/*Calculation of grosspay*/
			double grossPay=(employees[i].getRegularHour()*employees[i].getHourlyRate())+(employees[i].getOvertimeHour()*(employees[i].getHourlyRate()*1.5));
			employees[i].setGrossPay(grossPay);
			/*Calculation of Netpay*/
			double netPay=grossPay-(grossPay*tax/100)-parking;
			employees[i].setNetpay(netPay);
			/*Adding to list*/
			list.add(employees[i]);
			i++;
			numberOfEmployees--;

		}
	}
	/*Printing employees details using List iterator*/
	public void printData(){

		ListIterator<SuperMarket> itr=list.listIterator();  
		SuperMarket employee;
		while(itr.hasNext()){
			employee=itr.next();
			System.out.println("********************");
			System.out.println("Employee Id: "+employee.getEmployeeId()+"\n"+"Employee Hourly Rate: "+employee.getHourlyRate()+"\n"
					+"Employee Regular Hour: "+employee.getRegularHour()+"\n"
					+"Employee Overtime Hour: "+employee.getOvertimeHour()+"\n"
					+"Employee gross pay: "+employee.getGrossPay()+"\n"
					+"Employee NetPay: "+employee.getNetpay());
			
		}
	}
	/*Main method start*/
	public static void main(String[] args) {
		SuperMarketDriver object=new SuperMarketDriver();
		/*Calling readInput method*/
		object.readInput();		
		/*Calling Print data method*/
		object.printData();

	}

}
