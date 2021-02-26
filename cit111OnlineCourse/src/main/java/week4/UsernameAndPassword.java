/**
 * @author Anca Foia
 * @author Eric Darsow
 * @CCAC CIT-111-Z03
 */
package week4;

// Simulates authentication of a single user system using String comparison

import java.util.Scanner;

public class UsernameAndPassword {
    public static void main(String[] args) {
        // predifined username and password
        final String CORRECT_USERNAME = "javaghost";
        final String CORRECT_PASSWORD = "ic0d3";
        
        // variables for user data
        String username, password;
        
        // Scanner instance
        Scanner userInputScanner = new Scanner(System.in);
        
        // prompt user for username and password
        System.out.println("Enter your username");
        username = userInputScanner.next();
        System.out.println("Enter your password");
        password = userInputScanner.next();
        
        // check if username and password are correct
        if (username.equals(CORRECT_USERNAME) && password.equals(CORRECT_PASSWORD)) {
            System.out.println("Authentication successful!");
        } else {
            System.out.println("Failure to authenticate!");
        }
    }
}
