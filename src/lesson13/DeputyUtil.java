package lesson13;

public class DeputyUtil {
    public static void bribe(Deputy deputy, int sizeOfBribe) {
        if (!deputy.isBriber()) {
            System.out.println("This deputy doesn't take bribes");
        } else {
            System.out.println(deputy.getSizeOfBribe());
            analyzeBribe(deputy, sizeOfBribe);
        }
    }

    private static void analyzeBribe(Deputy deputy, int sizeOfBribe) {
        if (sizeOfBribe > 5000) {
            System.out.println("The police will imprison the deputy!");
        } else {
            deputy.setSizeOfBribe(sizeOfBribe);
        }
    }
}
