package chegg;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Scanner;

public class Dedup {
	public static ArrayList<Integer> uniqueList = new ArrayList<>();

	/**
	 * In this method we are reading file and adding numbers into list if File
	 * not present then it will throw an exception
	 * 
	 * @return arrayList
	 */
	public static ArrayList<Integer> readData(String fileName) throws IOException {
		ArrayList<Integer> numbers = new ArrayList<>();
		File file = new File(fileName);
		Scanner scanner = new Scanner(file);
		/**
		 * Reading file line by line and splitting by comma(,) and then adding
		 * numbers into list
		 */
		while (scanner.hasNext()) {

			String line = scanner.nextLine();
			String numberArr[] = line.split(",");
			for (int i = 0; i < numberArr.length; i++) {
				numbers.add(Integer.parseInt(numberArr[i]));
			}

		}
		/**
		 * getting unique values by HashSet then inserting into arraylist
		 */
		HashSet<Integer> uniqueValues = new HashSet<>(numbers);
		for (Integer value : uniqueValues) {
			uniqueList.add(value);
		}
		Collections.sort(uniqueList);
		return numbers;
	}

	/**
	 * we are iterating arraylist of integer checking with each number of list
	 * with number if both are same then we are increasing count to 1
	 */
	public static int howMany(ArrayList<Integer> data, int number) {
		int count = 0;
		for (int temp : data) {
			if (temp == number) {
				count++;
			}
		}
		return count;
	}

	/**
	 * @return arraylist of unique number
	 */

	public static ArrayList<Integer> returnUnique() {

		return uniqueList;
	}

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		/**
		 * calling readData method using class
		 */
		try {
			/**
			 * please provide the file path according to you
			 */
			ArrayList<Integer> numbers = Dedup.readData("/home/lalchand/chegg/AnshuChegg/src/small.txt");
			System.out.println("Please enter the number, you wana see the counts");
			int number = input.nextInt();
			int cnt = Dedup.howMany(numbers, number);
			System.out.println("count is: " + cnt);
			/**
			 * calling returnUnique method to get unique numbers
			 */
			numbers = Dedup.returnUnique();
			System.out.println("Unique list of Numbers");
			for (int temp : numbers) {
				System.out.print(temp + " ");
			}
			System.out.println();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
