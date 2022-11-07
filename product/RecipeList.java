package product;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class RecipeList {
    private final HashMap<Recipe,Integer> recipes = new HashMap<>();


    public void addRecipe (Recipe recipe) {
        recipes.put(recipe,recipe.getSum());
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Список рецептов").append('\n');
        for (Map.Entry<Recipe, Integer> entry: recipes.entrySet()) {
            stringBuilder.append(entry.getKey().getName()).append(" --> продуктов в рецепте: ");
            stringBuilder.append(entry.getKey().getAmount()).append(" шт. Цена товаров: ");
            stringBuilder.append(entry.getValue().intValue()).append(" рублей ").append("\n");
        }
        return stringBuilder.toString();
    }
}

