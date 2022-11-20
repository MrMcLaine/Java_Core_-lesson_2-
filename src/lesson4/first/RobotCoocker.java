package lesson4.first;

public class RobotCoocker extends Robot{
    @Override
    public void work() {
        super.job = "am just cooking";
        super.work();
    }
}
