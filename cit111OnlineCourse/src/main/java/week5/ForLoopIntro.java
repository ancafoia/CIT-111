/**
 * @author Anca Foia
 * @CCAC CIT-111-Z03
 */
package week5;

import java.util.Scanner;

public class ForLoopIntro {
    public static void main(String[] args) {
        // delcare variable for controlling number of loops
        int loopControl;
        
        // create a scanner
        Scanner scanner = new Scanner(System.in);
        
        // read an int from the user
        System.out.println("How many loops shall I print with for()?");
        // grab int from user
        loopControl = scanner.nextInt();
        
        // create for loop that initializes numLoops to zero,
        // has the same tru/false test as the while and ads 1 to our
        // numLoops variabe after each pass
        for (int numLoops = 0; numLoops <= loopControl; numLoops = numLoops + 1) {
            // print content
            System.out.println("The value of numLoops: " + numLoops);
        }
        
        scanner.close();
        
        
    }
            
}
