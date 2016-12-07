package chegg;

import java.util.concurrent.BlockingQueue;


class InsertObject{
	/*insert method is used for inserting student object into sharedQueue*/
	public void insert(BlockingQueue<Student> sharedQueue){
		/*we are inserting student object in sharedQueue using for loop*/
		for(int i=0; i<300; i++){
			/*creating student object and setting name and time*/
			Student student = new Student();
			student.setStudentName("Student:"+i);
			student.setTimeAmount(i+200);
			try {
				Thread.sleep(15);
				/*Inserting student object into shared queue*/
				sharedQueue.put(student);
				System.out.println("Student Scheduler inserts into shared Queue student:"+i);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}

	}
}

public class StudentScheduler extends Thread {
	/*Creating object of Array Blocking Queue*/
	private final BlockingQueue<Student> sharedQueue;
	/*Creating InsertObject class object*/
	InsertObject insertObject=new InsertObject();
	/*Parameterized constructor of StudentScheduler*/
	public StudentScheduler(BlockingQueue<Student> sharedQueue) {
		super();
		this.sharedQueue = sharedQueue;
	}
	/*As Thread start run method will be called by default*/
	public void run() {
		/*Synchronizing inserObject using synchronized block*/
		synchronized (insertObject) {
			/*calling insert method of InsertObject class to insert student object into sharedQueue*/
			insertObject.insert(sharedQueue);

		}

	}


}
