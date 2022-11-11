package lesson3;

public class Rectangle {

    public static void main(String[] args) {
        Rectangle rectangleWithoutPar = new Rectangle();
        Rectangle rectangleWithPar = new Rectangle(150, 250);

        System.out.println("Rectangles (without parameters) area is - " + rectangleWithoutPar.getArea());
        System.out.println("Rectangles (without parameters) perimeter is - " + rectangleWithoutPar.getPerimeter());
        System.out.println("Rectangles (with parameters) area is - " + rectangleWithPar.getArea());
        System.out.println("Rectangles (with parameters) perimeter is - " + rectangleWithPar.getPerimeter());
    }
    private final int length;
    private final int width;

    public Rectangle() {
        this.length = 100;
        this.width = 200;
    }

    public Rectangle(int length, int width) {
        this.length = length;
        this.width = width;
    }

    public int getArea() {
        return this.length * this.width;
    }

    public int getPerimeter() {
        return (this.length* 2) + (this.width * 2);
    }
}
