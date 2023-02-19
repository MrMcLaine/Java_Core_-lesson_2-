package lesson24.cinema;

import static lesson24.cinema.util.TimeCounter.timeCounter;

public class Seance implements Comparable<Seance> {
    private Movie movie;
    private Time startTime;
    private Time endTime;

    public Seance(Movie movie, Time startTime) {
        this.movie = movie;
        this.startTime = startTime;
        this.endTime = timeCounter(startTime, movie.getDuration());
    }

    public Movie getMovie() {
        return movie;
    }

    public void setMovie(Movie movie) {
        this.movie = movie;
    }

    public Time getStartTime() {
        return startTime;
    }

    public void setStartTime(Time startTime) {
        this.startTime = startTime;
    }

    public Time getEndTime() {
        return endTime;
    }

    public void setEndTime(Time endTime) {
        this.endTime = endTime;
    }

    @Override
    public String toString() {
        return "Seance{" +
                "movie=" + movie +
                ", startTime=" + startTime +
                ", endTime=" + endTime +
                '}';
    }

    @Override
    public int compareTo(Seance o2) {
        if (this.startTime.getHour() > o2.startTime.getHour()) {
            return 1;
        } else if (this.startTime.getHour() < o2.startTime.getHour()) {
            return -1;
        } else {
            if (this.startTime.getMin() > o2.startTime.getMin()) {
                return 1;
            } else if (this.startTime.getMin() < o2.startTime.getMin()) {
                return -1;
            }
        }
        return 0;
    }
}
