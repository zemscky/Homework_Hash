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

    public void addRecipe (Recipe recipe, Integer integer) {
        if (recipes.equals(recipe)) {
            throw new IllegalArgumentException("Такой рецепт уже существует");
        }else {
            recipes.put(recipe,recipe.getSum());
        }
        recipes.put(recipe,recipe.getSum());
    }
    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Список рецептов").append('\n');
        for (Map.Entry<Recipe, Integer> entry : recipes.entrySet()) {
            stringBuilder.append(entry.getKey().getName().toString());
            stringBuilder.append(entry.getValue().intValue());
        }
         return stringBuilder.toString();
    }

}

