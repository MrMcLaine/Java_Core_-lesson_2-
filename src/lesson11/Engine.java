package lesson11;
import static lesson11.lesson11.getRandom;


public class Engine extends AutoObject{
    private final int numberOfCylinders;

    public Engine() {
        this.numberOfCylinders = getRandom(3,8);
    }

    @Override
    public String toString() {
        return "Engine{" +
                "numberOfCylinders=" + numberOfCylinders +
                '}';
    }
}
