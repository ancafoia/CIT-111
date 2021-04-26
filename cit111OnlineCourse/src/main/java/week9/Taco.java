package week9;

public class Taco {
  public String name = "Best taco";
  public int percRemaining = 100;
  public boolean containsBeans;
  public boolean vegetarian = true;

  public void simulateEating(int percEaten) {
    if (percRemaining > percEaten) {
      percRemaining = percRemaining - percEaten;
    } else {
      System.out.println("Can't... not much taco left.");
    }
  }

  public void addMeat() {
    this.vegetarian = false;
  }

  // return remaining percent of donut
  public int getPercRemaining() {
    return percRemaining;
  }
}