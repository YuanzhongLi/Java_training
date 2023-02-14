package abstract_factory_pattern;

import java.util.ArrayList;
import java.util.List;

public class MizutakiFactory extends Factory {
    public Soup getSoup() {
        return new ChikenBonesSoup();
    }

    public Protein getMain() {
        return new Chicken();
    }

    public List<Vegetable> getVegetables() {
        List<Vegetable> vegetables = new ArrayList<Vegetable>();
        return vegetables;
    }

    public List<Ingredients> getOtherIngredients() {
        List<Ingredients> otherIngredients = new ArrayList<Ingredients>();
        return otherIngredients;
    }
}
