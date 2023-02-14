package abstract_factory_pattern;

public class SampleClass {
    public static void main(String args[]) {
        HotPot hotPot = new HotPot(new Pot());
        Factory factory = new MizutakiFactory();
        hotPot.addSoup(factory.getSoup());
        hotPot.addMain(factory.getMain());
        hotPot.addVegetables(factory.getVegetables());
        hotPot.addOtherIngredients(factory.getOtherIngredients());

    }
}
