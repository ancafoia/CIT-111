package week9;

public class Salad {
  public String name = "A salad";
  public int percRemaining = 100;
  public boolean containsNuts;
  public String lettuceType;
  public boolean vegetarian = true;

  public void eatSalad(int percEaten) {
    if (percRemaining > percEaten) {
      percRemaining = percRemaining - percEaten;
    } else {
      System.out.println("Can't... not much salad left.");
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