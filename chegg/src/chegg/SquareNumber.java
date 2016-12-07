package chegg;

import java.util.ArrayList;
import java.util.Iterator;

public class SquareNumber {

	public ArrayList<Integer> squareEach(ArrayList<Integer> al) {
		ArrayList<Integer> al2 = new ArrayList<Integer>();
		// get an Iterator object for ArrayList using iterator() method.
		Iterator<Integer> itr = al.iterator();
		// use hasNext() and next() methods of Iterator to iterate through the
		// elements
		while (itr.hasNext()) {
			int num = itr.next();
			al2.add(num * num);
		}
		al = al2;// assigning again al2 to al
		return al;
	}

	public static void main(String[] args) {
		SquareNumber sn = new SquareNumber();
		/* Creating pbject of ArrayList for storing input values */
		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(1);
		al.add(2);
		al.add(3);
		al.add(4);
		al.add(5);
		al.add(6);
		al.add(7);
		al.add(8);
		/* Printing Arraylist before Square */
		System.out.println("List: " + al);
		al = sn.squareEach(al);
		/* Printing Arraylist After Square */
		System.out.println("Square List: " + al);
		/* If you want to iterate the return list then uncomment below code */

		/*
		 * //get an Iterator object for ArrayList using iterator() method.
		 * Iterator<Integer> itr = al.iterator(); //use hasNext() and next()
		 * methods of Iterator to iterate through the elements
		 * while(itr.hasNext()){ int num=itr.next(); System.out.println(num); }
		 */
	}

}
