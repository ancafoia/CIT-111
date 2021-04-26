package week9;

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