package lesson4.first;

public class CoffeRobot extends Robot {
    @Override
    public void work() {
        super.job = "do a coffee";
        super.work();
    }
}
