/**
 * @author Anca Foia
 * @CCAC CIT-111-Z03
 */
package week4;

import java.util.Scanner;

/**
 * Class to demonstrate implementation of if/else logic in context of an
 * activity that creates a chain of logic to assess friend compatibility
 */
public class AreWeFriends {
    public static void main(String[] args) {
        // Initial score is zero
        int score = 0;
        int ans = 0;
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Do you like board games? (0 = no, 1 = yes)");
        ans = scan.nextInt();
        if (ans > 0) {
            score += 50;
        }
        
        System.out.println("Are you a traveler? (0 = no, 1 = yes)");
        ans = scan.nextInt();
        if (ans > 0) {
            score += 50;
        }
        
        System.out.println("Are you a vegetarian? (0 = no, 1 = yes)");
        ans = scan.nextInt();
        if (ans > 0) {
            score += 50;
        } else {
            System.out.println("Do you like hunting? (0 = no, 1 = yes)");
            ans = scan.nextInt();
            if (ans > 0) {
                score = -1000;
            }
        }
        
        if (score > 0) {
            System.out.println("Do you play any sports? (0 = no, 1 = yes)");
            ans = scan.nextInt();
            if (ans > 0) {
                score += 50;
            }
        }
        
        
        if (score > 99) {
            System.out.println("We can be friends.");    
        } else {
            System.out.println("Maybe some other time. See ya!");    
        }
        
    }
 
}
