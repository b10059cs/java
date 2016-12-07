package chegg;

public class Octagon extends GeometricObject implements Cloneable, Comparable {

	private double side;

	/** construct a Octagon with specified side */
	public Octagon(double side) {
		super();
		this.side = side;
	}

	/** Implement the abstract method findArea in GeometricObject */

	@Override
	public double findArea() {
		double area = (2 + 4 / Math.sqrt(2)) * side * side;
		return area;
	}

	/** Implement the abstract method findArea in findPerimeter */
	@Override
	public double findPerimeter() {
		double perimeter = 8 * side;
		return perimeter;
	}

	/** Implement the compareTo method in Comparable interface */
	@Override
	public int compareTo(Object o) {
		// TODO Auto-generated method stub
		return 0;
	}

	public Object clone() throws CloneNotSupportedException {

		return super.clone();

	}

}

