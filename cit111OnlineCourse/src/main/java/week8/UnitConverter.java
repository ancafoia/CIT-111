/**
 * @author Anca Foia
 * @CCAC CIT-111-Z03
 * 
 * Unit converter mini project
 * 
    Conversion table
    
    Celsius (C) into Fahrenheit (F): F=9/5(C) +32
    Celsius (C) into Kelvin (k): K = C+273
    Fahrenheit (F) into Celsius (C): C= 5/9(F-32)
    Fahrenheit (F) into Kelvin (K): K= 5/9(F-32) +273
    Kelvin (K) into Celsius (C): C=K-273
    Kelvin (K) into Fahrenheit (F): F= 9/5(K-273) +32
 */

import java.io.IOException;
import java.util.Scanner;

package week8;

public class UnitConverter {
    
    static final int KelvinConstant = 273;
    
    public static char selectUnit(Scanner scanner) throws IOException {
        char c;
        
            // Initialize scanner
            // Scanner scanner = new Scanner(System.in)) {
            
            // Read until a correct option is selected
            do {
                System.out.println("\n F: Fahrenheit \n C: Celsius \n K: Kelvin");
                c = (char) scanner.next().charAt(0);
            } while (c != 'F' && c != 'C' && c != 'K');
         
        
        return c;
    }
    

    /**
     * convert Celsius to Fahrenheit, Celsius or Kelvin
     * @param value the value to be converted
     * @param toUnit the unit to convert to
     * @return the conversion result
     */
    public static double convertCtoX(double value, char toUnit) throws Exception {
        switch (toUnit) {
            case 'F':
                return 9/5 * value + 32;
            case 'C':
                return value;
            case 'K':
                return value + KelvinConstant;
            default:
                throw new Exception("Invalid unit. unit must be 1, 2 or 3");
        }
        
    }
    
    /**
     * Convert Fahrenheit to Fahrenheit, Celsius or Kelvin 
     * @param value the value to be converted
     * @param toUnit the unit to convert to
     * @return the conversion result
     */
    public static double convertFtoX(double value, char toUnit) throws Exception {
        switch (toUnit) {
            case 'F':
                return value;
            case 'C':
                return 5 / 9 * (value - 32);
            case 'K':
                return 5 / 9 * (value - 32) + KelvinConstant;
        
            default:
                throw new Exception("Invalid unit. unit must be 1, 2 or 3");
        }
        
    }
   
    /**
     * Convert Kelvin to Fahrenheit, Celsius or Kelvin 
     * @param value the value to be converted
     * @param toUnit the unit to convert to
     * @return the conversion result
     */    public static double convertKtoX(double value, int toUnit) throws Exception {
        switch (toUnit) {
            case 'F':
                return 9 / 5 * (value - KelvinConstant) + 32;
            case 'C':
                return value - KelvinConstant;
            case 'K':
                return value;
            default:
                throw new Exception("Invalid unit. unit must be 1, 2 or 3");
        }
        
    }
    
        
}
