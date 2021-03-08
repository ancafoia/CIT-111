/**
 * @author Anca Foia
 * @CCAC CIT-111-Z03
 */
package week5;

import java.util.Scanner;

public class WhileWithScanner {

    public static void main(String[] args) {
        int numLoops = 0;
        int loopControl = 0;

        // build scanner object
        Scanner scanner = new Scanner(System.in);

        // get an int from the user
        System.out.println("How many loops shall I print?");
        loopControl = scanner.nextInt();

        // loops as long as numLoops is less than or equal to loopControl
        while (numLoops <= loopControl) {
            System.out.println("The value of numLoops: " + numLoops);
            numLoops = numLoops + 1;
        } // close while

        System.out.println("...After the while loop");
        scanner.close();

    }// close main
} // close class
