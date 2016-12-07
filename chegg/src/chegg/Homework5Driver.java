package chegg;

public class Homework5Driver {

	public static void main(String[] args) {
		System.out.println("Part 2:");
		String result = "";

		/* Calling GetDigits method */
		result = HomeWork5Methods.getDigits("1-800-Flowers");
		System.out.println("getDigits(\"1-800-Flowers\") = "+result);

		result = HomeWork5Methods.getDigits("1800FLOWERS");
		System.out.println("getDigits(\"1800FLOWERS\") = "+result);

		result = HomeWork5Methods.getDigits("1-CSE-114-JAVA");
		System.out.println("getDigits(\"1-CSE-114-JAVA\") = "+result);

		result = HomeWork5Methods.getDigits("Seawolf-SBU-1");
		System.out.println("getDigits(\"Seawolf-SBU-1\") = "+result);

	}

}
