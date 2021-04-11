/**
 * @author Anca Foia
 * @CCAC CIT-111-Z03
 * 
 * Simple method example
 */

 package week6;

public class SimpleMethod {
    public static void main(String[] args) {
        System.out.println("This code is inside method: main");
        // call the method printStatement, transferring execution to that block
        printStatement();

        System.out.println("...back in main");

        // call the same method again
        printStatement();
    }

    public static void printStatement() {
        System.out.println("************** INSIDE printStatement *************");
        System.out.println("Statement: Where There's a Will, There's a Way");  
        System.out.println("**************************************************");
    }
}