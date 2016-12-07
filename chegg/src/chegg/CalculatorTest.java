package chegg;

import java.math.BigInteger;

public class CalculatorTest {

	public static void main(String[] args) {
		StandardCalculator standardCalculator=new StandardCalculator();
		AdvancedCalculator advancedCalculatorac=new AdvancedCalculator();
		ScientificCalculator scientificCalculator=new ScientificCalculator();
		System.out.println("=========StandardCalculator Operation===============");
		System.out.println("Addition is: "+standardCalculator.add(2, 3));
		System.out.println("Substraction is: "+standardCalculator.subtract(4, 2));
		System.out.println("Multiplication is: "+standardCalculator.multiply(2, 3));
		System.out.println("Division is: "+standardCalculator.divide(4, 2));
		standardCalculator.exponention(3);
		standardCalculator.module(6, 4);
		System.out.println("==============AdvancedCalculator operation==============");
		System.out.println("Addition is: "+advancedCalculatorac.add(1010, 10));
		System.out.println("Substraction is: "+advancedCalculatorac.subtract(1010, 10));
		System.out.println("Multiplication is: "+advancedCalculatorac.multiply(1010, 10));
		System.out.println("Addition is: "+advancedCalculatorac.divide(1010, 10));
		System.out.println("===============ScientificCalculator operation============");
		 // Negative?!!!  Overflowed into sign bit.
		scientificCalculator.addition(BigInteger.valueOf(2000000000), BigInteger.valueOf(1705032704));
		scientificCalculator.subtraction(BigInteger.valueOf(1705032704), BigInteger.valueOf(589934592));
		scientificCalculator.multiplication(BigInteger.valueOf(589934592), BigInteger.valueOf(3));
		scientificCalculator.division(BigInteger.valueOf(589934592), BigInteger.valueOf(1342));
		System.out.println("=========Basic Calculator within ScienticCalculator==========");
		 // Negative?!!!  Overflowed into sign bit.
		System.out.println("Addition is: "+scientificCalculator.add(2000000000, 1705032704));
		System.out.println("Substraction is: "+scientificCalculator.subtract(1705032704, 589934592));
		System.out.println("Multiplication is:"+scientificCalculator.multiply(589934592, 3));
		System.out.println("Division is:"+scientificCalculator.divide(589934592, 1342));
		

	}

}
