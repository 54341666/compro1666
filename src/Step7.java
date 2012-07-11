/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author it corner
 */
import java.util.Scanner;
public class Step7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
                Scanner in = new Scanner(System.in);
        final int PENNIES_PER_DOLLAR = 100;
        final int PENNIES_PER_QUARTER = 25;
        System.out.print("Enter bill value (1=$1 bill,5 = $5 bill, etc.):");
        int billValue = in.nextInt();
        System.out.print("Enter item price in pennies :");
        int itemPrice = in.nextInt();
        //Compute change due
        int amountDue = PENNIES_PER_DOLLAR * billValue - itemPrice;
        int dollarCoins = amountDue / PENNIES_PER_DOLLAR;
        amountDue = amountDue % PENNIES_PER_DOLLAR;
        int quarters = amountDue / PENNIES_PER_QUARTER;
        //Print change due
        System.out.printf("Dollar coins : %6d", dollarCoins);
        System.out.println();
        System.out.printf("Quartets :     %6d\n", quarters);
        System.out.println();


        // TODO code application logic here
    }
}
