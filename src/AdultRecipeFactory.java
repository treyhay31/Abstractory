/**
 * Created by Broski on 10/24/16.
 */
public class AdultRecipeFactory extends RecipeFactory {
    @Override
    public Sandwich CreateSandwich() {
        return new BLT();
    }

    @Override
    public Dessert CreateDessert() {
        return new CremeBrulee();
    }
}
