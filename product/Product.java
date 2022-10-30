package product;

import java.util.Objects;

public class Product {
    private final String name;
    private final int price;
    private final double amount;
    private boolean checked;


    public Product(String name, int price, Double amount) {
        if (name == null || name.isBlank() || price < 0 || amount < 0) {
            throw new IllegalArgumentException("Заполните карточку товара полностью");
        }
        this.name = name;
        this.price = price;
        this.amount = amount;
        this.checked = false;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return Objects.equals(name, product.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

    @Override
    public String toString() {
        String checkedString = this.isChecked() ? "Да" : "Нет";
        return String.format("%s, Цена: %s, Количество: %s, Куплено: %s", this.name,this.price
        ,this.amount,checkedString);
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public double getAmount() {
        return amount;
    }

    public boolean isChecked() {
        return checked;
    }

    public void setChecked() {
        this.checked = true;
    }
}
