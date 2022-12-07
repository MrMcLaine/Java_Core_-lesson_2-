package lesson9;

public class WrongInputConsoleParametersException extends Exception{
    String message;

    public WrongInputConsoleParametersException(String message) {
        super(message);
        this.message = message;
    }

    @Override
    public String getMessage() {
        return message;
    }
}
