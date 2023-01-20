package lesson14.second;

import java.util.Scanner;

import static java.lang.System.exit;
import static lesson14.second.UtilClass.*;

public class MainForMenu {


    public static void printMenu(String[] options) {
        for (String option : options) {
            System.out.println(option);
        }
        System.out.print("Choose your option : ");
    }

    private static final String[] options = {
            "1 - to add the product.",
            "2 - to remove the product.",
            "3 - to replace the product.",
            "4 - to sorted products by description.",
            "5 - to sorted products by length.",
            "6 - to sorted products by width.",
            "7 - to sorted products by weight.",
            "8 - to print one element who you need.",
            "0 - to exit."
    };

    public static void main(String[] args) {

        addTestElements();

        Scanner console = new Scanner(System.in);

        int option = 1;
        while (option != 0) {
            printMenu(options);
            try {
                option = console.nextInt();
                switch (option) {
                    case 1 -> {
                        addProduct();
                    }
                    case 2 -> {
                        removeProduct();
                    }
                    case 3 -> {
                        replaceProduct();
                    }
                    case 4 -> {
                        printSet(someSetWithComparable);
                    }
                    case 5 -> {
                        sortByLength();
                    }
                    case 6 -> {
                        sortByWidth();
                    }
                    case 7 -> {
                        sortByWeight();
                    }
                    case 8 -> {
                        printSomeProductByNumber();
                    }
                    case 0 -> exit(0);
                }
            } catch (Exception ex) {
                System.out.println("Please enter an integer value between 1 and " + options.length);
                console.next();
            }
        }
    }
}
