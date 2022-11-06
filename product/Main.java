package product;

import multiply.MultiplicationTable;
import multiply.Task;

import java.util.*;


public class Main {
    public static void main(String[] args) {
        Product coffee = new Product("Кофе",150,2);
        Product sugar = new Product("Сахар",150,1);
        Product bread = new Product("Хлеб",70,3);
        Product tea = new Product("Чай",200,1);
        Product cookie = new Product("Печенье",100,1);

        ProductList productList = new ProductList();
        productList.addProduct(coffee);
        productList.addProduct(tea);
        productList.addProduct(bread);
        productList.addProduct(sugar);
        System.out.println(productList);

        Recipe recipe1 = new Recipe("Кофе c сахаром",Set.of(coffee,sugar),);
        Recipe recipe2 = new Recipe("Чай с печеньем",Set.of(tea,cookie));

        RecipeList recipeList = new RecipeList();
        recipeList.addRecipe(recipe1);
        recipeList.addRecipe(recipe2);
        System.out.println(recipeList);

    }

}
