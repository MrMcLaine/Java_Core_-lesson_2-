package lesson23.lesson14Updated.second;

import java.util.*;

public class UtilClass {

    protected static Set<Commodity> commodities = new HashSet<>();

    public static void addProduct() {
        System.out.println("You must to write some properties for this product");
        commodities.add(questionsForCreate());

        printSet(commodities);
    }

    public static void removeProduct() {
        System.out.println("Who you want to remove? Enter his description, please");

        Scanner console = new Scanner(System.in);
        String description = console.nextLine();
        commodities.removeIf(c -> description.equalsIgnoreCase(c.getDescription()));
        printSet(commodities);
    }

    public static void replaceProduct() {
        System.out.println("If you want to replace some product, first you need to create a new product.");

        Commodity newProduct = questionsForCreate();

        System.out.println("Now, enter a description of the product you wish to replace.");

        Scanner console = new Scanner(System.in);
        String description = console.nextLine();
        for (Commodity c : commodities) {
            if (description.equalsIgnoreCase(c.getDescription())) {
                commodities.remove(c);
                commodities.add(newProduct);
            }
        }
        printSet(commodities);
    }

    public static void sortByLength() {
        commodities.stream()
                .sorted(Comparator.comparing(Commodity::getLength))
                .forEach(System.out::println);
    }

    public static void sortByWidth() {
        commodities.stream()
                .sorted(Comparator.comparing(Commodity::getWidth))
                .forEach(System.out::println);
    }

    public static void sortByWeight() {
        commodities.stream()
                .sorted(Comparator.comparing(Commodity::getWeight))
                .forEach(System.out::println);
    }

    public static void printSomeProductByNumber() {
        Object[] array = commodities.toArray();
        System.out.println("Please enter an integer value between 0 and " + commodities.size());
        Scanner console = new Scanner(System.in);
        int number = console.nextInt();

        System.out.println(array[number]);
    }

    public static void printSet(Set<Commodity> set) {
        set
                .forEach(System.out::println);
    }

    private static Commodity questionsForCreate() {
        Commodity product = new Commodity();

        Scanner console = new Scanner(System.in);

        System.out.println("Enter description");
        product.setDescription(console.nextLine());

        System.out.println("Enter length");
        product.setLength(console.nextInt());

        System.out.println("Enter width");
        product.setWidth(console.nextInt());

        System.out.println("Enter weight");
        product.setWeight(console.nextInt());

        return product;
    }

    public static void addTestElements() {
        commodities.add(new Commodity("Alcohol", 25, 5, 3));
        commodities.add(new Commodity("Chocolate", 20, 12, 1));
        commodities.add(new Commodity("Table", 120, 90, 23));
        commodities.add(new Commodity("Shampoo", 25, 7, 2));
        commodities.add(new Commodity("Cheese", 30, 30, 10));
        commodities.add(new Commodity("Trousers", 130, 40, 1));
    }
}