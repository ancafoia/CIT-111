/**
 * @author Anca Foia
 * @CCAC CIT-111-Z03
 */
package week5;

import java.util.Scanner;

public class RetirementAge {

    public static void main(String[] args) {
        int age;
        // make a scanner
        Scanner scanner = new Scanner(System.in);

        // the test condition for this while statement is always true
        // so the looping will occur until the user issues a command to the compiler
        // to stop the execution
        while (true) {
            // prompt the user
            System.out.println("Enter your age to see if you can retire: ");
            // read age from console
            age = scanner.nextInt();
            
            // implement basic if logic 
            if (age > 65.5) {
                System.out.println("Wahoo! Grab the news[paper and martini!");
            } else {
                System.out.println("Sorry, Keep working....");
            }// close if/else block
            
        }// close while loop
    } // close main method
}// close class
