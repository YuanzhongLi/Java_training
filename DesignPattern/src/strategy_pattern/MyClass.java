package strategy_pattern;

public class MyClass {
    private Comparator comparator;
    public MyClass(Comparator comparator) {
        this.comparator = comparator;
    }

    public int compare(Human h1, Human h2) {
        return comparator.compare(h1, h2);
    }
}
