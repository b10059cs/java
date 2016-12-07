package chegg;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class ProducerConsumerApp {


	public static void main(String args[]){
		//creating ArrayBlocking of size 5
		BlockingQueue<Student> sharedQueue=new ArrayBlockingQueue<>(5);
		//creating instance of StudentScheduler and Professor
		StudentScheduler studentScheduler=new StudentScheduler(sharedQueue);
		Professor professor=new Professor(sharedQueue);

		studentScheduler.setPriority(Thread.MAX_PRIORITY);//setting high priority
		professor.setPriority(Thread.MAX_PRIORITY);//setting high priority
		//Starting both thread
		studentScheduler.start();
		professor.start();

		try {					
			studentScheduler.join();//wait for thread to complete	
			professor.join();/*wait for Professor thread to complete */	
			/*If studentScheduler Thread is not alive then printing message*/
			if(!studentScheduler.isAlive()){
				System.out.println("Professor locked the door and he/she is leaving");

			}				

		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}


	}

}
