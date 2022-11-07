package product;

import java.util.*;


public class Recipe {
    private final String name;
    private final int amount;
    public Set<Product> products = new HashSet<>();

    public Recipe(String name, int amount, Set<Product> products) {
        if (name == null || name.isBlank()
                || products == null || products.size() == 0) {
            throw new IllegalArgumentException("Не заполнены все поля");
        }
        this.name = name;
        this.amount = amount;
        this.products = products;
    }

    public String getName() {
        return name;
    }
    public int getAmount() {
        int amount = 0;
        for (Product product : products) {
            amount += product.getAmount();
        }
        return amount;
    }

    public int getSum() {
        int sum = 0;
        for (Product product : products) {
        sum += product.getPrice() * getAmount();
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
        return amount == recipe.amount && Objects.equals(name, recipe.name) && Objects.equals(products, recipe.products);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, amount, products);
    }

    @Override
    public String toString() {
        return String.format("%s, Количество: %s, Цена: %s рублей", this.name,getAmount()
                ,getSum());
    }
}
