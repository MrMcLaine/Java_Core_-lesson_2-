package lesson15;

public class Pet {
    private PetType type;
    private String name;

    public Pet(PetType type, String name) {
        this.type = type;
        this.name = name;
    }

    public PetType getType() {
        return type;
    }

    public void setType(PetType type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Pet{" +
                "type=" + type +
                ", name='" + name + '\'' +
                '}';
    }
}
