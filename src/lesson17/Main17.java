package lesson17;

import java.util.Random;

public class Main17 {
    public static void main(String[] args) {
        int arrLength = getRandom(20);
        System.out.println("Array length is " + arrLength + " numbers.");
        Number[] array = new Number[arrLength];
        for (int i = 0; i < arrLength; i++) {
            array[i] = getRandom(100);
            System.out.println("#" + (i + 1) + " = " + array[i]);
        }

        Collection collection = new Collection(array);
        Iterator iterForward = collection.createForward();
        Iterator iterBackward = collection.createBackward();

        System.out.println("This is array where changed odd numbers to \"ZERO\"");
        while (iterForward.hasNext()) {
            System.out.println(iterForward.next());
        }

        System.out.println("This is array where every other element is hidden.");

        while (iterBackward.hasNext()) {
            System.out.println(iterBackward.next());
        }

        System.out.println("This is array where every third element from the end is odd.");

        Print anonymous = collection.createPrint();
        anonymous.print();

        System.out.println("This is array where every fifth element from the end is odd and reduced by 100.");

        Print local = collection.someLocal();
        local.print();

        System.out.println("This is array where every other element is odd and reduced by 1.");

        Print someStatic = Collection.createSomeStatic();
        someStatic.print();
    }

    private static Integer getRandom(int i) {
        Random random = new Random();
        return random.nextInt(i);
    }
}
