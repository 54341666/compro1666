/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author it corner
 */
public class InctegerDecOperator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int x = 1, y = 1;
        int a = 0, b = 0;
            x++; ++y;
            System.out.println("a = " + a + ", b = " + b + ", x = " + x + ", y = " + y);
 //a = 0, b = 0, x = 2, y = 2

 a = x++; b = ++y;
System.out.println("a = " + a + ", b = " + b + ", x = " + x + ", y = " + y);
 //a = 2, b = 3, x = 3, y = 3

 a = x--; b = --y;
System.out.println("a = " + a + ", b = " + b + ", x = " + x + ", y = " + y);
 //a = 3, b = 2, x = 2, y = 2


        // TODO code application logic here
    }
}
