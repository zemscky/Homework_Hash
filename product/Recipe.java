package product;

import java.util.Map;
import java.util.Objects;
import java.util.Set;


public class Recipe {
    private final String name;
    private Set<Product> products;

    public Recipe(String name, Set<Product> products) {
        if (name == null || name.isBlank()
                || products == null || products.size() == 0) {
            throw new IllegalArgumentException("Не заполнены все поля");
        }
        this.name = name;
        this.products = products;
    }

    public String getName() {
        return name;
    }

    public int getRecipe() {
        int sum = 0;
        for (Product product : products) {
            sum += product.getPrice();
        }
        return sum;
    }
    public int getRecipePrise() {
        int sum = 0;
        for (Product product : products) {
            sum = product.getAmount() * product.getPrice();
        }
        return sum;
    }

    public Set<Product> getProducts() {
        return products;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Recipe recipe = (Recipe) o;
        return Objects.equals(name, recipe.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

}
