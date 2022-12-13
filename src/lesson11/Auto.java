package lesson11;


import java.time.LocalDate;
import java.time.chrono.ChronoLocalDate;

import static lesson11.lesson11.getRandom;

public class Auto extends AutoObject {
    private final int horsepower;
    private final int year;

    public Auto() {
        this.horsepower = getRandom(50, 500);
        this.year = getRandom(1971, 2022);
    }

    @Override
    public String toString() {
        return "Auto{" +
                "horsepower=" + horsepower +
                ", year=" + year +
                '}';
    }
}
