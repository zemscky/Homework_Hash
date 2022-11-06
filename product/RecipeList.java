package product;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class RecipeList {
    private final HashMap<Recipe,Integer> recipes = new HashMap<>();

    public final HashMap<Recipe,Integer> getRecipes() {
        return recipes;
    }

    public void addRecipe (Recipe recipe) {
        recipes.put(recipe,recipe.getSum());
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Список рецептов").append('\n');
        for (Recipe recipe: recipes.keySet()) {
            stringBuilder.append(recipe).append('\n');
        }
        return stringBuilder.toString();
    }
}

