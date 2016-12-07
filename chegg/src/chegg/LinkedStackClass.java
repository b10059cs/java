package chegg;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class LinkedStackClass {
/*default constructor*/
	public LinkedStackClass() {
	}
/*Printing Stack value from top to bottom*/
	public static void printBackStack(Stack<Integer> intStack) {
		Iterator<Integer> iter = intStack.iterator();
		while (iter.hasNext()) {
			System.out.print(iter.next()+" ");
		}
		System.out.println();
	}
/*Printing stack from bottom to top*/
	public static void printStack(Stack<Integer> intStack) {

		for (int i = intStack.size() - 1; i >= 0; i--) {
			System.out.print(intStack.get(i)+" ");
		}
		System.out.println();
	}
/*getting second value from Stack*/
	public static Integer getSecond(Stack<Integer> intStack) {

		return intStack.get(intStack.size()-2);
	}
/*Returning size(number of element in stack) of stack*/
	public static int countItems(Stack<Integer> intStack) {

		return intStack.size();
	}
/*removing element from stack*/
	public static void removeItem(Stack<Integer> intStack, Integer n) {
		for (int i = intStack.size() - 1; i >= 0; i--) {
			int data = intStack.get(i);
			if (data == n) {
				intStack.remove(i);
			}
		}
	}
/*Reversing stack using recursion*/
	public static Stack<Integer> reverseStack(Stack<Integer> s) {

		Queue<Integer> q = new LinkedList<>();
		if (!s.isEmpty()) {
			int data = s.pop();
			reverseStack(s);
			q.add(data);

		}
		Iterator<Integer> iter = q.iterator();
		while (iter.hasNext()) {
			//System.out.println(iter.next());
			s.push(iter.next());			
		}
	return s;	
		
	}
/*reversing Queue*/
	public static void reverseQueue(Queue<Integer> q) {

		Stack<Integer> s = new Stack<Integer>();
		Iterator<Integer> iter = q.iterator();
		while (iter.hasNext()) {
			s.push(iter.next());
		}
		for (int i = q.size() - 1; i >= 0; i--) {
			q.remove();
		}
		for (int i = s.size() - 1; i >= 0; i--) {
			q.add(s.get(i));
		}
		
	}

	public static void printQueue(Queue<Integer> q) {
		Iterator<Integer> iter =q.iterator();
		while (iter.hasNext()) {
			System.out.print(iter.next()+" ");
		}
		System.out.println();
	}

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		Stack<Integer> intStack = new Stack<Integer>();
		int ch = 0;

		LinkedStackClass stack = new LinkedStackClass();
		while (true) {
			System.out.println("Please Enter number");
			ch = sc.nextInt();
			if (ch == 999)
				break;
			intStack.push(ch);
		}
	
		System.out.println("The original stack printed in direct order (bottom to top) is:");
		printStack(intStack);
		System.out.println("The stack printed in reverse order (top to bottom) is:");
		printBackStack(intStack);
		System.out.println("The stack stores "+countItems(intStack)+" items");
		System.out.println("The top is: "+intStack.peek());
		System.out.println("The second item (below top) is "+getSecond(intStack));
		System.out.println("Enter value to be removed from stack:");
		int num=sc.nextInt();
		removeItem(intStack,num);
		System.out.println("The stack after removing every occurrence of "+num+" is:");
		printStack(intStack);
		System.out.println("Reversed the stack. The new stack printed in direct order is:");
	   reverseStack(intStack);
		printBackStack(intStack);
		System.out.println("====Queue value=======");
		Queue<Integer> q=new LinkedList<>();
		String ch1 = "";
		while(true){
			ch1=sc.next();
			if(ch1.equals("q")){
				break;
			}
			q.add(Integer.parseInt(ch1));
		}
		System.out.println("The queue is:");
		printQueue(q);
		System.out.println("The reversed queue is:");
		reverseQueue(q);
		printQueue(q);
		
	}

}
