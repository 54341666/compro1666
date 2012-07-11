/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package HomeWork;

/**
 *
 * @author it corner
 */
public class Grid {

    /**
     * @param args the command line arguments
     */
    public static void star(){
        for (int i = 0;i<2;i++){
            for(int j =0;j<2;j=j+1)
            System.out.println("+--+--+--+");
        }
        System.out.println();
    }
    public static void main (String[]args){
        star();
            // TODO code application logic here
    }
}

