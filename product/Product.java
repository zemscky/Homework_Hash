package product;


import java.util.Map;
import java.util.Objects;
import java.util.Set;

import static product.RecipeList.recipes;


public class Product {

    private final String name;
    private final int price;
    private final int amount;
    private boolean checked;


    public Product(String name, int price, int amount) {
        if (name == null || name.isBlank() || price < 0 || amount < 0) {
            throw new IllegalArgumentException("Заполните карточку товара полностью");
        }
        this.name = name; // название продукта
        this.price = price; // цена продукта
        this.amount = amount; // количество продукта
        this.checked = false;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return price == product.price && amount == product.amount && Objects.equals(name, product.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, price, amount);
    }

    @Override
    public String toString() {
        String checkedString = this.isChecked() ? "Да" : "Нет";
        return String.format("%s, Цена: %s, Количество: %s кг, Куплено: %s", this.name,getPrice()
        ,getAmount(),checkedString);
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public int getAmount() {
        return amount;
    }

    public boolean isChecked() {
        return checked;
    }

    public void setChecked() {
        this.checked = true;
    }
}
