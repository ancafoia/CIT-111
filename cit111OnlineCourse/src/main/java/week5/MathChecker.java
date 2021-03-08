/**
 * @author Anca Foia
 * @CCAC CIT-111-Z03
 */

//------------------------------------
// FLOWCHART LINK: https://github.com/ancafoia/CIT-111/blob/main/cit111OnlineCourse/src/main/java/week5/MathChecker_flowchart.PNG
// ------------------------------------------

package week5;

import java.util.Scanner;

public class MathChecker {
    public static void main(String[] args) {
        
        final int MAX_TRIES = 3;
        
        // initialize scanner
        Scanner scanner = new Scanner(System.in);   
        
        // Display the problem to the user
        System.out.println("** Match Checker **");
        
        final int RESULT = (10 % 3) * 2;
        
        // count the number of tries
        int tries = 0;
        
        while (tries < MAX_TRIES){ 
            System.out.println("Compute the value of (10 % 3) * 2:");
            int r = scanner.nextInt();
            
            if (r == RESULT) {
                System.out.println("Correct! Nice work!");
                System.out.println("solution: (10 % 3) * 2 = 1 * 2 = 2");
                break;
            } else {
                System.out.println("Sorry, Incorrect");
                if (r < RESULT) {
                    System.out.println("(Your answer is too low)");
                } else {
                    System.out.println("(Your answer is too high)");
                }
            }
            
            tries = tries + 1;
        }
        
        System.out.println("Too many tries!");
        
        
        scanner.close();
    }
}
