/**
 * @author Anca Foia
 * @CCAC CIT-111-Z03
 */
package week5;

import java.util.Scanner;

public class Authentication {

    public static void main(String[] args) {
        // predifined username and password
        final String CORRECT_PASSWORD = "ic0d3";
        final int MAX_ATTEMPTS = 3;
        final String SECRET = "The secret of life is PI";
        int attempts = 0;

        // variable for user data
        Scanner scanner = new Scanner(System.in);
        
        // First prompts
        System.out.println("Enter the system password to learn the secret of life:");

        while (attempts < MAX_ATTEMPTS) {
            // prompt user for password
            String password = scanner.next();
            
            attempts = attempts + 1;

            // check if username and password are correct
            if (password.equals(CORRECT_PASSWORD)) {
                System.out.println("****************************");
                System.out.println(SECRET);
                System.out.println("****************************");
                System.out.println("Thank you for participating");
                break;
            } else {
                System.out.println("Incorrect password, try again:");
                System.out.println("Number of attempts: " + attempts);
                System.out.println("Number of attempts allowed: " + MAX_ATTEMPTS);
                System.out.println("Password: ");
            }
        }
        
        // if number of attempts is exceeded
        System.out.println("System will auto-distruct in 1 second...");

    }

}
