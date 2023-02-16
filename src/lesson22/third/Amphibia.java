package lesson22.third;

public class Amphibia {

    Message printMessage = System.out::println;

    public void eat() {
        printMessage.setMessage("i'm eat");
    }

    public void sleep() {
        printMessage.setMessage("i'm sleep");
    }

    public void swim() {
        printMessage.setMessage("i'm swim");
    }

    public void walk() {
        printMessage.setMessage("i'm walk");
    }
}

interface Message {
    void setMessage(String message);

}
