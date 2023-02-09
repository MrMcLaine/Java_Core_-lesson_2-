package lesson21.first;

public class Purchase {
    @CustomAnnotation(priority = 1, nameOfManager = "Shevshenko")
    boolean quickly;
    @CustomAnnotation(priority = 2, nameOfManager = "Shevshenko")
    boolean cheap;
    @CustomAnnotation(priority = 3, nameOfManager = "Shevshenko")
    boolean qualitatively;

    int numberOfProducts;

    @Override
    public String toString() {
        return "Purchase{" +
                "quickly=" + quickly +
                ", cheap=" + cheap +
                ", qualitatively=" + qualitatively +
                ", numberOfProducts=" + numberOfProducts +
                '}';
    }
}
