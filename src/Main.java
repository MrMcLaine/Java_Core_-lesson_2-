import lesson4.first.CoffeRobot;
import lesson4.first.Robot;
import lesson4.first.RobotCoocker;
import lesson4.first.RobotDancer;
import lesson4.second.Animal;
import lesson5.first.Cat;
import lesson5.first.Cow;
import lesson5.first.Dog;
import lesson5.first.Pet;
import lesson5.third.Amphibia;
import lesson5.third.Frog;

public class Main {
    public static void main(String[] args) {
        Pet testCow = new Cow();
        Pet testCat = new Cat();
        Pet testDog = new Dog();

        testCow.voice();
        testCat.voice();
        testDog.voice();

        Frog frog = new Frog();
        Amphibia amphibia = frog;

        frog.eat();
        frog.sleep();
        frog.swim();
        frog.walk();

        amphibia.eat();
        amphibia.sleep();
        amphibia.swim();
        amphibia.walk();
    }
}