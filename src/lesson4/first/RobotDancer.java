package lesson4.first;

import lesson4.first.Robot;

public class RobotDancer extends Robot {
    @Override
    public void work() {
        super.job = "just dance";
        super.work();
    }
}
