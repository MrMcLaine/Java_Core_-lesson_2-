package lesson23.lesson14Updated;

import lesson23.lesson14Updated.first.CustomClass;

import java.util.*;

public class Main14 {
    public static void main(String[] args) {

//1

        Set<CustomClass> setWithoutSorted = new HashSet<>();

        setWithoutSorted.add(new CustomClass("C", 1));
        setWithoutSorted.add(new CustomClass("A", 3));
        setWithoutSorted.add(new CustomClass("D", 2));
        setWithoutSorted.add(new CustomClass("B", 5));
        setWithoutSorted.add(new CustomClass("E", 4));

        setWithoutSorted.stream()
                .sorted(Comparator.comparing(CustomClass::getSomeString))
                .forEach(System.out::println);

        setWithoutSorted.stream()
                .sorted(Comparator.comparing(CustomClass::getSomeInteger))
                .forEach(System.out::println);
    }
}
