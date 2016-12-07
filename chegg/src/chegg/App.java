package chegg;

public class App {

	public static void main(String[] args) {
		Octagon a1 = new Octagon(5);

		System.out.println("Area of a1 is " + a1.findArea());

		System.out.println("Perimeter of a1 is " + a1.findPerimeter());

		Object a2;
		try {
			a2 = a1.clone();
			String result = (a1.compareTo(a2) == 0) ? "a1 and its clone a2 have the same area"
					: "a1 and its clone a2 have different areas";

			System.out.println("Compare a1 and its clone a2:\n\t " + result);

			System.out.println("Hashcode of a1: " + a1.hashCode());

			System.out.println("Hashcode of a2: " + a2.hashCode());

			System.out.println("Displaying a1: " + a1);

			System.out.println("Displaying a2: " + a2);

		} catch (CloneNotSupportedException e) {
			
			e.printStackTrace();
		}

	}

}
