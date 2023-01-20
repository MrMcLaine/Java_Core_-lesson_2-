package lesson3;

import static java.lang.Math.PI;

public class Circle {
    public static void main(String[] args) {
        Circle circle = new Circle(10.3);
        System.out.println(circle.getArea());
        System.out.println(circle.getCircuit());
    }
    private final double radius;
    private final double diameter;

    public Circle(double diameter) {
        this.diameter = diameter;
        this.radius = diameter / 2;
    }

    public double getArea() {
        return PI * (this.diameter / 2);
    }

    public double getCircuit() {
        return PI * this.radius * this.radius;
    }

}
