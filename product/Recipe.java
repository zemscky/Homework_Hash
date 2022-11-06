package product;

import java.util.*;


public class Recipe {
    private final String name;
    public static final Set<Product> products = new HashSet<>();


    public Recipe(String name,  Set<Product> products) {
        if (name == null || name.isBlank()
                || products == null || products.size() == 0) {
            throw new IllegalArgumentException("Не заполнены все поля");
        }
        this.name = name;
    }

    public String getName() {
        return name;
    }
    public int getSum() {
        int sum = 0;
        for (Product product: products){
            sum = sum + product.getPrice() * product.getAmount();
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
