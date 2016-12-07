package chegg;

public class MenuItem {

	/*variable declaration*/
	private String name;
	private String description;
	private double price;

	/*getter and setter method*/
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) throws Exception {
		if(price>=0){
			this.price = price;
		}else{
			throw new Exception("New price is nonpositive");
		}
	}


}
