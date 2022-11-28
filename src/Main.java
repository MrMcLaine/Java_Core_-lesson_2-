import lesson6.first.FixWageWorker;
import lesson6.first.HourlyWageWorker;
import lesson6.second.interface2.MyCalculator;

public class Main {
    public static void main(String[] args) {
        HourlyWageWorker hourlyWorker = new HourlyWageWorker();
        FixWageWorker fixWorker = new FixWageWorker();
        hourlyWorker.salary();
        fixWorker.salary();

        MyCalculator calculator = new MyCalculator();
        System.out.println(calculator.add(50));
        System.out.println(calculator.subtract(21));
        System.out.println(calculator.divide(10));
        System.out.println(calculator.multiply(4));
    }
}