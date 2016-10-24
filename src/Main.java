import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {


    /*
    * ABSTRACT FACTORY DESIGN PATTERN
    * -----------------------------
    *
    * - Interfaces for creating families of objects
    * - Good for dependency injection
    *
    * Type: Creational
    * Rating: 5/5
    * Purpose: Creating objects in different related
    * families without relying on concrete implementations
    *
    * AbstractFactory = Interface/Abstraction for
    *                   how the factory will function (RecipeFactory)
    * ConcreteFactory =
    * AbstractProduct = Abstraction for how a product will function (Sandwich, Dessert)
    * Products =
    *
    * Client = Uses factories and products
    * */

    public static void main(String[] args) {

        System.out.println("Are you a 'Child' or an 'Adult'?");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String answer = "";

        try {
            answer = reader.readLine();
        }catch (Exception ex){
            System.out.println("exception!");
            return;
        }

        RecipeFactory factory;

        switch (answer){
            case "Child":
                factory = new KidRecipeFactory();
                break;

            case "Adult":
                factory = new AdultRecipeFactory();
                break;

            default:
                System.out.println("NOPE!");
                return;
        }

        Sandwich sandy = factory.CreateSandwich();
        Dessert fat = factory.CreateDessert();

        System.out.println("Sandwich: " + sandy.getClass().getSimpleName());
        System.out.println("Dessert: " + fat.getClass().getSimpleName());

    }

}
