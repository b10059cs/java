package chegg;

public class Node {
	/*Data member declaration*/
private String data;
private Node next;
private Node prev;
/*Parameterized constructor*/
public Node(String data, Node next, Node prev) {
	super();
	this.data = data;
	this.next = next;
	this.prev = prev;
}
/*getter and setter of data member variable*/
public String getData() {
	return data;
}

public void setData(String data) {
	this.data = data;
}

public Node getNext() {
	return next;
}

public void setNext(Node next) {
	this.next = next;
}

public Node getPrev() {
	return prev;
}

public void setPrev(Node prev) {
	this.prev = prev;
}



}
