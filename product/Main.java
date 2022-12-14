package product;

import java.util.*;


public class Main {
    public static void main(String[] args) {
        Product coffee = new Product("Кофе",150,1);
        Product sugar = new Product("Сахар",10,1);
        Product sugar1 = new Product("Сахар",10,1);
        Product bread = new Product("Хлеб",70,1);
        Product tea = new Product("Чай",100,1);
        Product cookie = new Product("Печенье",100,1);

        ProductList productList = new ProductList();
        productList.addProduct(coffee);
        productList.addProduct(tea);
        productList.addProduct(bread);
        productList.addProduct(sugar);
        productList.addProduct(sugar1);
        System.out.println(productList);

        Recipe recipe1 = new Recipe("Кофе c сахаром", 2, Set.of(sugar, coffee));
        Recipe recipe2 = new Recipe("Чай с печеньем", 2, Set.of(tea,cookie));
        Recipe recipe3 = new Recipe("Чай с печеньем", 2, Set.of(tea,cookie));

        RecipeList recipeList = new RecipeList();
        recipeList.addRecipe(recipe1);
        recipeList.addRecipe(recipe2);
        recipeList.addRecipe(recipe3);
        System.out.println(recipeList);

    }

}
