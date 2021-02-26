/**
 * @author Anca Foia / Eric Darsow
 * @CCAC CIT-111-Z03
 */
package week4;

import java.util.Scanner;

/**
 * Implements speed testing logic agains defined min and max speers
 * 
 */
public class SpeedEnforcement {
    public static void main(String[] args) {
        // Acceptable speed range
        final int MIN_SPEED = 40;
        final int MAX_SPEED = 55;
           
        // the actual speed of the car
        int carSpeed;
        
        // create Scanner
        Scanner userInputScanner = new Scanner(System.in);
        // prompt the user
        System.out.println("Enter the speed of your vehicle in mph:");
        // read speed
        carSpeed = userInputScanner.nextInt();
        
        // implement decision logic
        if (carSpeed < MIN_SPEED) {
            System.out.println("Car is moving too slow.");
        } else if (carSpeed > MAX_SPEED) {
            System.out.println("Car's speed is over the limit!");
        } else {
            System.out.println("Car is within appropriate speed");
        }
    }
}
