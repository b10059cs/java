package chegg;

public class DoublyLinkedList {
	/*Data member variable declaration*/
	private Node head;
	private int count;
	/**default constructor*/
	public DoublyLinkedList() {
		/*Initializing variable*/
		head=null;
		count =0;
	}
	/*Insert at beginning in doubly linked list*/
	public void insertBeginning(String name){
		/*checking head is null then we will add node at head*/
		if(head==null){
			head=new Node(name, null, null);
			count++;
		}else{
			/*else create temp node and setting next to head 
			 * and then making temp to head*/
			Node temp=new Node(name,null,null);
			temp.setNext(head);
			head.setPrev(temp);
			head=temp;
			count++;
		}
	}
	public void printList(){
		Node temp=head;
		/*Printing element of doubly list*/
		while(temp!=null){
			System.out.println(temp.getData());
			temp=temp.getNext();
		}
	}
	/*Returning count from doubly linked list*/
	public int count(){
		return count;
	}
	/*deleting specific node from doubly linked list*/
	public void delete(String name){

		Node current=head,previous=head;
		/*if it is head node to be deleted*/  
		if(head.getData().equals(name)){
			current=head.getNext();
			current.setPrev(null);
			head=current;
			previous=head;
		}else{
			/*If node in middle of list*/
			while(current.getNext()!=null){
				if(current.getData().equals(name)){
					current.getNext().setPrev(previous);
					previous.setNext(current.getNext());	
					count--;
					break;
				}
				previous=current;
				current=current.getNext();
			}
			/*If node is at last*/
			if(current.getNext()==null){
				if(current.getData().equals(name)){
					previous.setNext(null);
					count--;
				}
			}	
		}

	}
	/*deleting all nodes from list by assigning head to null
	 * and memory releasing take care by garbage collector*/
	public void clear(){
		head=null;
		count=0;
	}
	/*Inserting element in alphabetic order*/
	public void insertAlpha(String name){
		Node current=head,previous=head;
		/*creating new node*/
		Node newNode=new Node(name,null,null);
		/*if head node is null*/
		if(head==null){
			head=newNode;
			count++;
		}else{
			/*please read about compareTo() method about returning value*/
			if(head.getData().compareTo(name)>0){
				newNode.setNext(head);
				head=newNode;
				count++;
			}else{	
				/*condition for getting position of node to be inserted*/
				while(current!=null&&current.getData().compareTo(name)<=0){
					previous=current;
					current=current.getNext();
				}
				/*if node need to be inserted at last*/
				if(current==null){
					previous=newNode;
				}else{
					/*If node need to inserted in middle*/ 
					newNode.setNext(current);
					previous.setNext(newNode);
					current.setPrev(newNode);
					newNode.setPrev(previous);

				}
				count++;
			}

		}

	}
	/*Main method start*/
	public static void main(String args[]){
		/*creating object of doubly linked list*/
		DoublyLinkedList doublyLinkedList=new DoublyLinkedList();
		doublyLinkedList.insertBeginning("sunita");
		doublyLinkedList.insertBeginning("lalchand");
		/*calling alphabetic order method*/
		doublyLinkedList.insertAlpha("ramsingh");
		doublyLinkedList.insertBeginning("Lokesh");
		doublyLinkedList.insertBeginning("Pritam");
		/*****printing list********/
		doublyLinkedList.printList();
		/*******getting list size*********/
		System.out.println("Size of List is "+doublyLinkedList.count());
		/***deleting particular name from list**********/
		doublyLinkedList.delete("sunita");
		/*****printing listAfter deletion********/
		doublyLinkedList.printList();
		/*******getting list size*********/
		System.out.println("Size of List is "+doublyLinkedList.count());
	}

}
