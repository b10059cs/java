package chegg;

import java.text.DecimalFormat;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class RainFall {
	/*Data member variable*/
	private double monthlyRainFall;
	private double monthsRainFall[]=new double[12];
	private  int  month=0;
	private double maxRain=0.0;
	private int maxrainMonth;
	private double minRain=0.0;
	private int minRainMonth;
	/*creating map for storing month*/
	Map<Integer, String> monthMap=new HashMap<Integer,String>();

	Scanner input=new Scanner(System.in);

	/*Initializing map with value while default constructor*/
	public RainFall(){
		monthMap.put(0, "January");
		monthMap.put(1, "February");
		monthMap.put(2, "March");
		monthMap.put(3, "April");
		monthMap.put(4, "May");
		monthMap.put(5, "June");
		monthMap.put(6, "July");
		monthMap.put(7, "August");
		monthMap.put(8, "September");
		monthMap.put(9, "October");
		monthMap.put(10, "November");
		monthMap.put(11, "December");		
	}

	/*Getting monthlyRainFall*/
	public double getMonthlyRainFall() {
		return monthlyRainFall;
	}

	/*Setting monthly rainfall If it is negative then it loops until positive */
	public void setMonthlyRainFall(double monthlyRainFall) {

		while(monthlyRainFall<0){
			System.out.println("Please Enter positive value of monthly rainfall");
			monthlyRainFall=input.nextDouble();
		}
		monthsRainFall[month++]=monthlyRainFall;
	}
	/*Getting average month rain fall*/
	public void averageMonthlyRainFall(){

		double totalRainFall=0;
		/*first calculate totalRain fall after that divide it total month*/
		for(int i=0;i<monthsRainFall.length;i++){
			totalRainFall+=monthsRainFall[i];
		}
		System.out.println("Average Monthly Rain Fall: "+new DecimalFormat("##.##").format(totalRainFall/12));
	}
	/*Getting total rainfall*/
	public void totalRainFall(){
		double totalRainFall=0;
		for(int i=0;i<monthsRainFall.length;i++){
			totalRainFall+=monthsRainFall[i];
		}
		System.out.println("Total Rain Fall for the year: "+new DecimalFormat("##.##").format(totalRainFall));
	}
	/*Getting max RainFall*/
	public void maxRainFallMonth(){
		for(int i=0;i<monthsRainFall.length;i++){
			if(maxRain<monthsRainFall[i]){
				maxrainMonth=i;
				maxRain=monthsRainFall[i];
			}

		}
		System.out.println("Max Rain Month Fall: "+monthMap.get(maxrainMonth));

	}
	/*Getting min rainfall*/
	public void minRainFallMonth(){
		minRain=monthsRainFall[0];
		for(int i=1;i<monthsRainFall.length;i++){

			if(minRain>monthsRainFall[i]){
				minRain=monthsRainFall[i];
				minRainMonth=i;
			}
		}
		System.out.println("Min Rain Month Fall: "+monthMap.get(minRainMonth));


	}

	/*Main method start*/
	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		/*Creating instance of rainFall class*/
		RainFall rainFall=new RainFall();
		/*getting rainfall for each month from user*/
		for(int i=0;i<12;i++){
			System.out.println("Please Enter rainFall for "+(i+1)+" Month");
			rainFall.setMonthlyRainFall(sc.nextDouble());
		}

		/*Average Monthly rainfall*/
		rainFall.averageMonthlyRainFall();
		/*Total Rain Fall in a year*/
		rainFall.totalRainFall();
		/*Max rainFall Month*/
		rainFall.maxRainFallMonth();
		/*Minimum rainFall Month*/
		rainFall.minRainFallMonth();
		sc.close();
	}

}
