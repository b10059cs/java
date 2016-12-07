package chegg;

public class AdvancedCalculator extends BasicCalculator {
	private int decimalToBinary(int decimal) {
		String binary = Integer.toBinaryString(decimal);
		return Integer.parseInt(binary);
	}

	private int binaryToDecimal(int binary) {
		String s = (Integer.toString(binary));
		return Integer.parseInt(s, 2);
	}

	public int add(int a, int b) {
		int n1 = binaryToDecimal(a);
		int n2 = binaryToDecimal(b);

		return decimalToBinary(n1 + n2);
	}

	public int subtract(int a, int b) {
		int n1 = binaryToDecimal(a);
		int n2 = binaryToDecimal(b);

		return decimalToBinary(n1 - n2);
	}

	public int multiply(int a, int b) {
		int n1 = binaryToDecimal(a);
		int n2 = binaryToDecimal(b);
		return decimalToBinary(n1*n2);
	}

	public int divide(int a, int b) {
		int n1 = binaryToDecimal(a);
		int n2 = binaryToDecimal(b);

		return decimalToBinary((n1/n2));
	}
}
