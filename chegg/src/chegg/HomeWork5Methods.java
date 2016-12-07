package chegg;

public class HomeWork5Methods {

	/*
	 * GetDigits function methods which takes phoneNumber of String type 1)
	 * First we convert phoneNumber to upper case 2) and getting character from
	 * specific position using charAt() function 3) If Character is matched with
	 * specific condition then we are setting value according to condition
	 */

	public static String getDigits(String phoneNumber) {
		String result = "";// result variable for storing result
		/* Converting into upper case */
		String upperCaseLetter = phoneNumber.toUpperCase();
		/* Running Loop up to number of character */
		for (int i = 0; i < upperCaseLetter.length(); i++) {
			/* Getting Character from specific position */
			String s = Character.toString(upperCaseLetter.charAt(i));

			if (s.equals("A") || s.equals("B") || s.equals("C")) {
				result += 2;
			}

			else if (s.equals("D") || s.equals("E") || s.equals("F")) {
				result += 3;
			}

			else if (s.equals("G") || s.equals("H") || s.equals("I")) {
				result += 4;
			}

			else if (s.equals("J") || s.equals("K") || s.equals("L")) {
				result += 5;
			}

			else if (s.equals("M") || s.equals("N") || s.equals("O")) {
				result += 6;
			}

			else if (s.equals("P") || s.equals("Q") || s.equals("R") || s.equals("S")) {
				result += 7;
			} else if (s.equals("T") || s.equals("U") || s.equals("V")) {
				result += 8;
			}

			else if (s.equals("W") || s.equals("X") || s.equals("Y") || s.equals("Z")) {
				result += 9;
			} else if (s.equals("0") || s.equals("1") || s.equals("2") || s.equals("3") || s.equals("4")
					|| s.equals("5") || s.equals("6") || s.equals("7") || s.equals("8") || s.equals("9")) {
				result += s;
			}
		}
		/* returning Result */
		return result;
	}

}
