package chegg;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ProductRunner {
	public static void main(String[] args) {
		// variable for count of unsuccessful loaded record
		int unsuccessfulLoaded = 0;
		Scanner fileInput = null;
		try {
			// reading file
			fileInput = new Scanner(new File("product.txt"));
		} catch (FileNotFoundException e) {
			System.out.println("File not found error");
			System.out.println(e);
		}
		// array of productList for storage
		ProductList[] prods = new ProductList[10];
		int numProducts = 0;
		// reading file content
		while (fileInput.hasNext()) {
			try {
				int id = fileInput.nextInt();
				String text = fileInput.next();
				double price = fileInput.nextDouble();
				String name = fileInput.next();
				ProductList p = new ProductList(id, text, price, name);
				// storing into product list array
				prods[numProducts++] = p;

			} catch (InputMismatchException e) {
				System.out.println("Error 1");
				System.out.println(e);
				unsuccessfulLoaded++;
				fileInput.next();
			}

		}

		try {
			// printing successful loaded record and unsuccessful loaded record
			System.out.println("Total SuccessFul Loaded Records: " + numProducts);
			System.out.println("Total UnSuccessful Loaded records: " + unsuccessfulLoaded);
			double totalPrice = 0;
			// calculating total price
			for (int c = 0; c < numProducts; c++) {
				ProductList list = prods[c];
				totalPrice += list.getPrice();
			}
			// printing average product price
			System.out.println(
					"Average product price of all the products successfully loaded:" + (totalPrice / numProducts));

		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("No room in your products!");
		}

		

	}
}
