/**
 * @author Anca Foia
 * @CCAC CIT-111-Z03
 * 
 * Simple method example
 */


package week8;

import java.util.Scanner;

public class GeometricShapes {
    public static void main(String[] args) {
        // create scanner object
        Scanner scanner = new Scanner(System.in);

        // Gather method parameters from the user
        System.out.println("Enter the side length of the cube to calculate volume");
        double userSideLength = scanner.nextDouble();

        // call calcVolumeOfCube to get the volume
        double returnedVolume = calcVolumeOfCube(userSideLength);

        // print the inputs
        System.out.println("The volume of a cube with side lenght " + userSideLength + " is " + returnedVolume);


        // Use input to call calcVolumeOfCylinder
        System.out.println("Enter the cylinder radius:");
        double userRadius = scanner.nextDouble();
        System.out.println("Enter the cylinder height:");
        double userHeight = scanner.nextDouble();

        // Calculate cylinder volume
        double returnedCylVolume = calcVolumeOfCylinder(userRadius, userHeight);
        // print the result
        System.out.println("The volume of a cylinder with radius " + userRadius + " and height " + userHeight + " is " + returnedCylVolume);


        scanner.close();
    }

    public static double calcVolumeOfCube(double sideLenght) {
        // calculate the volume
        double cubeVolume = Math.pow(sideLenght, 3);
        // return the result
        return cubeVolume;
    }// close method

    public static double calcVolumeOfCylinder(double radius, double height) {
        final double PI = 3.1416;
        //implements the cylinder formula
        double cylVol = PI * (radius * radius) * height;
        // return the value
        return cylVol;
    }// close 
    
    /**
     * Calculates the area of a trapezoid with given base lengths and height
     * @param b1 length of base 1
     * @param b2 length of base 2
     * @param height height of the trapezoid
     * @return the area of the trapezoid
     */
    public static double calcAreaOfTrapezoid(double b1, double b2, double height) {
        double trapArea = (0.5) * (b1 + b2) * height;
        return trapArea;
    }
}
