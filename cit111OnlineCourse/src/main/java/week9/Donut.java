package week9;

/**
 * @author Anca Foia
 * @CCAC CIT-111-Z03
 * 
 * Food land
 */

public class Donut {

  // member variables
  private int percRemaining = 100;
  public String name;

  public void simulateEating(int percentEaten) {
    // substract the bite size from existing donunt
    percentEaten = percRemaining - percentEaten;
  }

  // return remaining percent of donut
  public int getPercRemaining() {
    return percRemaining;
  }

} // close class