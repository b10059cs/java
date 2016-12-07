package chegg;

import java.util.Scanner;

public class MethodCollection {
	/*countTokens method implementation
	 * Tokenizing string using Scanner
	 * In loop we are counting total tokens of String*/
	public static int countTokens(String sentence) {
		int count=0;
		// create a new scanner with the specified String Object
		Scanner scanner = new Scanner(sentence);
		while(scanner.hasNext()){
			count++;
			scanner.next();
		}
		scanner.close();
		return count;
	}
	/*isInteger method implementation
	 * @param String type
	 * while parsing if it throw exception then it is not integer
	 * else it is integer*/
	public static Boolean isInteger(String token){
		try { 
			Integer.parseInt(token); 
		} catch(NumberFormatException e) { 
			return false; 
		} catch(NullPointerException e) {
			return false;
		}
		// only got here if we didn't return false
		return true;
	}
	/*countTokensThatAreNotInt method implementation
	 * @param String type
	 * Tokenizing string using Scanner and counting number of tokens 
	 * that are not integer*/
	public static int countTokensThatAreNotInt(String sentence) {
		int count=0;
		// create a new scanner with the specified String Object
		Scanner scanner = new Scanner(sentence);
		while(scanner.hasNext()){					
			String string=scanner.next();
			if(!isInteger(string)){
				count++;
			}
		}
		scanner.close();

		return count;
	}
	/*describeSign method implementation
	 * @param Integer
	 * @return negitive if number is less then 0 else non-negitive*/
	public static String describeSign(int number){
		if(number<0){
			return "negitive";
		}else{
			return "non-negative";
		}


	}
	/*isEvenlyDivisibleBySeven method implementation
	 * @param integer type
	 * Modulus of number with 7 is 0 then it is divisible by seven and return true
	 * otherwise return false*/
	public static Boolean isEvenlyDivisibleBySeven(int number){
		if(number%7==0){
			return Boolean.TRUE;
		}else{
			return Boolean.FALSE;
		}
	}
	/*MakeLine method Implementation
	 * @param char edge, char inner, int width
	 * @return edge+line+edge*/
	public static String makeLine(char edge, char inner, int width) {
		String line = "";
		int i = 0;
		while (i < width - 2) {
			line = line + inner;
			i = i + 1;
		}
		return edge + line + edge;
	}
	/*makeSquare method implementation
	 * calling makeLine method internally for making line
	 * create one string variable for |  |
	 * @return makeLine+square+makeLine*/
	public static String makeSquare(int width) {
		if(width>=2){
			String makeLine=makeLine('+', '-', 7);
			int i=0;
			String square="";
			while (i < width - 2) {
				square+="| |\n";
				i++;
			}
			return makeLine+"\n"+square+makeLine;
		}else{

			return "Width must be greater then or equal to 2";
		}
	}
	/*capitalizeLastCharacter method implementation
	 * @param String
	 * getting substring from word up to length-1(substring method of String class)
	 * and getting character at position of length-1
	 * appending upper case char to substring*/
	public static String capitalizeLastCharacter(String word) {
		String substr=word.substring(0,word.length()-1);
		String ch=word.charAt(word.length()-1)+"";
		return substr.concat(ch.toUpperCase());
	}
	/*capitalizeLastCharactersInSentence method implementation
	 * @param String
	 * Tokenizing String by Scanner with space
	 * Capitalizing last character of every token by capitalizeLastCharacter method
	 * @return result*/
	public static String capitalizeLastCharactersInSentence(String sentence) {
		Scanner scanner=new Scanner(sentence);
		String result="";

		while(scanner.hasNext()){
			String token=scanner.next();
			result+=capitalizeLastCharacter(token)+" ";
		}
		scanner.close();      
		return result;
	}
	/*Main method start*/
	public static void main(String[] args) {
		int noOfTokens=MethodCollection.countTokens("this is a test");
		System.out.println("Number of tokens :"+noOfTokens);
		int notInt=MethodCollection.countTokensThatAreNotInt("12 test");
		System.out.println("Number of Tokens that are not integer: "+notInt);
		String capitalizeLastCharacter=MethodCollection.capitalizeLastCharacter("test");
		System.out.println("Last Character capitalized: "+capitalizeLastCharacter);
		String capitalizeLastCharactersInSentence=MethodCollection.capitalizeLastCharactersInSentence("Hello there");
		System.out.println("Last character capatelized in sequence: "+capitalizeLastCharactersInSentence);
		String makeSquare=MethodCollection.makeSquare(7);
		System.out.println("<pre>");
		System.out.println(makeSquare);
		System.out.println("</pre>");

	}
	/*Main Method end*/

}
