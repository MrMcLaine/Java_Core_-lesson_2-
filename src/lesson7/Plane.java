package lesson7;

import java.sql.SQLOutput;

import static lesson7.Randomizer.getRandomBetween;

public abstract class Plane extends AircraftControl {
    int length;
    int width;
    int weight;

    public void startEngines() {
        System.out.println("All engines start in " + getRandomBetween(20, 88) + "seconds.");
    }

    public void takeOff() {
        System.out.println("Plane take off in " + getRandomBetween(0, 1000) + "seconds.");
    }

    public void landing() {
        System.out.println("The plane is going to land.");
    }
}
