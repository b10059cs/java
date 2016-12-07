package chegg;

public class BasicCalculator {

	public String name;
	public int price;

	BasicCalculator() {

	}

	BasicCalculator(String newName, int newPrice) {
		name = newName;
		price = newPrice;
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

	public String getName() {
		return name;
	}

	public void setName(String newName) {
		name = newName;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int newPrice) {
		price = newPrice;
	}
}
