package product;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class RecipeList {
    private final HashSet<Recipe> recipes = new HashSet<>();

    public final HashSet<Recipe> getRecipes() {
        return recipes;
    }

    public void addRecipe (Recipe recipe) {
        if (recipes.equals(recipe)) {
            throw new IllegalArgumentException("Такой рецепт уже существует");
        }else {
            recipes.add(recipe);
        }
    }
    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Список рецептов").append('\n');
        for (Recipe recipe : recipes) {
            stringBuilder.append(recipes).append('\n');
        }
        return stringBuilder.toString();
    }

}

