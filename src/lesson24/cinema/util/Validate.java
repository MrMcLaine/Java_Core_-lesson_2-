package lesson24.cinema.util;

public class Validate {
    public static boolean minIsValid(int min) {
        return min >= 0 && min <= 60;
    }

    public static boolean hourIsValid(int hour) {
        return hour >= 0 && hour <= 24;
    }
}
