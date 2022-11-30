package lesson7;

public class Randomizer {
    public static Integer getRandom() {
        return (int)(Math.random()*100);
    }

    public static Integer getRandomBetween(int start, int end) {
        return (int)(start + Math.random()*end);
    }
}
