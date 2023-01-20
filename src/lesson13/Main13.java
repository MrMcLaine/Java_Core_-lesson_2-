package lesson13;

import java.util.Scanner;

import static java.lang.System.exit;

public class Main13 {
    public static void printMenu(String[] options) {
        for (String option : options) {
            System.out.println(option);
        }
        System.out.print("Choose your option : ");
    }

    private static final String[] options = {"1 - to add faction.",
            "2 - to remove faction.",
            "3 - to print all factions.",
            "4 - to clear faction.",
            "5 - to print faction.",
            "6 - to add a deputy in faction.",
            "7 - to remove deputy from faction.",
            "8 - to print list bribers in this faction.",
            "9 - to print the biggest briber in this faction.",
            "0 - to exit."
    };

    public static void main(String[] args) {

        Scanner console = new Scanner(System.in);

        int option = 1;
        while (option != 0) {
            printMenu(options);
            try {
                option = console.nextInt();
                switch (option) {
                    case 1 -> {
                        System.out.println("Enter name to new Faction");
                        Scanner console1 = new Scanner(System.in);
                        VerkhovnaRada.getInstance().addFaction(console1.nextLine());
                    }
                    case 2 -> {
                        System.out.println("Enter name faction who you want to remove");
                        Scanner console2 = new Scanner(System.in);
                        VerkhovnaRada.getInstance().removeFactions(console2.nextLine());
                    }
                    case 3 -> System.out.println(VerkhovnaRada.getInstance().getFactions());
                    case 4 -> {
                        System.out.println("Enter name faction who you want to clear");
                        Scanner console4 = new Scanner(System.in);
                        VerkhovnaRada.getInstance().clearFraction(console4.nextLine());
                    }
                    case 5 -> {
                        System.out.println("Enter name faction who you want to print");
                        Scanner console5 = new Scanner(System.in);
                        VerkhovnaRada.getInstance().printFaction(console5.nextLine());
                    }
                    case 6 -> {
                        System.out.println("Enter name faction who you want to add deputy");
                        Scanner console6 = new Scanner(System.in);
                        VerkhovnaRada.getInstance().addDeputyToFaction(console6.nextLine());
                    }
                    case 7 -> {
                        System.out.println("Enter name faction who you want to remove deputy");
                        Scanner console7 = new Scanner(System.in);
                        VerkhovnaRada.getInstance().removeDeputyFromFaction(console7.nextLine());
                    }
                    case 8 -> {
                        System.out.println("Enter name faction who you want to print bribers list");
                        Scanner console8 = new Scanner(System.in);
                        VerkhovnaRada.getInstance().printAllBribersInThisFaction(console8.nextLine());
                    }
                    case 9 -> {
                        System.out.println("Enter name faction who you want to print the biggest briber");
                        Scanner console9 = new Scanner(System.in);
                        VerkhovnaRada.getInstance().printTheBiggestBriberInThisFaction(console9.nextLine());
                    }
                    case 0 -> exit(0);
                }
            } catch (Exception ex) {                System.out.println("Please enter an integer value between 1 and " + options.length);
                console.next();
            }
        }
    }
}
