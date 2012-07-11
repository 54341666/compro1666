/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author it corner
 */
public class FloatDouble {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        if (args.length == 2) {
int a = Integer.parseInt(args[0]);
int b = Integer.parseInt(args[1]);

double c = Math.sqrt(a * a + b * b);
System.out.println(c);

        // TODO code application logic here
    }
}
}