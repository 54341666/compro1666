/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author it corner
 */
public class IntegerRage {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int max = Integer.MAX_VALUE;
System.out.println("Overflow:");
System.out.println(max); // 2147483647
System.out.println(max + 1); // -2147483648
System.out.println(max + 2); // -2147483647

int min = Integer.MIN_VALUE;
System.out.println("Unceerflow:");
System.out.println(min); // -2147483648
System.out.println(max - 1); // 2147483647
System.out.println(max - 2); // 2147483646

        // TODO code application logic here
    }
}
