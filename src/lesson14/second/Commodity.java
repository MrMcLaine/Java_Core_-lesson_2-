package lesson14.second;

public class Commodity implements Comparable<Commodity> {
    private String description;
    private int length;
    private int width;
    private int weight;

    public Commodity() {
    }

    public Commodity(String description, int length, int width, int weight) {
        this.description = description;
        this.length = length;
        this.width = width;
        this.weight = weight;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Commodity{" +
                "description='" + description + '\'' +
                ", length=" + length +
                ", width=" + width +
                ", weight=" + weight +
                '}';
    }

    @Override
    public int compareTo(Commodity o) {
        return this.getDescription().compareTo(o.getDescription());
    }
}
