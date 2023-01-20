package lesson15;

import java.util.*;

import static lesson15.PetType.CAT;
import static lesson15.PetType.DOG;

public class UtilClass15 {
    static ZooClub club = new ZooClub();

    public static void addTestMembersWithPet() {
        Map<Person, List<Pet>> map = new HashMap<>();

        List<Pet> nickList = new ArrayList<>();
        nickList.add(new Pet(DOG, "Bobik"));
        nickList.add(new Pet(CAT, "Vasil"));
        nickList.add(new Pet(DOG, "Sirko"));
        nickList.add(new Pet(CAT, "Mars"));
        map.put(new Person("Nick", 44), nickList);

        List<Pet> josephList = new ArrayList<>();
        josephList.add(new Pet(CAT, "Saturn"));
        josephList.add(new Pet(CAT, "Neptune"));
        josephList.add(new Pet(CAT, "Venera"));
        josephList.add(new Pet(CAT, "Jupiter"));
        map.put(new Person("Joseph", 73), josephList);

        List<Pet> adamList = new ArrayList<>();
        adamList.add(new Pet(DOG, "Danger"));
        adamList.add(new Pet(DOG, "SuperMan"));
        adamList.add(new Pet(DOG, "Fire"));
        adamList.add(new Pet(DOG, "SpiderMan"));
        map.put(new Person("Adam", 24), adamList);

        List<Pet> jackList = new ArrayList<>();
        jackList.add(new Pet(CAT, "Sam"));
        jackList.add(new Pet(CAT, "Mathew"));
        jackList.add(new Pet(CAT, "Antun"));
        jackList.add(new Pet(DOG, "Slow"));
        map.put(new Person("Jack", 54), jackList);

        club.setMap(map);
    }

    public static void addClubMember() {
        System.out.println("Enter name");

        Scanner console = new Scanner(System.in);
        String name = console.nextLine();

        System.out.println("Enter age");
        int age = console.nextInt();

        club.getMap().put(new Person(name, age), new ArrayList<>());
    }

    public static void addPetToMember() {
        System.out.println("Enter member`s name");

        Scanner console = new Scanner(System.in);
        String membersName = console.nextLine();

        Person member = findInMap(membersName);

        System.out.println("If new pet is dog enter 0 or if new pet is cat enter 1");
        int numberOfChoice = console.nextInt();

        PetType type = null;
        if (numberOfChoice == 0) {
            type = DOG;
        } else if (numberOfChoice == 1) {
            type = CAT;
        }

        System.out.println("Enter pet`s name");
        Scanner console2 = new Scanner(System.in);
        String petName = console2.nextLine();
        club.getMap().get(member).add(new Pet(type, petName));
    }

    public static void removePetFromMember() {
        System.out.println("Enter member`s name");

        Scanner console = new Scanner(System.in);
        String membersName = console.nextLine();

        Person member = findInMap(membersName);

        System.out.println("Enter name of pet");

        String petName = console.nextLine();

        club.getMap().get(member).removeIf(pet -> pet.getName().equalsIgnoreCase(petName));
    }

    public static void removeClubMember() {
        System.out.println("Enter member`s name who you want to remove");

        Scanner console = new Scanner(System.in);
        String name = console.nextLine();

        Person removed = findInMap(name);

        club.getMap().remove(removed);
    }

    public static void removePetFromAllMembers() {
        System.out.println("Enter name of pet");

        Scanner console = new Scanner(System.in);
        String petName = console.nextLine();

        Map<Person, List<Pet>> map = club.getMap();
        Set<Person> personsSet = map.keySet();

        for (Person person : personsSet) {
            for (int i = 0; i < club.getMap().get(person).size(); i++) {
                club.getMap().get(person).removeIf(pet -> pet.getName().equalsIgnoreCase(petName));
            }
        }
    }

    public static void printZooClub() {
        Set<Person> personsSet = club.getMap().keySet();

        for (Person person: personsSet) {
            System.out.println(person + " " + club.getMap().get(person));
        }
    }

    private static Person findInMap(String name) {
        Map<Person, List<Pet>> map = club.getMap();
        Set<Person> personsSet = map.keySet();
        Person wanted = null;

        for (Person person : personsSet) {
            if (person.getName().equalsIgnoreCase(name)) {
                wanted = person;
            }
        }
        return wanted;
    }
}
