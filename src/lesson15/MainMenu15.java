package lesson15;

import java.util.Scanner;

import static java.lang.System.exit;
import static lesson15.UtilClass15.*;

public class MainMenu15 {
    public static void printMenu(String[] options) {
        for (String option : options) {
            System.out.println(option);
        }
        System.out.print("Choose your option : ");
    }

    private static final String[] options = {
            "1 - to add the club member.",
            "2 - to add a pet to the club member.",
            "3 - to remove a pet by name from the club member",
            "4 - to remove the club member",
            "5 - to remove pet by name from all club members",
            "6 - to print ZooClub",
            "0 - to exit."
    };

    public static void main(String[] args) {

        addTestMembersWithPet();

        Scanner console = new Scanner(System.in);

        int option = 1;
        while (option != 0) {
            printMenu(options);
            try {
                option = console.nextInt();
                switch (option) {
                    case 1 -> addClubMember();
                    case 2 -> addPetToMember();
                    case 3 -> removePetFromMember();
                    case 4 -> removeClubMember();
                    case 5 -> removePetFromAllMembers();
                    case 6 -> printZooClub();
                    case 0 -> exit(0);
                }
            } catch (Exception ex) {
                System.out.println("Please enter an integer value between 1 and " + options.length);
                console.next();
            }
        }
    }
}
