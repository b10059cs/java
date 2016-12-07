package chegg;

public class BinarySearchTree {
	/**
	 * insert method implementation where we are inserting element into BST
	 * If element is less then the root element then we will insert into left of tree
	 * otherwise in right of tree
	 * */
	public void insert(Node root, int data) {
		if (root == null) {
			root = new Node(data);
		} else {
			if (root.data > data) {
				if (root.left != null) {
					insert(root.left, data);
				} else {
					System.out.println("Element inserted into left of Tree");
					root.left = new Node(data);
				}
			} else {
				if (root.right != null) {
					insert(root.right, data);
				} else {
					System.out.println("Element inserted into right of Tree");
					root.right = new Node(data);
				}
			}
		}
	}

	/**
	 * search method implementation where if element value is less then root value 
	 * then we will search element in left of BST
	 * otherwise in right of tree
	 * if root become null then we will print element not found
	 * */
	public void search(Node root, int element) {
		if (root == null) {
			System.out.println("Element not Found");
		} else {
			if (element == root.data) {
				System.out.println("Element is found");
				return;
			} else if (element < root.data) {
				search(root.left, element);
			} else if (element >= root.data) {
				search(root.right, element);
			}
		}
	}

}
