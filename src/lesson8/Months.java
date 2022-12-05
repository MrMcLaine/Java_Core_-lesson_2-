package lesson8;

public enum Months {
    JANUARY(Seasons.WINTER, 31),
    FEBRUARY(Seasons.WINTER, 28),
    MARCH(Seasons.SPRING, 31),
    APRIL(Seasons.SPRING, 30),
    MAY(Seasons.SPRING, 31),
    JUNE(Seasons.SUMMER,30),
    JULY(Seasons.SUMMER, 31),
    AUGUST(Seasons.SUMMER, 31),
    SEPTEMBER(Seasons.AUTUMN, 30),
    OCTOBER(Seasons.AUTUMN, 31),
    NOVEMBER(Seasons.AUTUMN, 30),
    DECEMBER(Seasons.WINTER, 31);

    Integer days;
    Seasons season;

    Months(Seasons season, Integer days) {
        this.days = days;
        this.season = season;
    }

    Months() {

    }

    public Integer getDays() {
        return days;
    }

    public void setDays(Integer days) {
        this.days = days;
    }

    public Seasons getSeason() {
        return season;
    }

    public void setSeason(Seasons season) {
        this.season = season;
    }
}
