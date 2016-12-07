package chegg;

import java.math.BigInteger;

public class ScientificCalculator extends BasicCalculator {

	public void addition(BigInteger a, BigInteger b) {
		System.out.println("Addition is: "+a.add(b));
		
	}

	public void subtraction(BigInteger a, BigInteger b) {
		System.out.println("Substraction is: "+a.subtract(b));
		
	}

	public void multiplication(BigInteger a, BigInteger b) {
		System.out.println("Multiplication is: "+a.multiply(b));
	}

	public void division(BigInteger a, BigInteger b) {
		System.out.println("Division is: "+a.divide(b));
	}
	public int add(int a, int b) {
		return a + b;
	}

	public int subtract(int a, int b) {
		return a - b;
	}

	public int multiply(int a, int b) {
		return a * b;
	}

	public int divide(int a, int b) {
		return a / b;
	}
}
