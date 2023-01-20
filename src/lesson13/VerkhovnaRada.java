package lesson13;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class VerkhovnaRada {
    private static VerkhovnaRada single_instance = null;
    private List<Faction> factions = new ArrayList<>();

    public static VerkhovnaRada getInstance() {
        if (single_instance == null) {
            single_instance = new VerkhovnaRada();
        }
        return single_instance;
    }

    public List<Faction> getFactions() {
        return factions;
    }

    public void setFactions(List<Faction> factions) {
        this.factions = factions;
    }

    public void addFaction(String name) {
        factions.add(new Faction(name));
    }

    public void removeFactions(String name) {
        factions.removeIf(faction -> faction.getName().equalsIgnoreCase(name));
    }

    public void removeAllFractions() {
        factions.clear();
    }

    public void printFaction(String name) {
        Iterator<Faction> iterator = factions.iterator();
        while (iterator.hasNext()) {
            Faction faction = iterator.next();
            if (faction.getName().equalsIgnoreCase(name)) {
                System.out.println(iterator);
            }
        }
    }

    public void addDeputyToFaction(String nameOfFaction) {
        Iterator<Faction> iterator = factions.iterator();
        while (iterator.hasNext()) {
            Faction faction = iterator.next();
            if (faction.getName().equalsIgnoreCase(nameOfFaction)) {
                faction.addDeputy();
            }
        }
    }

    public void removeDeputyFromFaction(String nameOfFaction) {
        Iterator<Faction> iterator = factions.iterator();
        while (iterator.hasNext()) {
            Faction faction = iterator.next();
            if (faction.getName().equalsIgnoreCase(nameOfFaction)) {
                faction.removeDeputy();
            }
        }
    }

    public void printAllBribersInThisFaction(String name) {
        Iterator<Faction> iterator = factions.iterator();
        while (iterator.hasNext()) {
            Faction faction = iterator.next();
            if (faction.getName().equalsIgnoreCase(name)) {
                System.out.println(faction.getAllBribers());
            }
        }
    }

    public void printTheBiggestBriberInThisFaction(String name) {
        Iterator<Faction> iterator = factions.iterator();
        while (iterator.hasNext()) {
            Faction faction = iterator.next();
            if (faction.getName().equalsIgnoreCase(name)) {
                System.out.println(faction.getTheBiggestBriberOfThisFaction());
            }
        }
    }

    public void printAllDeputiesInThisFaction(String name) {
        Iterator<Faction> iterator = factions.iterator();
        while (iterator.hasNext()) {
            Faction faction = iterator.next();
            if (faction.getName().equalsIgnoreCase(name)) {
                System.out.println(faction.getDeputyList());
            }
        }
    }

    public void clearFraction(String name) {
        Iterator<Faction> iterator = factions.iterator();
        while (iterator.hasNext()) {
            Faction faction = iterator.next();
            if (faction.getName().equalsIgnoreCase(name)) {
                faction.clearFaction();
            }
        }
    }

    @Override
    public String toString() {
        return "VerkhovnaRada{" +
                "factions=" + factions +
                '}';
    }
}
