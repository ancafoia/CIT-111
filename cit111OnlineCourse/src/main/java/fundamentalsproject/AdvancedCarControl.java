/**
 * @author Anca Foia
 * @CCAC CIT-111-Z03
 * 04/19/2021
 * 
 * Fundamentals project
 * Simulate a car infotainment system
 */


package fundamentalsproject;

import java.util.Scanner;

public class AdvancedCarControl {

    static String headlightsState;
    static int temperature;
    static Scanner scanner;
    static String drivingMode;

    public static void main(String[] args) {
        // Initialize the system
        init();

        System.out.println("Welcome to the Advanced Car Control (ACC)");
        
        // Show menu while exit command is different than 0
        showMenu();
        int c = readCommand();

        while (c != 0) {
            switch (c) {
                case 1:
                    printState();
                    break;

                case 2:
                    toggleHeadlights();
                    break;
                
                case 3:
                    setTemperature();
                    break;
                case 4:
                    setDrivingMode();
                    break;
            
                default:
                    break;
            }

            showMenu();
            c = readCommand();
        }

        System.out.println("\nSystem is shuting down. Good bye!\n");  
    }

    // Initialize class level variables
    private static void init() {
        scanner = new Scanner(System.in);
        headlightsState = "OFF";
        temperature = 70;
        drivingMode = "City";
    }

    // Read command from the user
    private static int readCommand() {
        System.out.print("\nEnter command: ");  
        int c = scanner.nextInt();
        return c;
    }
    
    // Show main menu
    private static void showMenu() {
        System.out.println("\nMain menu");
        System.out.println("--------------------------");
        System.out.println("1. Show report");
        System.out.println("2. Toggle headlights");
        System.out.println("3. Set climate temperature");
        System.out.println("4. Set driving mode");
        
        System.out.println("0. Exit");
    }

    // Print current state of the system
    private static void printState() {
        System.out.println("\nSystem status:");
        System.out.println("--------------------------");
        System.out.println("Headlights: " + headlightsState);
        System.out.println("Climate temperature: " + temperature + " F");
        System.out.println("Driving mode: " + drivingMode);
    }

    // Toggle headlights ON or OFF
    private static void toggleHeadlights() {
        if (headlightsState == "OFF") {
            headlightsState = "ON";
        } else {
            headlightsState = "OFF";
        }
        System.out.println("[UPDATE]: Headlights are now " + headlightsState);
    }

    // Set temperature to any value above 50
    private static void setTemperature() {
        System.out.println("Climate currently set to " + temperature + " F");
        System.out.print("Insert new temperature (F): ");
        int t = scanner.nextInt();
        
        if (t < 50) {
            System.out.println("Wow!! That's freezing cold. I'm not going to do that");
        } else {
            temperature = t;
            System.out.println("[UPDATE] Temperature is now set to " + t  + " F");
        }
    }

    // Set driving mode to E - Ecological, C - City, S - Sport
    private static void setDrivingMode() {
        System.out.println("Current driving mode is " + drivingMode);
        System.out.println("Select driving mode: ");
        System.out.println("E - Ecological");
        System.out.println("C - City");
        System.out.println("S - Sport");
        char c = scanner.next().charAt(0);
        String newMode = "None";

        if (c == 'e' || c == 'E') {
            newMode = "Ecological";
        }
        if (c == 'c' || c == 'C') {
            newMode = "City";
        }
        if (c == 's' || c == 'S') {
            newMode = "Sport";
        }

        if (newMode == drivingMode) {
            System.out.println("Nothing changed. Keep driving.");
        } else {
            drivingMode = newMode;
            System.out.println("[UPDATE] Driving mode is now set to " + drivingMode);
        }
    }
}
