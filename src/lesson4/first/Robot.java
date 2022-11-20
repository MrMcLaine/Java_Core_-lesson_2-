package lesson4.first;

public class Robot {
    protected String job = "do something";
    public void work(){
        String name = getClass().getSimpleName();
        System.out.println("I am a " + name + " - I " + job + ".");
    }
}
