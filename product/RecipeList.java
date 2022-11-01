package product;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class RecipeList {
    public static final HashMap<Recipe, Integer> recipes = new HashMap<>();

    public final HashMap<Recipe, Integer> getRecipes() {
        return recipes;
    }

    public void addRecipe(Recipe recipe, Integer integer) {
        recipes.put(recipe, recipe.getRecipePrise());
    }

    private static void printRecipe() {
        Set<Map.Entry<Recipe, Integer>> set = recipes.entrySet();
        for (Map.Entry<Recipe, Integer> recipe : set) {
            System.out.println(recipe.getKey() + ": ");
            System.out.println(recipe.getValue());
        }
        System.out.println();
    }
}

