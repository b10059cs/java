package chegg;

public class ProductList {
	// class variable
	private int id;
	private String text;
	private double price;
	private String name;

	// default constructor
	public ProductList() {

	}

	// parameterized constructor
	public ProductList(int i, String t, double p, String n) {
		id = i;
		text = t;
		price = p;
		name = n;
	}

	// getter of allclass variables
	public int getId() {
		return id;
	}

	public String getText() {
		return text;
	}

	public double getPrice() {
		return price;
	}

	public String getName() {
		return name;
	}

	public String toString() {
		return String.format("%d %s $%.2f %s ", id, text, price, name);
	}
}
