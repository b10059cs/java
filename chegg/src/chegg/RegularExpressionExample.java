package chegg;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularExpressionExample {

	public static void main(String[] args) {
		/*Scanner class for input*/
		Scanner input=new Scanner(System.in);
		/*String array for storing string from console*/
		String linesArray[];
		int lines;
		/*Prompt for number of lines to be given as input*/
		System.out.println("Please Enter numbers of line do u wana enter");
		lines=input.nextInt();
		/*creating string array of size lines+1*/
		linesArray=new String[lines];
		/*After nextInt we should have nextLine() call for avoiding "" string*/
		input.nextLine();
		/*getting input from user and storing into linesArray*/
		for(int i=0;i<lines;i++){
			linesArray[i]=input.nextLine();
		}
		System.out.println("*********output**********");
		/*looping all string from linesArray*/
		for(int j=0;j<linesArray.length;j++){
			String line=linesArray[j];

			// Create a Pattern object
			Pattern r = Pattern.compile("//");

			// Now create matcher object.
			Matcher m = r.matcher(line);
			if (m.find( )) {
				/*Splitting array by // so we can print uppercase after the //*/
				String tokens[]=line.split("//");
				System.out.print(tokens[0]);
				/*After first token we need to print string in Uppercase*/
				for(int i=1;i<tokens.length;i++){
					System.out.print("//"+tokens[i].toUpperCase());
				}
			}else{
				System.out.print(line);
			}
			System.out.println();


		}
		input.close();

	}

}
