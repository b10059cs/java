package chegg;

public class GroceryList {
	/* ListNode Class Declaration */
	class ListNode {
		GroceryItem data;
		ListNode link;

		/* Default constructor */
		public ListNode() {
			super();
			// TODO Auto-generated constructor stub
		}

		/* Parameterized constructor */
		public ListNode(GroceryItem data, ListNode link) {
			super();
			this.data = data;
			this.link = link;
		}

	}

	/* Instance variable declaration */
	ListNode head;
	ListNode current;
	ListNode previous;

	/* Default constructor and initialization of head,current,previous */
	public GroceryList() {
		super();
		this.head = new ListNode();
		this.current = head;
		this.previous = head;
	}
	/* Method Implementations */

	/* It will return next node */
	public ListNode goToNext(ListNode temp) {

		if (temp != null) {
			temp = temp.link;
			return temp;
		}

		return null;
	}

	/*
	 * It will return data from current node
	 * 
	 * @param ListNode
	 * 
	 * @return GroceryItem
	 */
	public GroceryItem getDataAtCurrent(ListNode temp) {
		if (temp.data != null) {
			GroceryItem groceryItem = temp.data;
			return groceryItem;
		}

		return null;
	}

	/*
	 * It set the data of current node
	 * 
	 * @param GroceryItem
	 * 
	 * @return ListNode
	 */
	public ListNode setDataAtCurrent(GroceryItem item) {
		if (item.getValue() > 0) {
			ListNode current = new ListNode();
			current.data = item;
			current.link = null;
			return current;
		}

		return null;
	}

	/*
	 * It add new item into grocery List
	 * 
	 * @param GroceryItem If head is null then it will add item to head
	 * otherwise It will add item to end
	 */
	public void addItem(GroceryItem item) {
		if (item.getName() != null && item.getName() != "" && item.getValue() > 0) {
			if (head.data == null) {
				head.data = item;
				head.link = null;
			} else {
				ListNode temp = head;
				while (temp.link != null) {
					temp = goToNext(temp);
				}
				insertAfterCurrent(temp, item);

			}
		}

	}

	/* Insert Node after current node */
	public void insertAfterCurrent(ListNode temp, GroceryItem item) {
		ListNode node = setDataAtCurrent(item);
		temp.link = node;
	}

	/*
	 * Delete current node
	 * 
	 * @param groceryList and name
	 * 
	 * @return ListNode
	 */
	public ListNode deleteCurrentNode(GroceryList list, String name) {
		ListNode head = list.head;
		this.head = head;
		this.current = head;
		this.previous = head;
		if (head.data.getName().equalsIgnoreCase(name)) {
			this.head = goToNext(head);
			this.previous = null;
			list.head = this.head;
		} else {
			while (current != null) {
				if (current.data.getName().equalsIgnoreCase(name)) {
					this.previous.link = current.link;
					list.head = head;
				}
				this.previous = current;
				current = goToNext(current);
			}
		}

		return head;
	}

	/*
	 * Printing GroceryList
	 * 
	 * @param GroceryList
	 */
	public void showList(GroceryList list) {
		if (list != null) {
			ListNode head = list.head;
			while (head != null) {
				System.out.println("Name:" + head.data.getName() + "\t Value:" + head.data.getValue());
				head = goToNext(head);
			}
		}

	}

	/*
	 * It will check for item name in grocery List
	 * 
	 * @param GroceryList and name
	 * 
	 * @return Boolean
	 */
	public Boolean contains(GroceryList list, String name) {
		if (!name.equals("") && name != null) {
			ListNode head = list.head;
			while (head != null) {
				if (head.data.getName().equalsIgnoreCase(name)) {
					return Boolean.TRUE;
				}
				head = goToNext(head);
			}
			return Boolean.FALSE;
		}

		return Boolean.FALSE;
	}

	/* Calculating Total cost of items in GroceryList */
	public int totalCost(GroceryList list) {

		ListNode head = list.head;
		int totalCost = 0;
		while (head != null) {
			totalCost += head.data.getValue();
			head = goToNext(head);
		}

		return totalCost;
	}

}
