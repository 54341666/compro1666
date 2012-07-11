/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author it corner
 */
import java.util.Scanner;
public class Volume2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
                final double BOTTLE_VOLUME = 2;
        final double LITER_PER_OUNCE = 0.0296;
        final double CAN_VOLUME = 12 * LITER_PER_OUNCE;
        //Display prompt
        System.out.print("Please enter the number of bottles: ");
        //Read number of bottles
        Scanner in = new Scanner(System.in);
        int bottles = in.nextInt();
        //Start the computation of the total volume
        double totalVolume = bottles * BOTTLE_VOLUME;
        //Read number of cans
        System.out.print("Please enter the number of cans: ");
        int cans = in.nextInt();
        double additionalVolume = cans * CAN_VOLUME;
        //Upadate the total volume
        totalVolume = totalVolume + additionalVolume;
        System.out.print("Total volume:");
        System.out.print(totalVolume);

        // TODO code application logic here
    }
}
