/*
 * Copyright (C) 2018 delores
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package components.comp3_objects.oop4_btfcars;

/**
 * Client class of our practice Car class
 * @author delores
 */
public class CarLandTransFakery {
    public static void main(String[] args) {
        // create a new instance of a Car object with the keyword: new
        Car deLorean = new Car();
        // set member variables on the instance of Car stored in deLorean
        deLorean.year = 1983;
        deLorean.makeModel = "DeLorean DMC-12";
        
        // send our Car instance to a helper method to print its member variables
        deLorean.startEngine();
        System.out.println("Shifting up to 2 at 15 mph");
        System.out.println("Shifting up to 3 at 35 mph");
        deLorean.accelerate(50);
        displayCarStats(deLorean);
        deLorean.decelerate(40);
        System.out.println("Downshifting to 2 at 15 mph");
        System.out.println("Downshifting to 1 at 10 mph");
        displayCarStats(deLorean);
        
    } // close main
    
    public static void displayCarStats(Car anyCarObject){
        System.out.println("***** STATS *****");
        System.out.println(anyCarObject.year + " " + anyCarObject.makeModel);
        System.out.println("Engine running? " + anyCarObject.checkEngineStatus());
        System.out.println("CurrentSpeed " + anyCarObject.getCurrentSpeed());
        if(anyCarObject.getCurrentSpeed()>45){
            System.out.println("Gear: 3");
        } else if (anyCarObject.getCurrentSpeed() < 20){
            System.out.println("Gear: 1");
        }
        System.out.println("*****************");
    } // close displayCarStats
    
    
} // close class