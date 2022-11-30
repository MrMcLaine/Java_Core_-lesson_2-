import lesson6.first.FixWageWorker;
import lesson6.first.HourlyWageWorker;
import lesson6.second.interface2.MyCalculator;
import lesson7.Plane;
import lesson7.SU27;

public class Main {
    public static void main(String[] args) {
        SU27 newPlane = new SU27(2500, "grey");
        newPlane.startEngines();
        newPlane.takeOff();
        newPlane.up();
        newPlane.left();
        newPlane.down();
        newPlane.right();
        newPlane.stealthTechnology();
        newPlane.nuclearStrike();
        newPlane.turboAcceleration();
        newPlane.landing();
    }
}