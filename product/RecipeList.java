package product;

import java.util.HashMap;
import java.util.Map;

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
        for (Map.Entry<Recipe, Integer> entry: recipes.entrySet()) {
            stringBuilder.append(entry.getKey().getName()).append(" --> ");
            stringBuilder.append(entry.getValue().intValue()).append("\n");
        }
        return stringBuilder.toString();
    }
}

