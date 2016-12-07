package chegg;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Sentence {
	/*
	 * This method will check only character of English a-z or A-Z If you want
	 * check for all language supported by java then use isLetter method
	 */
	public static void countLetters(String sentence) {
		int countLetters = 0;
		/* ForEach loop start */
		for (int i = 0; i < sentence.length(); i++) {
			if (Character.isDigit(sentence.charAt(i)) || Character.isWhitespace(sentence.charAt(i))) {

			} else {
				countLetters++;
			}
		} /* forEach loop End */
		System.out.println("Total number of Letters: " + countLetters);
	}

	public static void frequencyWord(String sentence) {
		/* Storing Character and their count */
		Map<Character, Integer> chMap = new HashMap<>();
		char[] charArray = sentence.toCharArray();
		/* ForEach loop start */
		for (char ch : charArray) {
			/*
			 * If key already exist in map then we will increase value by 1 else
			 * we insert count as 1
			 */
			if (chMap.containsKey(ch)) {
				chMap.put(ch, chMap.get(ch) + 1);
			} else {
				chMap.put(ch, 1);
			}

		}
		/* Getting max frequency letter in sentence */
		// iterating over keys only
		Integer max = 0;
		String ch = "";
		for (Character key : chMap.keySet()) {
			int val = chMap.get(key);
			if (!Character.isWhitespace(key)) {
				if (max < val) {
					max = val;
					ch = key + "";
				}
			}
		}
		/* Printing max frequency letter */
		System.out.println("max frequency Character is: " + ch);

	}

	public static void checkCharacter(String sentence) {

		int cntCharacters = 0;
		/*
		 * for loop start to count number of letters we used isLetter function
		 */
		for (int i = 0; i < sentence.length(); i++) {
			if (Character.isLetter(sentence.charAt(i))) {
				cntCharacters++;
			}
		}
		/* For loop End */

		System.out.println("Total number of Characters: " + cntCharacters);

	}

	public static void countWords(String sentence) {
		/* splitting sentence based on space for words */
		String words[] = sentence.split(" ");
		/*
		 * calculating size of words array it will give total number of words in
		 * an array
		 */
		int count = words.length;

		System.out.println("Number of words in sentence: " + count);

	}

	public static void countWordsStartWithVowles(String sentence) {

		/* splitting sentence based on space for words */
		String words[] = sentence.split(" ");
		/*
		 * calculating size of words array it will give total number of words in
		 * an array
		 */
		int count = words.length;
		int cntWords = 0;
		for (int i = 0; i < count; i++) {
			/* getting string from words array */
			String word = words[i];
			/* Getting first character from string */
			String character = word.charAt(0) + "";

			if (character.equalsIgnoreCase("a") || character.equalsIgnoreCase("e") || character.equalsIgnoreCase("i")
					|| character.equalsIgnoreCase("o") || character.equalsIgnoreCase("u")) {
				cntWords++;
			}

		}
		System.out.println("Total number of Words that start with Vowels: " + cntWords);

	}

	public static void main(String[] args) {

		/* Creating Scanner class object */
		Scanner input = new Scanner(System.in);
		System.out.println("Please Enter an sentence");
		String sentence = input.nextLine();
		/* Methods testing */
		Sentence.checkCharacter(sentence);
		Sentence.countLetters(sentence);
		Sentence.countWords(sentence);
		Sentence.countWordsStartWithVowles(sentence);
		Sentence.frequencyWord(sentence);

		input.close();
		/* closing input */
	}

}
