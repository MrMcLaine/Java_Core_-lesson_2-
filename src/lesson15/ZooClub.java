package lesson15;

import java.util.List;
import java.util.Map;

public class ZooClub {
    private Map<Person, List<Pet>> map;

    public ZooClub() {
    }

    public Map<Person, List<Pet>> getMap() {
        return map;
    }

    public void setMap(Map<Person, List<Pet>> map) {
        this.map = map;
    }

    @Override
    public String toString() {
        return "ZooClub{" +
                "map=" + map +
                '}';
    }
}
