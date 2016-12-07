package chegg;

import java.text.DecimalFormat;
import java.util.Scanner;

public class TempConverter
{
//-----------------------------------------------------------------
// Computes the Kelvin equivalent of a specific Fahrenheit
// value using the formula k = (°F + 459.67) × 5/9.
//-----------------------------------------------------------------
public static void main (String[] args)
{
final double BASE = 459.67;
final double CONVERSION_FACTOR = 5.0 / 9.0;
double kelvinTemp;

Scanner sc=new Scanner(System.in);
int fahrenheitTemp= 0; // value to convert
System.out.println("Please Enter Temprature  in fahrenheit");
fahrenheitTemp=sc.nextInt();

kelvinTemp= (fahrenheitTemp+BASE)*CONVERSION_FACTOR;
System.out.println("Fahrenheit Temperature:" + new DecimalFormat("##.##").format(kelvinTemp));
System.out.println("Kelvin Equivalent: " + fahrenheitTemp);
}
}