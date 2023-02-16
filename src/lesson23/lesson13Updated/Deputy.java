package lesson23.lesson13Updated;

public class Deputy extends Person implements Comparable<Deputy> {
    private String surname;
    private String name;
    private int age;
    private boolean isBriber;
    private int sizeOfBribe;

    public Deputy() {
        super(0, 0);
    }

    public Deputy(int weight, int growth, String surname, String name, int age, boolean isBriber) {
        super(weight, growth);
        this.surname = surname;
        this.name = name;
        this.age = age;
        this.isBriber = isBriber;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isBriber() {
        return isBriber;
    }

    public void setBriber(boolean briber) {
        isBriber = briber;
    }

    public int getSizeOfBribe() {
        return sizeOfBribe;
    }

    public void setSizeOfBribe(int sizeOfBribe) {
        this.sizeOfBribe = sizeOfBribe;
    }

    @Override
    public String toString() {
        return "Deputy{" +
                "surname='" + surname + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", isBriber=" + isBriber +
                ", sizeOfBribe=" + sizeOfBribe +
                '}';
    }

    @Override
    public int compareTo(Deputy o) {
        return (-1) * this.sizeOfBribe > o.sizeOfBribe ? 1 : -1;
    }
}
