/**
 * @author Anca Foia
 * @CCAC CIT-111-Z03
 */
package week4;

import java.util.Scanner;

public class IfControl {
    public static void main(String[] args) {
        // create a purchase limit as a final variable since it wont' change
        final double PURCHASE_LIMIT = 200.00;
        // declare a double-type variable to store the purchase amount
        double purchaseAmount;
        // create a Scanner
        Scanner userInputScanner = new Scanner(System.in);
        
        // prompt the user for a purchase amount
        System.out.println("Enter the amount of the purcahse (no $) and press enter;");
        // read whatever the user typed into purchaseAmount
        purchaseAmount = userInputScanner.nextDouble();
        
        // compare the user-entered value againts purcahse limit
        if (purchaseAmount > PURCHASE_LIMIT) {
            // code to run if the comparison evaluates to true
            System.out.println("Ah ah ah -- That's too expensive! Buy something else");
        } else {
            // code to run if comparison evaluates to false
            System.out.println("Okay, you can purchase this item for: $" + purchaseAmount);
        }
    }
}
