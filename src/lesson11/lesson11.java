package lesson11;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Random;
import java.util.Scanner;

public class lesson11 {
    public static void main(String[] args) {

//1

        Integer[] arrInt = new Integer[10];
        for (int i = 0; i < arrInt.length; i++) {
            arrInt[i] = getRandom(1, 1000);
        }
        Arrays.sort(arrInt);
        System.out.println(Arrays.toString(arrInt));
        Arrays.sort(arrInt, Comparator.reverseOrder());
        System.out.println(Arrays.toString(arrInt));


//2

        AutoObject[][] autoObjArr = new AutoObject[getRandom(1, 20)][getRandom(1, 20)];
        for (int i = 0; i < autoObjArr.length; i++) {
            for (int j = 0; j < autoObjArr[0].length; j++) {
                autoObjArr[i][j] = getAutoObject(getRandom(1, 3));
            }
        }

//Menu

        System.out.println("Welcome in console menu!");
        System.out.println("If you want to see a data of all elements enter number 1.");
        System.out.println("If you want to set one random AutoObject enter number 2.");

        Scanner console = new Scanner(System.in);
        int numberOfChoice = console.nextInt();

        if (numberOfChoice == 1) {
            System.out.println(Arrays.deepToString(autoObjArr));
        } else if (numberOfChoice == 2) {
            AutoObject setObject = getAutoObject(getRandom(1, 3));
            for (AutoObject[] autoObjects : autoObjArr) {
                Arrays.fill(autoObjects, setObject);
            }
            System.out.println(Arrays.deepToString(autoObjArr));
        } else {
            throw new IllegalArgumentException("Sorry, but you try to enter another number");
        }
    }

    public static Integer getRandom(int min, int max) {
        Random r = new Random();
        return r.nextInt(max - min + 1) + min;
    }

    static AutoObject getAutoObject(int numberOfElement) {
        return switch (numberOfElement) {
            case 1 -> new Auto();
            case 2 -> new SteeringWheel();
            case 3 -> new Engine();
            default -> null;
        };

    }
}
