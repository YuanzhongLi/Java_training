package decorator_pattern;

public class Main {
    public static void main(String args[]) {
        VanillaIcecream vanillaIcecream = new VanillaIcecream();
        CashewNutsToppingIcecream cashewNutsToppingIcecream = new CashewNutsToppingIcecream(vanillaIcecream);
        System.out.println(cashewNutsToppingIcecream.getName());
        System.out.println(cashewNutsToppingIcecream.howSweet());
    }
}
