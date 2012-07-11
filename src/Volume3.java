/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author it corner
 */
import java.util.Scanner;
public class Volume3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
            //Red price per pack
     Scanner in = new Scanner(System.in);
     System.out.print("Please enter the print for a six-pack; ");
     double packPrice = in.nextInt();
     //Compute pack volume
     final double LITER_PER_OUNCE = 0.0296;
     final double CAN_VOLUME = 12 * LITER_PER_OUNCE;
     final double PACK_VOLUME = 6 * CAN_VOLUME;
     //Compute and print price per liter
     double pricePerLiter = packPrice / PACK_VOLUME;
     System.out.printf("Price per liter : %8.2f",pricePerLiter);
     System.out.println();

        // TODO code application logic here
    }
}
