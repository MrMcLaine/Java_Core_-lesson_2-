package lesson14.first;

import java.util.HashSet;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class Main14 {
    public static void main(String[] args) {

//1

        Set<CustomClass> setWithoutSorted = new HashSet<>();
        SortedSet<CustomClass> someSetWithComparable = new TreeSet<>();
        SortedSet<CustomClass> someSetWithComparator = new TreeSet<>(new CustomAllFieldsComparator());

        setWithoutSorted.add(new CustomClass("C", 1));
        setWithoutSorted.add(new CustomClass("A", 3));
        setWithoutSorted.add(new CustomClass("D", 2));
        setWithoutSorted.add(new CustomClass("B", 5));
        setWithoutSorted.add(new CustomClass("E", 4));

        for (CustomClass cc : setWithoutSorted) {
            someSetWithComparable.add(cc);
            someSetWithComparator.add(cc);
            System.out.println(cc);
        }

        System.out.println("<----------------------->");

        for (CustomClass cc : someSetWithComparable) {
            System.out.println(cc);
        }

        System.out.println("<----------------------->");

        for (CustomClass cc : someSetWithComparator) {
            System.out.println(cc);
        }
    }
}
