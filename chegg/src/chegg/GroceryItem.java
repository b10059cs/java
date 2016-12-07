package chegg;

public class GroceryItem {
/*Instance variable declaration*/
	private String name;
	private int value;	
	/*Default constructor*/
	public GroceryItem() {
		super();
		// TODO Auto-generated constructor stub
	}
	/*Parameterized constructor*/
	public GroceryItem(String name, int value) {
		super();
		this.name = name;
		this.value = value;
	}
/*Getter and Mutators methods for each instance variable*/
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getValue() {
		return value;
	}
	public void setValue(int value) {
		if(value<0){
			
		}
			
		this.value = value;
	}

	/*ToString Method*/
	@Override
	public String toString() {
		return "GroceryItem [name=" + name + ", value=" + value + "]";
	}
	/*Equals method*/
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		GroceryItem other = (GroceryItem) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (value != other.value)
			return false;
		return true;
	}

	/*Equals Method*/
	
	
}
