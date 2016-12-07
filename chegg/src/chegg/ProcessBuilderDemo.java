package chegg;

import java.io.IOException;

public class ProcessBuilderDemo {
	public static void main(String[] args) throws IOException {

		   // create a new list of arguments for our process
		   String[] list = {"cat", "App.java"};

		   // create the process builder
		   ProcessBuilder pb = new ProcessBuilder(list);

		   // set the command list
		   pb.command(list);
		   Process p = pb.start();

		   // print the new command list
		   System.out.println("" + pb.command());
		   }
}
