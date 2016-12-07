package chegg;

import java.util.Scanner;

public class JavaVendingMachine {
	/**
	 * constant Variable declarations
	 */
	public static final int SNICKERS_PRICE = 80;
	public static final int POTATO_CHIPS_PRICE = 75;
	public static final int CHEWING_GUM_PRICE = 40;
	public static final int POP_TARTS_PRICE = 95;

	public static int CENTS = 1;
	public static int NICKEL = 5 * CENTS;
	public static int DIMES = 10 * CENTS;
	public static int QUARTER = 25 * CENTS;

	/**
	 * Main method start
	 */
	public static void main(String args[]) {
		/**
		 * Scanner class object for input
		 */
		Scanner input = new Scanner(System.in);
		int choice = 6;
		while (true) {
			/**
			 * Main MENU Display
			 */
			System.out.println("Java Vending Machine");
			System.out.println("(1). Chewing Gum -- 40cent\n" + "(2). Potato Chips -- 75 cent\n"
					+ "(3). Snickers -- 80 cent\n" + "(4). Pop Tarts -- 95 cent");
			System.out.print("Please make your selection (1, 2, 3, 4 or type 5 to EXIT) : ");
			try {
				// taking input from user
				String str = input.next();
				choice = Integer.parseInt(str);
			} catch (Exception e) {
				System.out.println("Please Enter integer input only");
				// on exception setting default value
				choice = 6;

			}

			switch (choice) {

			case 1:
			case 2:
			case 3:
			case 4:
				System.out.print("Please enter the money for item " + choice + ":");
				int money = input.nextInt();
				//If entered money is not divisible by 5
				if (money % 5 != 0) {
					System.out.println("You are trying to submit pennis");
					break;
				} else {
					int remAmount = 0, additionalMoney, change = 0;
					System.out.println("You have submitted " + money + " cents for item " + choice);
					if (choice == 1) {
						remAmount = JavaVendingMachine.CHEWING_GUM_PRICE - money;
					} else if (choice == 2) {
						remAmount = JavaVendingMachine.POTATO_CHIPS_PRICE - money;
					} else if (choice == 3) {
						remAmount = JavaVendingMachine.SNICKERS_PRICE - money;
					}
					if (choice == 4) {
						remAmount = JavaVendingMachine.POP_TARTS_PRICE - money;
					}
					if (remAmount > 0) {
						System.out.println("You must submit " + remAmount + " cents more:");
						System.out.print("Please enter additional change for your item:");
						additionalMoney = input.nextInt();
						//if again user enter less money
						while (additionalMoney < remAmount) {
							int reMoney;
							System.out.println("You must submit " + (remAmount - additionalMoney) + " cents more:");
							System.out.print("Please enter additional change for your item:");
							reMoney = input.nextInt();
							additionalMoney += reMoney;

						}
						if (additionalMoney > remAmount) {
							System.out
							.println("You have to given " + (additionalMoney - remAmount) + " cents too much.");
							change = additionalMoney - remAmount;
							System.out.println("Your change is " + change + " cents");

						}
						if (change > 0) {
							//calculating quarter,dimes and nickel
							int quarter = change / QUARTER;
							int dimes = (change - quarter * QUARTER) / DIMES;
							int nickel = (change - quarter * QUARTER - dimes * DIMES) / NICKEL;
							System.out.println("Your change is " + quarter + " quarters, " + dimes + " dimes, and "
									+ nickel + " nickels");
							System.out.println("Thanks for your patronage! Enjoy your treat");
						} else {
							System.out.println("Thank You ! Have a Nice Day!");
							System.out.println("NO dollar and pennies");
						}

					} else {
						System.out.println("Thank You ! Have a Nice Day!");
						System.out.println("NO dollar and pennies");
					}

				}
				break;
			case 5:
				System.out.println("Thank You ! Have a Nice Day!");
				System.out.println("NO dollar and pennies");
				System.exit(0);
			default:
				System.out.println("Wrong input");
				break;

			}

		}
	}
}
