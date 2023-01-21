package lesson16;

import java.util.List;
import java.util.Objects;

public class Casino {
    private String name;
    private List<String> games;
    public int moneyFond;

    public Casino() {
    }

    public Casino(String name, int moneyFond) {
        this.name = name;
        this.moneyFond = moneyFond;
    }

    public Casino(String name, List<String> games, int moneyFond) {
        this.name = name;
        this.games = games;
        this.moneyFond = moneyFond;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<String> getGames() {
        return games;
    }

    public void setGames(List<String> games) {
        this.games = games;
    }

    public int getMoneyFond() {
        return moneyFond;
    }

    public void setMoneyFond(int moneyFond) {
        this.moneyFond = moneyFond;
    }

    public String myMethod(String someString, int someInt) {
        return "This is myMethod with 2 parameters.";
    }

    public String myMethod(String someString) {
        return "This is myMethod with 1 parameter.";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Casino casino = (Casino) o;
        return moneyFond == casino.moneyFond && Objects.equals(name, casino.name) && Objects.equals(games, casino.games);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, games, moneyFond);
    }

    @Override
    public String toString() {
        return "Casino{" +
                "name='" + name + '\'' +
                ", games=" + games +
                ", moneyFond=" + moneyFond +
                '}';
    }
}
