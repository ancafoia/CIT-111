/**
 * @author Anca Foia
 * @CCAC CIT-111-Z03
 */
package week4;

import java.util.Scanner;

public class RideHeight {
    public static void main(String[] args) {
        // this is a "final variable" to store the tax rate
        final int MIN_HEIGHT_CM = 80;
        int riderHeight = 0;
        
        // create a Scanner object using the iported Class library
        Scanner userInputScanner = new Scanner(System.in);
        
        // prompt the user
        System.out.println("What is your height in centimeters?");
        // use the Scanner to read a int value from the console
        riderHeight = userInputScanner.nextInt();
        
        if (riderHeight < MIN_HEIGHT_CM) {
            System.out.println("Sorry, too short to ride.");
        } else {
            System.out.println("Your height of " + riderHeight + " cm menas you can ride");
        }
        
    }
}
