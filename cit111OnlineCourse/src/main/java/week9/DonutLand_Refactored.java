package week9;

/**
 * @author Anca Foia
 * @CCAC CIT-111-Z03
 * 
 * Food land
 */

public class DonutLand_Refactored {
  final static int nibble = 5;
  final static int megaBite = 45;

  public static void main(String[] args) {
    Donut firstDonut = new Donut();

    firstDonut.name = "Chloe";
    printObjectData(firstDonut);

    Donut secondDonut = new Donut();
    secondDonut.name = "Crusoe";
    printObjectData(secondDonut);

    // eating first donut
    System.out.println("Eating " + firstDonut.name);
    System.out.println("Nibble...");
    firstDonut.simulateEating(nibble);
    System.out.println("Nibble...");
    firstDonut.simulateEating(nibble);
    System.out.println("Taking megaBite...");
    firstDonut.simulateEating(megaBite);
    printObjectData(firstDonut);

    // same pattern for second donut
    System.out.println("Eating " + secondDonut.name);
    System.out.println("Taking lots of megaBites");
    int numCalls = 10;
    for (int i = 0; i < numCalls; i++) {
      System.out.println("gnam gnam");
      secondDonut.simulateEating(megaBite);
    }

    printObjectData(secondDonut);
  }// close main

  private static void printObjectData(Donut inputDonut) {
    System.out.println("|-------STATS--------|");
    System.out.println("| Name: " + inputDonut.name);
    System.out.println("| Percent remaining: " + inputDonut.getPercRemaining());
    System.out.println("|--------------------|");
  }// close printObjectData
  
}// close class