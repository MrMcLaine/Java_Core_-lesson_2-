package lesson14.second;

import java.util.*;

public class UtilClass {

    protected static SortedSet<Commodity> someSetWithComparable = new TreeSet<>();
    private static SortedSet<Commodity> someSetWithLengthComparator = new TreeSet<>(new CommodityLengthComparator());
    private static SortedSet<Commodity> someSetWithWidthComparator = new TreeSet<>(new CommodityWidthComparator());
    private static SortedSet<Commodity> someSetWithWeightComparator = new TreeSet<>(new CommodityWeightComparator());

    public static void addProduct() {
        System.out.println("You must to write some properties for this product");
        someSetWithComparable.add(questionsForCreate());

        printSet(someSetWithComparable);
    }

    public static void removeProduct() {
        System.out.println("Who you want to remove? Enter his description, please");

        Scanner console = new Scanner(System.in);
        String description = console.nextLine();
        for (Commodity c : someSetWithComparable) {
            if (description.equalsIgnoreCase(c.getDescription())) {
                someSetWithComparable.remove(c);
            }
        }
        printSet(someSetWithComparable);
    }

    public static void replaceProduct() {
        System.out.println("If you want to replace some product, first you need to create a new product.");

        Commodity newProduct = questionsForCreate();

        System.out.println("Now, enter a description of the product you wish to replace.");

        Scanner console = new Scanner(System.in);
        String description = console.nextLine();
        for (Commodity c : someSetWithComparable) {
            if (description.equalsIgnoreCase(c.getDescription())) {
                someSetWithComparable.remove(c);
                someSetWithComparable.add(newProduct);
            }
        }
        printSet(someSetWithComparable);
    }

    public static void sortByLength() {
        someSetWithLengthComparator.addAll(someSetWithComparable);

        printSet(someSetWithLengthComparator);
    }

    public static void sortByWidth() {
        someSetWithWidthComparator.addAll(someSetWithComparable);

        printSet(someSetWithWidthComparator);
    }

    public static void sortByWeight() {
        someSetWithWeightComparator.addAll(someSetWithComparable);

        printSet(someSetWithWeightComparator);
    }

    public static void printSomeProductByNumber() {
        Object[] array = someSetWithComparable.toArray();
        System.out.println("Please enter an integer value between 0 and " + someSetWithComparable.size());
        Scanner console = new Scanner(System.in);
        int number = console.nextInt();

        System.out.println(array[number]);
    }

    public static void printSet(Set<Commodity> set) {
        for (Commodity c : set) {
            System.out.println(c);
        }
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
        someSetWithComparable.add(new Commodity("Alcohol", 25, 5, 3));
        someSetWithComparable.add(new Commodity("Chocolate", 20, 12, 1));
        someSetWithComparable.add(new Commodity("Table", 120, 90, 23));
        someSetWithComparable.add(new Commodity("Shampoo", 25, 7, 2));
        someSetWithComparable.add(new Commodity("Cheese", 30, 30, 10));
        someSetWithComparable.add(new Commodity("Trousers", 130, 40, 1));
    }
}
