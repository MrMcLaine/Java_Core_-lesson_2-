package lesson13;

public class Person {
    private int weight;
    private int growth;

    public Person(int weight, int growth) {
        this.weight = weight;
        this.growth = growth;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getGrowth() {
        return growth;
    }

    public void setGrowth(int growth) {
        this.growth = growth;
    }
}