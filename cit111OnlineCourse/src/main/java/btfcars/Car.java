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

/**
 * Model of a car inspired by Back To The Future 1's 8 car types!
 * @author delores
 */
public class Car {
    // public member variables: we don't need to implement logic 
    // to change these values
    public int year;
    public String makeModel;

    // private member variables because we want to control 
    // their values: outside classes access these through methods
    private boolean isEngineRunning;
    private double speed;
    private int gear = 0; //-1 = reverse, 0 = neutral

    /**
     * simulates starting this car instance's engine
     */
    public void startEngine() {
        isEngineRunning = true;
        System.out.println("...crank...crank...vroom!");
    }

    /**
     * Simulates stopping this car instance's engine
     */
    public void stopEngine() {
        isEngineRunning = false;
        System.out.println("...grblllll....shldunk");
    }

    /**
     * Allows access to our private engine status boolean member 
     * variable called isEngineRunning
     * @return the status of the engine: true means on, false means off
     */
    public boolean checkEngineStatus() {
        return isEngineRunning;
    }

    /**
     * Allows access to our private speed variable
     * @return this car object's current speed
     */
    public double getCurrentSpeed() {
        return speed;
    }

    /**
     * Allows access to our private gear variable
     * @return this car object's current gear
     */
    public int getCurrentGear() {
        return gear;
    }

    /**
     * Controls the car's increases in speed
     * @param mphIncrease 
     * @return the current speed of the car after the acceleration
     * has been taken into account
     */
    public double accelerate(int mphIncrease) {
        speed = speed + mphIncrease;
        return speed;
    }

    /**
     * Controls the car's decreases in speed
     * @param mphDecrease
     * @return the current speed of the car after the deceleration
     */
    public double decelerate(int mphDecrease) {
        speed = speed - mphDecrease;
        if (speed < 0) {
            System.out.println("Warning: decelerate speed value is bigger than current speed.");
            System.out.println("Setting speed to 0.");
            speed = 0;
        }
        return speed;
    }

    private void changeGear() {
        int tempGear = 0;

        if (speed == 0) {
            tempGear = 0;
        }
        if (speed > 0) {
            tempGear = 1;
        }
        if (speed > 10) {
            tempGear = 2;
        }
        if (speed > 30) {
            tempGear = 3;
        }
        if (speed > 50) {
            tempGear = 4;
        }
        if (speed > 70) {
            tempGear = 5;
        }
        if (tempGear > gear) {
            System.out.println("...crank...crank...vroom");
            System.out.println("Shifting up to " + tempGear + " at " + speed + " mph");
        }
        if (tempGear < gear) {
            System.out.println("...vroom...crank...crank");
            System.out.println("Shifting down to " + tempGear + " at " + speed + " mph");
        }
        gear = tempGear;

    }

}