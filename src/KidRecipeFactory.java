/**
 * Created by Broski on 10/24/16.
 */
public class KidRecipeFactory extends RecipeFactory {
    @Override
    public Sandwich CreateSandwich() {
        return new GrilledCheese();
    }

    @Override
    public Dessert CreateDessert() {
        return new IceCream();
    }
}
