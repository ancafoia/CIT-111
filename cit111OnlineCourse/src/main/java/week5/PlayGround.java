/**
 * @author Anca Foia
 * @CCAC CIT-111-Z03
 */
package week5;

import java.util.Random;

public class PlayGround {
    public static void main(String[] args) {
        final int UPPER_END_OF_RANGE = 100;
        
        Random randGenerator = new Random();
        
        // generat ethe random number with a call to nextInt()
        // store the value in randNum
        int randNum = randGenerator.nextInt(UPPER_END_OF_RANGE);
        
        System.out.println("Random number: " + randNum);
    }
}
