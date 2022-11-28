package lesson6.second.interface2;

import lesson6.second.interface1.Numerable;

public class MyCalculator implements Numerable {
    private final int startNumber = 1;


    @Override
    public int divide(int number) {
        return startNumber / number;
    }

    @Override
    public int subtract(int number) {
        return startNumber - number;
    }

    @Override
    public int multiply(int number) {
        return startNumber * number;
    }

    @Override
    public int add(int number) {
        return startNumber + number;
    }
}
