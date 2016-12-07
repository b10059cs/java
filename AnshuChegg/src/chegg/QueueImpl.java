package chegg;

public class QueueImpl {
	/**
	 * class variable declaration
	 * */
	private static final int capacity = 20;
	int arr[] = new int[capacity];
	int size = 0;
	int top = -1;
	int rear = 0;

	/**
	 * push method is used to push element into queue if top < capacity-1 then
	 * we will push element into queue otherwise we will show queue is full
	 */
	public void push(int data) {
		if (top < capacity - 1) {
			top++;
			arr[top] = data;
			System.out.println("Element " + data + " is pushed to Queue !");
		} else {
			System.out.println("Queue is full !");
		}

	}

	/**
	 * pop method is used to pop element from queue if top greater then rear
	 * then we will pop element from queue otherwise we will show Queue is empty
	 */
	public void pop() {
		if (top >= rear) {
			rear++;
			System.out.println("Poped element from Queue");
		} else {
			System.out.println("Queue is empty !");
		}
	}

	public void display() {
		if (top >= rear) {
			System.out.println("Elements in Queue : ");
			for (int i = rear; i <= top; i++) {
				System.out.println(arr[i]);
			}
		}
	}
/**
 * main method start
 * */
	public static void main(String[] args) {
		/**
		 * Object creation of class QueueImpl
		 * */
		QueueImpl queueDemo = new QueueImpl();
		queueDemo.pop();
		queueDemo.push(10);
		queueDemo.push(15);
		queueDemo.push(54);
		queueDemo.push(65);
		System.out.println("************Displaying Queue after push*************");
		queueDemo.display();
		queueDemo.pop();
		queueDemo.pop();
		System.out.println("**********Displaying Queue after pop************");
		queueDemo.display();
	}
/**
 * main method end
 * */
}
