/**
 * @author Anca Foia
 * @CCAC CIT-111-Z03
 */
package week4;

import java.util.Scanner;

public class MiniiProject {
    public static void main(String[] args) {
        // Acceptable speed range
        final int MPG = 28;
           
        // the actual speed of the car
        int gallonsRemaining, distanceToGasStation;
        
        // create Scanner
        Scanner userInputScanner = new Scanner(System.in);
        
        // Read remaining gallons
        System.out.println("How many gallons of gas remain in your tank?");
        gallonsRemaining = userInputScanner.nextInt();
        
        // Read distance
        System.out.println("How many miles to the next service station?");
        distanceToGasStation = userInputScanner.nextInt();
        
        
        int autonomy = gallonsRemaining * MPG;
        
        // implement decision logic
        if (autonomy < distanceToGasStation) {
            System.out.println("RED ALERT! You will run out of gas!");
        } else {
            System.out.println("Whew! You will make it this time");
        }
    }
}
