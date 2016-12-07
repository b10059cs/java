package chegg;

import java.io.BufferedReader;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.PrintWriter;
import java.util.LinkedList;
import java.util.Scanner;

public class VideoGameManager {

	Scanner keyboard = new Scanner(System.in);
	//array list
	private LinkedList<VideoGame> games; 
	private LinkedList<VideoGame> currentResult;
	//tab
	private static final String delim = "\t";
	
	//Default constructor
	public VideoGameManager(){
		games = new LinkedList<VideoGame>();
	}
	
	
	public void ReadGameFile(String filePath)
	{
		//This reconstructs a new instance of the VideGame Linked list.
		//This is done to clear the Linked list
		games = new LinkedList<VideoGame>();
		BufferedReader br = null;
		try
		{
			//Create a new file Scanner
			//Scanner fileScanner = new Scanner(new File(fileName));
			br=new BufferedReader(new FileReader(filePath));
			String fileLine="";
			//Reads each line in the file one-by-one
			while((fileLine=br.readLine())!=null)
			{
				
				//That line is then split using the delimiter (\t)
				String[] splitStrings = fileLine.split(delim);
				
				//If the newly created array is not 2 items in length then
				//that line is not correctly formatted and should be ignored.
				if(splitStrings.length != 2)
					continue;
				String gameName = splitStrings[0];//The first element is the game name
				String console = splitStrings[1];//Next is the console
				VideoGame newVideoGame = new VideoGame(gameName,console); 
				games.add(newVideoGame);//Added to the Linked list
			}
			br.close();
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
		
	}
	public void WriteToGameFile(String fileName, boolean append)
	{
		if(games == null)//if the file name is null then return
			return;
		try
		{
			//Creates the new instance of a print writer
			PrintWriter fileWriter = new PrintWriter(new FileOutputStream(fileName,append));
			for(VideoGame aVideoGame : games)
			{
				//Prints to the file
				fileWriter.println(aVideoGame.getGameName()+delim+
									aVideoGame.getGameConsole());
			}
			fileWriter.close();
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
	}
	//returns an array list of video games based on a search criterion (name and console)
	public void PrintSearchCriteria(String nameInput, String consoleInput)
	{
		
		currentResult=new LinkedList<VideoGame>();
		for(VideoGame aVideoGame : games)
		{
			String gameName=aVideoGame.getGameName().toLowerCase();
			String consoleName=aVideoGame.getGameConsole().toLowerCase();
			if(gameName.contains(nameInput.toLowerCase()) == true && consoleName.contains(consoleInput.toLowerCase()) == true)
			{
				VideoGame newVideoGame = new VideoGame(aVideoGame.getGameName(),aVideoGame.getGameConsole()); 
				currentResult.add(newVideoGame);
				System.out.println(newVideoGame.getGameName()+delim+newVideoGame.getGameConsole());
				 
			}
			else if(gameName.contains(nameInput) == true && consoleInput.equalsIgnoreCase("*"))
			{
				VideoGame newVideoGame = new VideoGame(aVideoGame.getGameName(),aVideoGame.getGameConsole()); 
				currentResult.add(newVideoGame);
				System.out.println(newVideoGame.getGameName()+delim+newVideoGame.getGameConsole());
				 
			}
			else if(gameName.equalsIgnoreCase("*") && consoleName.contains(consoleInput) == true)
			{
				VideoGame newVideoGame = new VideoGame(aVideoGame.getGameName(),aVideoGame.getGameConsole()); 
				currentResult.add(newVideoGame);
				System.out.println(newVideoGame.getGameName()+delim+newVideoGame.getGameConsole());
				 
			}
			
		}
	}
	
	public void PrintCurrentResults()
	{
		System.out.println("**************Current Searched result*************");
		for(VideoGame aVideoGame : currentResult)
		{
			System.out.println(aVideoGame.getGameName()+delim+
									aVideoGame.getGameConsole());
		}
	}
	
	
}