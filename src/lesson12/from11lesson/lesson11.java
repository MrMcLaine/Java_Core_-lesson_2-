package lesson12.from11lesson;

import java.util.*;

public class lesson11 {
    public static void main(String[] args) {

//1

        List<Integer> arrInt = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            arrInt.add(getRandom(1, 1000));
        }
        Collections.sort(arrInt);
        System.out.println(arrInt);
        Collections.reverse(arrInt);
        System.out.println(arrInt);

//2

        List<ArrayList<AutoObject>> autoObjArr = new ArrayList<>();
        int ySize = getRandom(1, 20);
        int xSize = getRandom(1, 20);
        for (int i = 0; i < ySize; i++) {
            ArrayList<AutoObject> arrListTemp = new ArrayList<>();
            for (int j = 0; j < xSize; j++) {
                arrListTemp.add(getAutoObject(getRandom(1, 3)));
            }
            autoObjArr.add(arrListTemp);
        }

        System.out.println(autoObjArr);


//Menu

        System.out.println("Welcome in console menu!");
        System.out.println("If you want to see a data of all elements enter number 1.");
        System.out.println("If you want to set one random AutoObject enter number 2.");

        Scanner console = new Scanner(System.in);
        int numberOfChoice = console.nextInt();

        if (numberOfChoice == 1) {
            System.out.println(autoObjArr);
        } else if (numberOfChoice == 2) {
            AutoObject setObject = getAutoObject(getRandom(1, 3));
            for(ArrayList<AutoObject> list : autoObjArr) {
                int lengthList = list.size();
                list.clear();
                for(int i = 0; i < lengthList; i++) {
                    list.add(setObject);
                }
            }
            System.out.println(autoObjArr);
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
