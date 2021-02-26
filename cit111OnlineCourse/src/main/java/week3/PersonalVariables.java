/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week3;

/**
 *
 * @author Sergiu
 */
class PersonalVariables {
  public static void main(String[] args) {
    String favoriteSong = "Imagine";
    String artistName = "John Lenon";
    int songYear = 1971;
    double songLength = 3.0 + 23.0 / 60.0;
    boolean hasLyrics = true;

    System.out.println("Anca Foia");
    System.out.println("CIT-111-Z03\n");

    System.out.println(favoriteSong + " by " + artistName + " was released in " + songYear + " and it has " + songLength + " minutes.");

    if (hasLyrics) {
      System.out.println("This song has lyrics\n\n"); 
    }

     // Second part
     places();
  }

  public static void places() {
    String location1 = "Niagara Falls";
    int distanceFromHomeMiles = 238;
    boolean canDrive = true;
    String description = "Most powerful waterfall in North America";

    String location2 = "Chicago";
    int distanceBetweenLocationsMiles = 555;
    int totalDistance = distanceFromHomeMiles + distanceBetweenLocationsMiles;

    System.out.println("My first favorite location is " + location1 + " which is " + distanceFromHomeMiles + " miles from Pittsburgh." + description);
    if (canDrive) {
      System.out.println("You can drive from Pittsburgh to " + location1);
    }
    System.out.println("\n My second favorite location is " + location2);
    System.out.println("\nThe total distance is " + totalDistance + "Miles"); 

  }
}
