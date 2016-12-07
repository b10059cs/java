package chegg;

public abstract class GeometricObject {
	private String color = "white";
	private boolean filled;

	// default constructure
	public GeometricObject() {
		super();
		// TODO Auto-generated constructor stub
	}

	// construct a Geometric Object
	// parameterized constructure
	public GeometricObject(String color, boolean filled) {
		this.color = color;
		this.filled = filled;
	}

	/** Getter method for color */
	public String getColor() {
		return color;
	}

	/** Setter method for color */
	public void setColor(String color) {
		this.color = color;
	}

	/**
	 * Getter method for filled. Since filled is boolean, so the gret method
	 * name is isFilled
	 */
	public boolean isFilled() {
		return filled;
	}

	/** Setter method for filled */
	public void setFilled(boolean filled) {
		this.filled = filled;
	}

	/** Abstract method for FindArea */
	public abstract double findArea();

	/** Abstract method for findPerimeter */
	public abstract double findPerimeter();

	
}
