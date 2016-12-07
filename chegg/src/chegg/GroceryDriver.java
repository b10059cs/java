package chegg;

import java.util.Scanner;

public class GroceryDriver {
	public static void main(String args[]){
		
		Scanner sc=new Scanner(System.in);
		
		/*Creating GroceryItem instance variable*/
		GroceryItem item1=new GroceryItem();
		item1.setName("Rice");
		item1.setValue(20);
		
		GroceryItem item2=new GroceryItem();
		item2.setName("flor");
		item2.setValue(40);
		
		GroceryItem item3=new GroceryItem();
		item3.setName("wheat");
		item3.setValue(50);
		
		GroceryItem item4=new GroceryItem();
		item4.setName("vegetable");
		item4.setValue(60);
		
		GroceryItem item5=new GroceryItem();
		item5.setName("Fruits");
		item5.setValue(80);
		/*Creating Grocery List instance*/
		GroceryList list=new GroceryList();
		/*Adding items into Grocery List*/
		list.addItem(item1);
		list.addItem(item2);
		list.addItem(item3);
		list.addItem(item4);
		list.addItem(item5);
		/*calling showlist() method for printing*/
		list.showList(list);
		/*Calling contains method*/
		System.out.println("Please enter Grocery name to be search");
		String name=sc.nextLine();
		
		Boolean flag=list.contains(list,name);
		if(flag){
			System.out.println("Grocery Name is present in Grocery List");
		}else{
			System.out.println("Name is not present in Grocery List");
		}
		
		int totalCost=list.totalCost(list);
		System.out.println("Total Grocery Cost "+totalCost);
		System.out.println("GroceryList afetr deletion of "+name);
		list.deleteCurrentNode(list, name);
		list.showList(list);
	}

}
