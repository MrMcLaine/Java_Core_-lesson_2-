package lesson9.second;

public class MyException extends Exception{
    String message;

    public MyException(String message) {
        super(message);
        this.message = message;
    }
}
