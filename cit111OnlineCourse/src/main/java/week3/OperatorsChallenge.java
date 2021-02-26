/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week3;

/**
 *
 * @author Sergiu
 */
public class OperatorsChallenge {
    public static void main(String[] args) {
        int a = 100;
        int b = 2000;
        double d = 10.5;
        String line1 = "Go Ask Alice";
        String line2 = "I think she'll know";
        int r = b / a;
        System.out.println("Value of r is " + r);
        int mod = b % a;
        System.out.println("b % a is " + mod);
        double rd = mod * d;
        System.out.println("Value of rd is " + rd);
        a = a + 5;
        System.out.println("Computing b mod a");
        rd = b % a;
        System.out.println("b mod a is " + rd);
        String c1 = line2 + " " + line1;
        String c2 = line1 + " " + line2;
        
        
        
    }
}
