package product;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Random;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Product coffee = new Product("Кофе",150,0.25D);
        Product sugar = new Product("Сахар",150,1D);
        Product bread = new Product("Хлеб",70,0.7D);
        Product tea = new Product("Чай",200,0.5D);
        Product cookie = new Product("Печенье",100,0.5D);

        ProductList productList = new ProductList();
        productList.addProduct(coffee);
        productList.addProduct(sugar);
        productList.addProduct(bread);
        System.out.println(productList);

        Product coffee2 = new Product("Кофе",100,0.3D);
        productList.addProduct(coffee2);
    }
}
