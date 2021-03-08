/**
 * @author Anca Foia
 * @CCAC CIT-111-Z03
 */
package week5;

public class SimpleWhile {
    public static void main(String[] args) {
        int numLoops = 0;
        while (numLoops <= 10) {
            System.out.println("The value of numLoops: " + numLoops);
            numLoops = numLoops + 1;
        } // close while
    } // close main
} // close class
