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
public class Variables {
    public static void main(String[] args) {
        int yearsEleSch;
        int yearsMS;
        int yearsHS;
        int yearsCollege;
        int totalYears;
        
        yearsEleSch = 5;
        yearsMS = 3;
        yearsHS = 4;
        yearsCollege = 2;
        totalYears = yearsEleSch + yearsMS + yearsHS + yearsCollege;

        System.out.println("Total years in school: " + totalYears);
    }
}
