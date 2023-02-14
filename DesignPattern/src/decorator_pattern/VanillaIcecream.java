package decorator_pattern;

public class VanillaIcecream implements Icecream {
    public String getName() {
        return "Vanilla Icecream";
    }

    public String howSweet() {
        return "Vanilla Sweet";
    }
}
