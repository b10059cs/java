package chegg;

import java.util.Scanner;

public class VideoGameCollectionFrontEnd {

	public static void main(String[] args) {
		//create and connect scanner object to keyboard
		Scanner sc = new Scanner(System.in);
		VideoGameManager vG = new VideoGameManager();
		System.out.println("Welcome to the video game database!");
		Boolean quit = false;
		try{
		while(quit == Boolean.FALSE)
		{
			
		
			
		System.out.println("Enter 1 to load the video game database");
		System.out.println("Enter 2 to search the database");
		System.out.println("Enter 3 to print current results");
		System.out.println("Enter 4 to print current results to file");
		System.out.println("Enter 0 to quit");
		int input = sc.nextInt();
		
		switch(input){
		case 0: input = 0;
			System.out.println("Good Bye");
			quit = Boolean.TRUE;
			break; 
			
		case 1: input = 1;
			System.out.println("Enter the file Name");
			String fileName = sc.next();
			vG.ReadGameFile(fileName);
			break;
		case 2: input = 2;
			System.out.println("Enter the name of the game or '*' for all names");
			String nameInput = sc.next();
			System.out.println("Enter the name of the console or '*' for all consoles");
			String consoleInput = sc.next();
			vG.PrintSearchCriteria(nameInput,consoleInput);
			break;
		case 3: input = 3; 
		     vG.PrintCurrentResults();
			break;
		case 4: input = 4;
			
			System.out.println("Enter the file name to print out.");
			String fileNamePrintToFile = sc.next();
			System.out.println("Append to file ? True or False");
			String appendToFile = sc.next();
			if(appendToFile.equalsIgnoreCase("true"))
			{
				vG.WriteToGameFile(fileNamePrintToFile, true);
			}
			else if(appendToFile.equalsIgnoreCase("false"))
			{
				vG.WriteToGameFile(fileNamePrintToFile, false);
			}
			else
			{
				System.out.println("Incorrect Response, auto shutdown");
				System.exit(0);
			}
		default: 
			break;
		
			}
		
		}
		sc.close();
	}
	catch(Exception e)
	{
		System.out.println("error");
		System.exit(0);
	}
  }

}
