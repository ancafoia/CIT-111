/**
 * @author Anca Foia
 * @CCAC CIT-111-Z03
 */
package week3;

public class Comparisons {
    public static void main(String[] args) {
        int age = 51;
        int retirementAge = 55;
        System.out.println(age >= retirementAge);
        
        if (age > retirementAge) {
            System.out.println("You're old! And can retire!");
        } else {
            System.out.println("Sorry, keep going!");
        }
    }
    
    public static void passcode() {
        int correctPasscode = 5934;
        int attemptedPasscode = 1234;
        if (correctPasscode == attemptedPasscode) {
            System.out.println("Codes Match! You're in,");
        } else {
            System.out.println("Codes don't match--No soup for you!");
        }
    }
}
