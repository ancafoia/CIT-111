package week9;

/**
 * @author Anca Foia
 * @CCAC CIT-111-Z03
 * 
 * Food land
 */


public class Donut_Refactored {
  //member variables
  private int percRemaining = 100;
  public String name;

  public void simulateEating(int percentEaten) {
    System.out.println("Inside simulateEating method");
    percRemaining = percRemaining - percentEaten;
  }

  public int getPercRemaining() {
    System.out.println("Inside getPercRemaining method");
    return percRemaining;
  }
}