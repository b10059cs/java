package chegg;

import java.util.concurrent.BlockingQueue;

public class Professor extends Thread{
	//creating ArrayBlocking instance
	private BlockingQueue<Student> sharedQueue;
	/*Parameterized constructor*/
	public Professor(BlockingQueue<Student> sharedQueue) {
		this.sharedQueue = sharedQueue;
	}
	/*As Thread start run method will be called by default*/
	public void run() {
		try{
			/*Variable declaration*/
			Student student;
			Boolean flag=Boolean.TRUE;
			int receiveObject=0;
			//consuming messages from shared queue
			while(true){
				/*If Queue is empty and flag is true then  professor playing Halo*/
				if(sharedQueue.isEmpty()&&flag==Boolean.TRUE){
					System.out.println("Professor playing Halo ");
					flag=Boolean.FALSE;
				}else{
					/*we are taking student object from shared queue*/
					student=sharedQueue.take();
					receiveObject++;
					System.out.println("Professor start conversations with "+student.getStudentName());
					sleep(student.getTimeAmount());
					flag=Boolean.TRUE;
				}
				if(receiveObject==300){
					break;
				}
			}


		}catch(InterruptedException e) {
			e.printStackTrace();
		}
	}

}
