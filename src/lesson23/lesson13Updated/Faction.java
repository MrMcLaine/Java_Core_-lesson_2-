package lesson23.lesson13Updated;

import java.util.*;

public class Faction {

    private String name;
    private List<Deputy> deputyList = new ArrayList<>();

    public Faction(String name) {
        this.name = name;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Deputy> getDeputyList() {
        return deputyList;
    }

    public void setDeputyList(List<Deputy> deputyList) {
        this.deputyList = deputyList;
    }

    public void addDeputy() {
        Deputy newDeputy = new Deputy();
        System.out.println("You must to write some properties for this deputy");

        Scanner console = new Scanner(System.in);

        System.out.println("Enter Surname");
        newDeputy.setSurname(console.nextLine());

        System.out.println("Enter Name");
        newDeputy.setName(console.nextLine());

        System.out.println("Enter age");
        newDeputy.setAge(console.nextInt());

        System.out.println("Is he a briber? If it's true enter '1', or '0' if this statement is false");
        newDeputy.setBriber(isBriber(console.nextInt()));

        System.out.println("Enter weigh");
        newDeputy.setWeight(console.nextInt());

        System.out.println("Enter growth");
        newDeputy.setGrowth(console.nextInt());

        deputyList.add(newDeputy);
    }

    public void removeDeputy() {
        System.out.println("Who you want to remove? Enter his surname, please");

        Scanner console = new Scanner(System.in);
        deputyList.remove(findIndex(console.nextLine()));
    }

    public List<Deputy> getAllBribers() {
        return deputyList.stream()
                .filter(Deputy::isBriber)
                .toList();
    }

    public Deputy getTheBiggestBriberOfThisFaction() {
        return deputyList.stream()
                .max(Comparator.comparing(Deputy::getSizeOfBribe))
                .orElseThrow(NoSuchElementException::new);
    }

    public void printAllDeputies() {
        deputyList.forEach(System.out::println);
    }

    public void clearFaction() {
        deputyList.clear();
    }

    private static boolean isBriber(int number) {
        if (number == 1) {
            return true;
        } else if (number == 0) {
            return false;
        } else {
            throw new IllegalArgumentException("Sorry, but you were wrong.");
        }
    }

    private int findIndex(String surname) {
        for (int i = 0; i < deputyList.size(); i++) {
            if (deputyList.get(i).getSurname().equalsIgnoreCase(surname)) {
                return i;
            }
        }
        return -1;
    }

    @Override
    public String toString() {
        return "Faction{" +
                "name='" + name + '\'' +
                ", deputyList=" + deputyList +
                '}';
    }
}
