package lesson11;
import static lesson11.lesson11.getRandom;

public class SteeringWheel extends AutoObject {
    private final int diameter;
    private final String material;

    public SteeringWheel() {
        this.diameter = getRandom(13, 26);
        this.material = getMaterial(getRandom(0,1));
    }

    public static String getMaterial(int levelOfPrestige) {
        if(levelOfPrestige == 0) {
            return "Skin";
        } else {
            return "Alcantara";
        }
    }

    @Override
    public String toString() {
        return "SteeringWheel{" +
                "diameter=" + diameter +
                ", material='" + material + '\'' +
                '}';
    }
}
