/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author it corner
 */
public class Roundoff {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
                double price = 4.3;
        int cents = (int) (100*price); //Should be 100* 4.35 =435
        System.out.println(cents); //Print 434!

        // TODO code application logic here
    }
}
