package lesson6.first;

import lesson6.first.Salary;

public class FixWageWorker implements Salary {
    @Override
    public void salary() {
        int salary = 1000;
        System.out.println("Your fix salary is " + salary + "$ in this month.");
    }
}
