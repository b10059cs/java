package chegg;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Stack;
import java.util.StringTokenizer;

public class ProgramSix {
	/**
	 * memory map for storing variable value
	 */
	static Map<String, Integer> memory = new HashMap<String, Integer>();

	// main method start
	public static void main(String args[]) {
		System.out.println("Servando Hernandez");
		System.out.println("RPN command Line calculator");
		Scanner scan = new Scanner(System.in);
		System.out.println(">");
		/**
		 * It will continue until we type exit
		 */
		while (scan.hasNextLine()) {
			System.out.println("> ");
			String a = scan.nextLine();
			String b = "exit";
			String c = "mem";
			String d = "clear";
			if (a.equals(b)) {
				System.exit(1);
			} /**
				 * if we typed mem then it will print all variable with values
				 * present in Map
				 * 
				 */
			else if (a.equals(c)) {
				// loop a Map
				for (Map.Entry<String, Integer> entry : memory.entrySet()) {
					System.out.println(entry.getKey() + ": " + entry.getValue());
				}
			} else {
				System.out.println(compute(a));
			}

			System.out.println(">");
		}
	}

	/**
	 * compute method implementation
	 */
	private static String compute(String input) {
		List<String> processedList = new ArrayList<String>();
		boolean isequal = false;
		/**
		 * checking input string contains = or not
		 */
		if (input.contains("=")) {
			isequal = true;
		}
		/**
		 * creating token from input string
		 */
		if (!input.isEmpty()) {
			StringTokenizer st = new StringTokenizer(input);
			while (st.hasMoreTokens()) {
				processedList.add(st.nextToken());
			}

		} else {
			return "Error";
		}
		Stack<String> tempList = new Stack<String>();
		Iterator<String> iter = processedList.iterator();
		String key = "";
		boolean flag = false;
		/**
		 * Iterating all tokens
		 */
		while (iter.hasNext()) {
			String temp = iter.next();
			if (temp.matches("[0-9]*")) {
				tempList.push(temp);
			} else if (temp.matches("[*-/+%]")) {
				if (temp.equals("*")) {
					int rs = Integer.parseInt(tempList.pop());
					int ls = Integer.parseInt(tempList.pop());
					int result = ls * rs;
					tempList.push("" + result);
				} else if (temp.equals("-")) {
					int rs = Integer.parseInt(tempList.pop());
					int ls = Integer.parseInt(tempList.pop());
					int result = ls - rs;
					tempList.push("" + result);
				} else if (temp.equals("/")) {
					int rs = Integer.parseInt(tempList.pop());
					int ls = Integer.parseInt(tempList.pop());
					int result = ls / rs;
					tempList.push("" + result);
				} else if (temp.equals("+")) {
					int rs = Integer.parseInt(tempList.pop());
					int ls = Integer.parseInt(tempList.pop());
					int result = ls + rs;
					tempList.push("" + result);
				} else if (temp.equals("%")) {
					int rs = Integer.parseInt(tempList.pop());
					int ls = Integer.parseInt(tempList.pop());
					int result = ls % rs;
					tempList.push("" + result);
				}
			} else if (temp.matches("[a-zA-z]*")) {
				if (!flag) {
					key = temp;
				}
				if (memory.get(temp) == null && isequal == false) {
					System.out.println(temp + " not found");
					return "";
				} else if (memory.containsKey(temp)) {
					tempList.push(memory.get(temp) + "");
				}
			} else if (temp.equals("=")) {
				flag = true;
			} else {

				return "Error";
			}
		}
		String value = tempList.pop();
		if (isequal) {
			memory.put(key, Integer.parseInt(value));
		}
		return value;
	}
}
