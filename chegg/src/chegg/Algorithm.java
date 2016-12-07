package chegg;
import java.util.Scanner;

public class Algorithm {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int amount_of_change_in_galleons, amount_of_change_in_knuts, amount_of_change_in_sickles, amount_sale_in_galleons, amount_sale_in_knuts, amount_sale_in_sickles, money_given_in_galleons, money_given_in_knuts, money_given_in_sickles;
        System.out.print("Enter value of amount sale in galleons: ");
        amount_sale_in_galleons = in.nextInt();
        System.out.print("Enter value of amount sale in knuts: ");
        amount_sale_in_knuts = in.nextInt();
        System.out.print("Enter value of amount sale in sickles: ");
        amount_sale_in_sickles = in.nextInt();
        System.out.print("Enter value of money given in galleons: ");
        money_given_in_galleons = in.nextInt();
        System.out.print("Enter value of money given in knuts: ");
        money_given_in_knuts = in.nextInt();
        System.out.print("Enter value of money given in sickles: ");
        money_given_in_sickles = in.nextInt();
        amount_of_change_in_knuts=((money_given_in_galleons-amount_sale_in_galleons)*17+(money_given_in_sickles-amount_sale_in_sickles))*29+money_given_in_knuts-amount_sale_in_knuts;
        
        amount_of_change_in_sickles=(amount_of_change_in_knuts-amount_of_change_in_knuts%29)/29;
       
        amount_of_change_in_knuts=amount_of_change_in_knuts%29;
       
        amount_of_change_in_galleons=(amount_of_change_in_sickles-amount_of_change_in_sickles%17)/17;
       
        amount_of_change_in_sickles=amount_of_change_in_sickles%17;
        System.out.println("Value of amount of change in galleons: " + amount_of_change_in_galleons);
        System.out.println("Value of amount of change in knuts: " + amount_of_change_in_knuts);
        System.out.println("Value of amount of change in sickles: " + amount_of_change_in_sickles);
    }
}