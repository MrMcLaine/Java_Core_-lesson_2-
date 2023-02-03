package lesson18;

import java.util.ArrayList;
import java.util.List;

public class Main18<K, V> {
    public static void main(String[] args) {

//1

        List<Integer> someList = new ArrayList<>();

        someList.add(1);

        System.out.println(someList);

        String someString = "Custom String Object";
        addToList(someList, someString);

        System.out.println(someList);

//2

        List<MyEntry<Integer, String>> myEntries = new ArrayList<>();
        myEntries.add(new MyEntry<>(1, "First"));
        myEntries.add(new MyEntry<>(2, "Second"));
        myEntries.add(new MyEntry<>(3, "Third"));
        myEntries.add(new MyEntry<>(4, "Fourth"));
        myEntries.add(new MyEntry<>(5, "Fifth"));
        CustomMap<Integer, String> cm = new CustomMap<>(myEntries);

        System.out.println("Print default map");
        cm.printMap();
        System.out.println("Add new MyEntry(99, Ninety nine");
        cm.add(99, "Ninety nine");
        cm.printMap();
        System.out.println("Delete element with key = 2");
        cm.deleteByKey(2);
        cm.printMap();
        System.out.println("Delete element with value = Third");
        cm.deleteByValue("Third");
        cm.printMap();
        System.out.println("Print set of keys");
        cm.printSetKeys();

    }

    public static <T> void addToList(List<T> l, Object o) {
        l.add((T) o);
    }


}
