package chegg;

import java.util.Scanner;

public class Demo {
public static void main(String args[]){
	Scanner input=new Scanner(System.in);
	/**
	 * Creating object of Node class*/
	Node root=new Node();
	/**
	 * Creating object of BST*/
	BinarySearchTree tree=new BinarySearchTree();
	tree.insert(root, 10);
	tree.insert(root, 23);
	tree.insert(root, 15);
	tree.insert(root, 30);
	tree.insert(root, 45);
	tree.insert(root, 33);
	tree.insert(root, 8);
	
	System.out.println("***********Searching an element in BST*********");
	System.out.println("Please Enter a value to be search");
	int number=input.nextInt();
	tree.search(root, number);
	
}
}
