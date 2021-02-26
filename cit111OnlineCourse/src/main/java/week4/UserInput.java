package week4;

import java.util.Scanner;

/**
 * @author Anca Foia
 * @CCAC CIT-111-Z03
 */

 /*  
 * Demonstrates the functionality of a Scanner object and how to uesr it to
 * gather input form the user
 * @author Eric Darsow
 */
public class UserInput {
    public static void main(String[] args) {
        // this is a "final variable" to store the tax rate
        final double SALE_TAX = 0.07;
        
        
        // declare double-type variable
        double salePrice;
        double priceWithTax;
        
        // create a Scanner object using the iported Class library
        Scanner userInputScanner = new Scanner(System.in);
        
        // prompt the user
        System.out.println("Enter the sale price (no $) and press enter:");
        // use the Scanner to read a double value from the console
        salePrice = userInputScanner.nextDouble();
        // add the tax amount to original sale amount
        priceWithTax = salePrice * (1 + SALE_TAX);
        // print out the result of the calculation
        System.out.println("Your item price + 7% tax: $" + priceWithTax);
        
    }
}
