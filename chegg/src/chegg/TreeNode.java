package chegg;

public class TreeNode {
	/* TreeNode class attribute declaration */
	private TreeNode left;
	private TreeNode right;
	private int key;

	/* Default constructor */
	public TreeNode() {

	}

	/* Parameterized constructor */
	public TreeNode(int key) {
		this.key = key;
		this.left = null;
		this.right = null;
	}

	/*
	 * Inserting into BST If root value > key the scan left sub tree If root
	 * value <= key then scan right sub tree
	 */
	public static void insert(TreeNode root, int key) {
		if (root == null) {
			root = new TreeNode(key);
		} else {
			if (root.key > key) {
				if (root.left != null) {
					insert(root.left, key);
				} else {
					root.left = new TreeNode(key);
				}
			} else if (root.key <= key) {
				if (root.right != null) {
					insert(root.right, key);
				} else {
					root.right = new TreeNode(key);
				}
			}
		}

	}
	/* Post order traversal of BST */

	public static void postorder(TreeNode root) {
		/* left right root ----postorder */
		if (root != null) {
			postorder(root.left);
			postorder(root.right);
			System.out.print(root.key + " ");
		}
	}
	/*
	 * Deleting node from BST condition 1: If deleting node contains zero child
	 * condition 2: If deleting Node contains one child condition 3: If deleting
	 * Node contains two child
	 */

	public TreeNode delete(TreeNode root, int dValue) {

		TreeNode temp = null;

		if (root != null) {
			if (dValue < root.key) {
				root.left = delete(root.left, dValue);
			} else if (dValue > root.key) {
				root.right = delete(root.right, dValue);
			} else {
				if (root.left == null) {
					temp = root.right;
					root.right = null;
					return temp;
				} else if (root.right == null) {
					temp = root.left;
					root.left = null;
					return temp;
				}
				// If it contains two child
				temp = MinBST(root.right);
				root.key = temp.key;
				// deleting inorder successor
				root.right = null;

			}
		}
		return root;

	}

	/*
	 * Finding minimum element in BST minimum element will be in left most
	 * element of BST
	 */
	private TreeNode MinBST(TreeNode root) {
		TreeNode temp = root;

		while (temp.left != null) {
			temp = temp.left;
		}

		return temp;
	}

	public static void main(String args[]) {
		TreeNode parent = new TreeNode(20);
		/* Inserting node into tree */
		TreeNode.insert(parent, 35);
		TreeNode.insert(parent, 24);
		TreeNode.insert(parent, 17);
		TreeNode.insert(parent, 28);
		TreeNode.insert(parent, 40);
		TreeNode.insert(parent, 25);
		TreeNode.insert(parent, 15);
		TreeNode.insert(parent, 16);
		/* Printing post order of element */
		TreeNode.postorder(parent);

	}
}
