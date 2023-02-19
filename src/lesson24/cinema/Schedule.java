package lesson24.cinema;

import java.util.Set;
import java.util.TreeSet;

import static lesson24.cinema.util.ScheduleUtil.findSeance;
import static lesson24.cinema.util.ScheduleUtil.setWithoutDeletedElement;

public class Schedule {
    private Set<Seance> seances = new TreeSet<>();

    public Schedule() {
    }

    public Set<Seance> getSeances() {
        return seances;
    }

    public void setSeances(Set<Seance> seances) {
        this.seances = seances;
    }

    public void addSeance(Seance seance) {
        this.seances.add(seance);
    }

    public void removeSeance(Seance seance) {
        if (findSeance(seances, seance)) {
            Set<Seance> tempSet = setWithoutDeletedElement(seances, seance);
            seances.clear();
            setSeances(tempSet);
        }
    }

    public void removeSeanceWithMovie(Movie movie) {
        Set<Seance> tempSet = setWithoutDeletedElement(seances, movie);
        seances.clear();
        setSeances(tempSet);
    }

    @Override
    public String toString() {
        return "Schedule{" +
                "seances=" + seances +
                '}';
    }
}
