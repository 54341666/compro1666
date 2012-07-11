/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author it corner
 */
import java.util.Scanner;
public class Intitials {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
                Scanner in = new Scanner(System.in);
        //Get the names of the couple
        System.out.print("Enter your first name:");
        String first = in.nextLine();
        System.out.print("Enter your significant other's first name:");
        String second = in.nextLine();
        //Compute and display the inscription
        String initials = first.substring(0,1);
        + "&" + second.substring(0,1);
        System.out.println(initials);

        // TODO code application logic here
    }
}
