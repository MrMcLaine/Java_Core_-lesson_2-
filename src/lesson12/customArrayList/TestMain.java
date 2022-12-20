package lesson12.customArrayList;

import java.util.Arrays;

public class TestMain {
    public static void main(String[] args) {
        CustomArrayList<String> testList = new CustomArrayList<>();
        testList.add("First");
        testList.add("Second");
        testList.add("Third");
        testList.add("Fourth");
        testList.add("Fifth");
        testList.add("Sixth");

        System.out.println(testList);

        testList.remove(0);

        System.out.println(testList);
    }
}
