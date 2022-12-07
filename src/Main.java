import lesson6.first.FixWageWorker;
import lesson6.first.HourlyWageWorker;
import lesson6.second.interface2.MyCalculator;
import lesson7.Plane;
import lesson7.SU27;
import lesson8.Months;
import lesson8.Seasons;
import lesson9.WrongInputConsoleParametersException;
import lesson9.second.Methods;
import lesson9.second.MyException;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws WrongInputConsoleParametersException, MyException, IllegalAccessException {
        System.out.println("Please, write your month.");
        Scanner console = new Scanner(System.in);
        String month = console.nextLine();
        Months[] months = Months.values();
        Seasons[] seasons = Seasons.values();
        Months tempMonth = null;

//— Перевірити чи є такий місяць (місяць вводимо з консолі, передбачити, щоб регістр букв був не важливим )

        boolean excellent = false;
        for (Months m : months) {
            if (month.equalsIgnoreCase(m.toString())) {
                System.out.println("It's true.");
                tempMonth = m;
                excellent = true;
            }
        }
        if (!excellent) {
            throw new WrongInputConsoleParametersException("Try again, please.");
        }
        System.out.println("**************************************");

//— Вивести всі місяці з такою ж порою року

        if (tempMonth != null) {
            Seasons tempSeason = tempMonth.getSeason();
            for (Months m : months) {
                if (m.getSeason().equals(tempSeason)) {
                    System.out.println(m);
                }
            }
        }
        System.out.println("**************************************");

//— Вивести всі місяці які мають таку саму кількість днів

        if (tempMonth != null) {
            int days = tempMonth.getDays();
            for (Months m : months) {
                if (m.getDays() == days) {
                    System.out.println(m);
                }
            }
        }
        System.out.println("**************************************");

//— Вивести на екран всі місяці які мають меншу кількість днів

        if (tempMonth != null) {
            int days = tempMonth.getDays();
            for (Months m : months) {
                if (m.getDays() < days) {
                    System.out.println(m);
                }
            }
        }
        System.out.println("**************************************");

//— Вивести на екран всі місяці які мають більшу кількість днів

        if (tempMonth != null) {
            int days = tempMonth.getDays();
            for (Months m : months) {
                if (m.getDays() > days) {
                    System.out.println(m);
                }
            }
        }
        System.out.println("**************************************");

//— Вивести на екран наступну пору року

        if (tempMonth != null) {
            Seasons tempSeason = tempMonth.getSeason();
            switch (tempSeason) {
                case AUTUMN -> System.out.println(Seasons.WINTER);
                case WINTER -> System.out.println(Seasons.SPRING);
                case SPRING -> System.out.println(Seasons.SUMMER);
                case SUMMER -> System.out.println(Seasons.AUTUMN);
            }
        }
        System.out.println("**************************************");

//— Вивести на екран попередню пору року

        if (tempMonth != null) {
            Seasons tempSeason = tempMonth.getSeason();
            switch (tempSeason) {
                case AUTUMN -> System.out.println(Seasons.SUMMER);
                case WINTER -> System.out.println(Seasons.AUTUMN);
                case SPRING -> System.out.println(Seasons.WINTER);
                case SUMMER -> System.out.println(Seasons.SPRING);
            }
        }
        System.out.println("**************************************");

//— Вивести на екран всі місяці які мають парну кількість днів

        for (Months m : months) {
            if (m.getDays() % 2 == 0) {
                System.out.println(m);
            }
        }
        System.out.println("**************************************");

//— Вивести на екран всі місяці які мають непарну кількість днів

        for (Months m : months) {
            if (m.getDays() % 2 != 0) {
                System.out.println(m);
            }
        }
        System.out.println("**************************************");

//— Вивести на екран чи введений з консолі місяць має парну кількість днів

        assert tempMonth != null;
        if (tempMonth.getDays() % 2 == 0) {
            System.out.println("true");
        } else {
            System.out.println(false);
        }


/* - Протестувати всі можливі варіанти, і вивести все на консоль.
 - Прошу використовувати коментуванняб так як не зміг швидко розібратися,
 як продовжити виконання програми після викидання Exception*/

        Methods met = new Methods();
        System.out.println(met.addition(15, 35));
        //     System.out.println(met.division(15, 35));
        System.out.println(met.multiplication(15, 35));
        System.out.println(met.subtraction(15, 35));

        try {
            System.out.println(met.addition(-1, -15));
            System.out.println(met.subtraction(0, 35));
            System.out.println(met.subtraction(15, 0));
            System.out.println(met.multiplication(0, 0));
            System.out.println(met.division(15, 35));
        } catch (IllegalArgumentException e) {
            System.out.println("You have one IllegalArgumentException, bro.");
        } catch (ArithmeticException e) {
            System.out.println("You have one ArithmeticException, bro.");
        } catch (IllegalAccessException e) {
            System.out.println("You have one IllegalAccessException, bro.");

        } catch (MyException e) {
            System.out.println("You have one MyException, bro.");
        }
    }
}