/**
 * @author Anca Foia
 * @CCAC CIT-111-Z03
 * 05/10/2021
 * 
 * Array of objects
 * Use an array to store a phone contact list
 */

package objectifiedarrays;

import java.util.Scanner;

class ArrayOfObjects {

  private static Person[] agenda = new Person[100];
  private static int ind = 0;
  static Scanner scanner;

  // Show main menu
  private static void showMenu() {
    System.out.println("\nMain menu");
    System.out.println("--------------------------");
    System.out.println("1. Add new contact");
    System.out.println("2. Delete contact");
    System.out.println("3. List contacts");

    System.out.println("0. Exit");
  }

  // Read command from the user
  private static int readCommand() {
    System.out.print("\nEnter command: ");
    int c = scanner.nextInt();
    return c;
  }

  public static void facilitateUserInteraction(String[] contacts) {

  }

  public static void display() {
    System.out.println("Found " + ind + " contact(s) in your list:");
    for (int i = 0; i < ind; i++) {
      Person p = agenda[i];
      System.out.println((i + 1) + ": " + p.getName() + " - " + p.getPhoneNumber());
    }
  }

  public static void addContact() {
    // Create a new person
    Person p = new Person();
    String fn = scanner.nextLine();
    System.out.println("Enter first name:");
    fn = scanner.nextLine();
    p.setFirstName(fn);

    System.out.println("Enter last name:");
    String ln = scanner.nextLine();
    p.setLastName(ln);

    System.out.println("Enter phone number:");
    String phone = scanner.nextLine();
    p.setPhoneNumber(phone);

    // Store the person at the current index
    agenda[ind] = p;

    // Increment the index so it uses the next position in the array next time
    ind++;
  }

  public static void deleteContact() {
    String fn = scanner.nextLine();
    System.out.println("Enter the ID of the contact you want to delete:");
    int id = scanner.nextInt();

    if (id > ind || id < 1) {
      System.out.println("Invalid ID");
    } else {
      // Move each item one position to the left starting with the id given by the user
      for (int i = id - 1; i < ind; i++) {
        agenda[i] = agenda[i + 1];
      }

      // Decrement the current index
      ind--;

      System.out.println("Contact deleted");
    }

  }

  public static void main(String[] args) {
    scanner = new Scanner(System.in);

    // Show menu while exit command is different than 0
    showMenu();
    int c = readCommand();

    while (c != 0) {
      switch (c) {
        case 1:
          addContact();
          break;

        case 2:
          deleteContact();
          break;

        case 3:
          display();
          break;

        default:
          break;
      }

      showMenu();
      c = readCommand();
    }

    System.out.println("\nSystem is shuting down. Good bye!\n");
  }
}