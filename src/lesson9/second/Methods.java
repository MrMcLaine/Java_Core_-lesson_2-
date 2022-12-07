package lesson9.second;

public class Methods {
    public Integer addition(int a, int b){
        if(a < 0 && b < 0) {
            throw new IllegalArgumentException();
        } else {
            return a + b;
        }
    }

    public Integer subtraction(int a, int b){
        if((a == 0 && b != 0)
                || (a != 0 && b == 0)) {
            throw new ArithmeticException();
        } else {
            return a - b;
        }
    }

    public Integer multiplication(int a, int b) throws IllegalAccessException {
        if(a == 0 && b == 0) {
            throw new IllegalAccessException();
        } else {
            return a * b;
        }
    }

    public Integer division(int a, int b) throws MyException {
        if(a > 0 && b > 0) {
            throw new MyException("Your`s numbers are more than zero.");
        } else {
            return a / b;
        }
    }
}
