package lesson12.from11lesson;


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
