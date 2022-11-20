import lesson4.first.CoffeRobot;
import lesson4.first.Robot;
import lesson4.first.RobotCoocker;
import lesson4.first.RobotDancer;
import lesson4.second.Animal;

public class Main {
    public static void main(String[] args) {

        /*        *//*1. Write one variable of each primitive data types*//*

        byte a;
        short b;
        int c;
        long d;
        char e;
        float f;
        double g;
        boolean j;

        *//*2. Print in Terminal min and max value of each primitive data types. Apply System.out.println() and
            JavaWrappers.*//*
        System.out.println("Max value of byte is - " + Byte.MAX_VALUE);
        System.out.println("Min value of byte is - " + Byte.MIN_VALUE);

        System.out.println("Max value of short is - " + Short.MAX_VALUE);
        System.out.println("Min value of short is - " + Short.MIN_VALUE);

        System.out.println("Max value of int is - " + Integer.MAX_VALUE);
        System.out.println("Min value of int is - " + Integer.MIN_VALUE);

        System.out.println("Max value of long is - " + Long.MAX_VALUE);
        System.out.println("Min value of long is - " + Long.MIN_VALUE);

        System.out.println("Max value of char is - " + Character.MAX_VALUE);
        System.out.println("Min value of char is - " + Character.MIN_VALUE);

        System.out.println("Max value of float is - " + Float.MAX_VALUE);
        System.out.println("Min value of float is - " + Float.MIN_VALUE);

        System.out.println("Max value of double is - " + Double.MAX_VALUE);
        System.out.println("Min value of double is - " + Double.MIN_VALUE);

        System.out.println("Max value of boolean is - " + "true");
        System.out.println("Min value of boolean is - " + "false");

        *//*3. Create an array with 10 values of int. Then find min and max value there and print it*//*
        int[] numbers = new int[] {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        int maxNumber = Integer.MIN_VALUE;
        int minNumber = Integer.MAX_VALUE;

        for (int num : numbers) {
            if (num > maxNumber) maxNumber = num;
            if (num < minNumber) minNumber = num;
        }
        System.out.println("Max value in numbers is - " + maxNumber);
        System.out.println("Min value in numbers is - " + minNumber);
    }*/
        //1.
        Robot first = new Robot();
        Robot second = new CoffeRobot();
        Robot third = new RobotDancer();
        Robot fourth = new RobotCoocker();

        first.work();
        second.work();
        third.work();
        fourth.work();

        Robot[] robots = new Robot[] {first, second, third, fourth};
        for(Robot r : robots) {
            r.work();
        }

        //2.
        Animal someAnimal = new Animal("Cat", 12, 3);
        printMethod(someAnimal);
        someAnimal.setName("Dog");
        someAnimal.setSpeed(15);
        someAnimal.setAge(8);
        printMethod(someAnimal);
    }

    public static void printMethod(Animal a) {
        System.out.println("Animal`s name is - " + a.getName() +
                ", his speed is - " + a.getSpeed() +
                ", he is - " + a.getAge() + " years old.");
    }
}