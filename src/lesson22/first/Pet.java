package lesson22.first;

public abstract class Pet {
    public abstract void voice();

    Voice voice = System.out::println;
}

interface Voice {
    void doVoice(String message);
}
