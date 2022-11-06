package product;

import java.util.*;


public class Recipe {
    private final String name;
    public static HashMap<Set<Product>,Integer> products = new HashMap<>();


    public Recipe(String name,  HashMap<Set<Product>,Integer> products) {
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
    public int getSum(Product product,Integer sum) {
        sum = sum + product.getPrice() * product.getAmount();
        for (Map.Entry<Set<Product>, Integer> entry : products.entrySet()) {
            products.put(Collections.singleton(product),sum);
        }
        return sum;
    }


    public HashMap<Set<Product>, Integer> getProducts() {
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
