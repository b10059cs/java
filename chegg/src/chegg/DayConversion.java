package chegg;

import java.util.Calendar;

public class DayConversion {

	static String  month[]=new String[13];
	public DayConversion(){
		month[0]="January";
		month[1]="Feburary";
		month[2]="March";
		month[3]="April";
		month[4]="May";
		month[5]="June";
		month[6]="July";
		month[7]="August";
		month[8]="Sepetember";
		month[9]="October";
		month[10]="November";
		month[11]="December";
	}

	public  String dayConversion(Integer day,int year){
		Calendar cal = Calendar.getInstance();
		 cal.set(Calendar.YEAR, year);
		    cal.set(Calendar.DAY_OF_YEAR, day);
		   int m= cal.get(Calendar.MONTH);
		
		return month[m];
		
	}
}
