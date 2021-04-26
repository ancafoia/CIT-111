package week9;

public class DonutLand {
  
  public static void main(String[] args) {
    int firstBiteSize = 12;

    // create a donut;
    Donut firstDonut = new Donut();

    // access firstDonu's name and set a value
    firstDonut.name = "Chloe";

    // print a test member
    System.out.println("When first created, " + firstDonut.name + "'s percent remaining is " + firstDonut.getPercRemaining());

    printDivider();

    System.out.println("Calling simulateEating and passing in a bite size of " + firstBiteSize);
    printDivider();
    firstDonut.simulateEating(firstBiteSize);

    // show how much is left of the donut
    System.out.println("After being eaten, " + firstDonut.name + "'s percent remaining is " + firstDonut.getPercRemaining());


  } // close main

  private static void printDivider() {
    System.out.println("..........................................");
  }
}// close class