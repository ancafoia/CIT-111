package week9;

/**
 * @author Anca Foia
 * @CCAC CIT-111-Z03
 * 
 * Food land
 */

public class FoodLand {
  
  public static void main(String[] args) {
    int smallBite = 5;
    int normalBite = 15;
    int hugeBite = 50;

    // create a donut;
    Salad salad = new Salad();
    Donut donut = new Donut();
    Taco taco = new Taco();

    // access firstDonu's name and set a value
    salad.name = "First salad";
    donut.name = "First donut";
    taco.name = "First taco";

    // print a test member
    System.out.println("When first created, " + salad.name + "'s percent remaining is " + salad.getPercRemaining());
    System.out.println("When first created, " + donut.name + "'s percent remaining is " + donut.getPercRemaining());
    System.out.println("When first created, " + taco.name + "'s percent remaining is " + taco.getPercRemaining());

    printDivider();
    // eat taco
    System.out.println("Eat some taco...");
    taco.simulateEating(smallBite);
    taco.simulateEating(smallBite);
    taco.simulateEating(smallBite);
    System.out.println("After being eaten, " + taco.name + "'s percent remaining is " + taco.getPercRemaining());

    System.out.println("Eat some salad...");
    salad.simulateEating(smallBite);
    salad.simulateEating(hugeBite);
    salad.simulateEating(normalBite);
    System.out.println("After being eaten, " + salad.name + "'s percent remaining is " + salad.getPercRemaining());

    System.out.println("Eat some desert...");
    donut.simulateEating(smallBite);
    donut.simulateEating(hugeBite);
    donut.simulateEating(smallBite);
    System.out.println("After being eaten, " + donut.name + "'s percent remaining is " + donut.getPercRemaining());


  } // close main

  private static void printDivider() {
    System.out.println("..........................................");
  }
}// close class