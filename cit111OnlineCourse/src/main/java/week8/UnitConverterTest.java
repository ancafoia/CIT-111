/**
 * @author Anca Foia
 * @CCAC CIT-111-Z03
 * 
 * Unit converter mini project
 */
package week8;

import java.util.Scanner;

public class UnitConverterTest {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Welcome to the Temperature convertor.");
        System.out.println("Convert to and from Fahrenheit, Celsius and Kelvins");
        
        // Prompt the user to select the temperature to convert from
        System.out.println("\n Select the unit to convert from:");
        char convertFrom = UnitConverter.selectUnit(scanner);
        
        // Promt the user to insert the value to be converted
        System.out.println("\n Insert the value to be converted:");
        double value = scanner.nextDouble();
        
        // Prompt the user to select the unit to convert to
        char convertTo = UnitConverter.selectUnit(scanner);
        
        double result = 0;
        
        // Fahrenheit to X
        if (convertFrom == 'F') { 
            result = UnitConverter.convertFtoX(value, convertTo);
        }
        
        // Celsius to X
        if (convertFrom == 'C') { 
            result = UnitConverter.convertCtoX(value, convertTo);
        }
        
        // Kelvin to X
        if (convertFrom == 'K') { 
            result = UnitConverter.convertKtoX(value, convertTo);
        }
        
        System.out.println("\n Result: " + value + " " + convertFrom + " = " + result + " " + convertTo);
    }
            
}
