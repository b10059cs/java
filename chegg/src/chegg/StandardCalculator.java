package chegg;

public class StandardCalculator extends BasicCalculator {

	public void exponention(int a) {
		System.out.println("Math.exp(" + a + ")=" + Math.exp(a));
	}

	public void module(int a, int b) {
		System.out.println("Module is : "+a % b);
	}
}
