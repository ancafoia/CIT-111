/**
 * @author Anca Foia
 * @CCAC CIT-111-Z03
 * 
 * Track riders at Kenywood park
 * This is a modified version of https://raw.githubusercontent.com/edarsow/javaCIT111/master/cit111NetBeans/src/weekB1_scope/KennywoodRideTracker.java
 */

package week8;

import java.util.Random;

public class KennywoodRideTracker {
    
    private static int totalRiders = 0;
    private static int totalFailedRideAttempts = 0;
    private static int totalSickRiders = 0;

    private static int totalRidersBlackWidow = 0;
    private static int totalRidersMerryGoRound = 0;
    
    final static int MIN_HEIGHT_THRILL_RIDES = 50;
    final static int MIN_HEIGHT_THEME_RIDES = 35;
    
    public static void main(String[] args){
        System.out.println("Begin ride simulation");
        printRiderStats();
        
        // ride the ride by calling its ride method, then print stats
        rideBlackWidow(12, 55);
        printRiderStats();
        
        rideMerryGoRound(7, 34);
        printRiderStats();
        
        rideMerryGoRound(2, 44);
        printRiderStats();
        
        rideBlackWidow(12, 55);
        printRiderStats();
        
        rideBlackWidow(12, 20); // very short folks
        printRiderStats();
        
    } // close main()
    
    public static void rideBlackWidow(int riders, int avgHeight){
        if(avgHeight >= MIN_HEIGHT_THRILL_RIDES){

            // Count riders in the total per ride type
            totalRidersBlackWidow = totalRidersBlackWidow + riders;
            // Count riders in total
            totalRiders = totalRiders + riders;
            
            System.out.println("Riding Black Widow...");
            System.out.println("I HAAAATE SPIIIIIDEEEERS!\n");
            Random rand = new Random();
            int numSickRiders = rand.nextInt(riders);
            totalSickRiders = totalSickRiders + numSickRiders;
            
        } else {
            System.out.println(riders + " riders turned away sad: too short!\n");
            totalFailedRideAttempts = totalFailedRideAttempts + riders;
        } // end if/else
        
    } // close method
    
    
    public static void rideMerryGoRound(int riders, int avgHeight){
        if(avgHeight >= MIN_HEIGHT_THEME_RIDES)
        {

            // Count riders in the total per ride type
            totalRidersMerryGoRound = totalRidersMerryGoRound + riders;
            // Count total riders
            totalRiders = totalRiders + riders;
            
            System.out.println("Riding Merry-Go-Round");
            System.out.println("Round...and round...and round\n");
            Random rand = new Random();
            int numSickRiders = rand.nextInt(riders);
            totalSickRiders = totalSickRiders + numSickRiders;
            
        } else {
            System.out.println(riders + " riders turned away crying: too short!\n");
            totalFailedRideAttempts = totalFailedRideAttempts + riders;
        } // end if/else
        
    } // close method
    
    public static void printRiderStats(){
        
        System.out.println("*******RIDER STATS*********");
        System.out.println("Total Riders Black Widow: " + totalRidersBlackWidow);
        System.out.println("Total Riders Merry-Go-Round: " + totalRidersMerryGoRound);

        if (totalRiders > 0) {
            System.out.println("Percentage in Black Widow: " + (1.0 * totalRidersBlackWidow * 100 / totalRiders));
            System.out.println("Percentage in Merry-Go-Round: " + (1.0 * totalRidersMerryGoRound * 100 / totalRiders));
        }
        
        System.out.println("Total Riders: " + totalRiders);
        System.out.println("Total Failed Ride Attempts: " + totalFailedRideAttempts);
        System.out.println("Total sick riders: " + totalSickRiders);
        System.out.println("***************************\n");
        
    } // close method
    
} // close class