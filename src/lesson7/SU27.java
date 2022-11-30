package lesson7;

import java.sql.SQLOutput;

import static lesson7.Randomizer.getRandom;
import static lesson7.Randomizer.getRandomBetween;

public class SU27 extends Plane implements SpecialOpportunities{
    private final int maxSpeed;
    private final String color;

    public SU27(int maxSpeed, String color) {
        this.maxSpeed = maxSpeed;
        this.color = color;
    }

    @Override
    public void turboAcceleration() {
        System.out.println("Plane's speed is " + getRandomBetween(maxSpeed, maxSpeed * 2) + " km/h.");
    }

    @Override
    public void stealthTechnology() {
        System.out.println("The plane is not visible during " + getRandom() + " seconds.");
    }

    @Override
    public void nuclearStrike() {
        System.out.println("The number of nuclear warheads that will be dropped is " + getRandomBetween(0,10));
    }
}
