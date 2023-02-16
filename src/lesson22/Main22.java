package lesson22;

import lesson22.first.Cat;
import lesson22.first.Cow;
import lesson22.first.Dog;
import lesson22.first.Pet;
import lesson22.third.Amphibia;
import lesson22.third.Frog;

public class Main22 {
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
