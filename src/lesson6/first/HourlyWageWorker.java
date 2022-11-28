package lesson6.first;

import lesson6.first.Salary;

import java.time.LocalDate;

public class HourlyWageWorker implements Salary {
    @Override
    public void salary() {
        int dayOfTheMonth = LocalDate.now().getDayOfMonth();
        int price = 100;
        int salary = dayOfTheMonth * 100;
        System.out.println("Your hourly salary is " + salary + "$ in this month.");
    }
}
