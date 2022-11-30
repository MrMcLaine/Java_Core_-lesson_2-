package lesson7;

import static lesson7.Randomizer.getRandom;

public class AircraftControl {

    public void up(){
        System.out.println("Let`s move up to " + getRandom()*100 + "m.");
    }

    public void down(){
        System.out.println("Let`s move down to " + getRandom()*100 + "m.");
    }

    public void left() {
        System.out.println("Let`s move left to " + getRandom()*100 + "m.");
    }

    public void right() {
        System.out.println("Let`s move right to " + getRandom()*100 + "m.");
    }
}
