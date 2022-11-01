package product;

import multiply.MultiplicationTable;
import multiply.Task;

import java.util.*;

import static product.RecipeList.recipes;

public class Main {
    public static void main(String[] args) {
        Product coffee = new Product("Кофе",150,1);
        Product sugar = new Product("Сахар",150,1);
        Product bread = new Product("Хлеб",70,1);
        Product tea = new Product("Чай",200,1);
        Product cookie = new Product("Печенье",100,1);

        ProductList productList = new ProductList();
        productList.addProduct(coffee);
        productList.addProduct(sugar);
        productList.addProduct(bread);
        System.out.println(productList);


        numberSetRemoveEven();

        MultiplicationTable multiplicationTable = new MultiplicationTable();
        System.out.println(multiplicationTable);
        Task task = new Task(3,4);
        Task task1 = new Task(3,4);
        Task task2 = new Task(4,3);
        Set<Task> tasks = new HashSet<>();
        tasks.add(task);
        tasks.add(task1);
        tasks.add(task2);
        System.out.println(tasks);
    }



    private static void numberSetRemoveEven() {
        Set<Integer> numbers = new HashSet<>(20);
        Random random = new Random();
        while (numbers.size() < 20){
            numbers.add(random.nextInt(1000));
        }
        System.out.println(numbers);
        // numbers.removeIf(next -> next %2 != 0);
        Iterator<Integer> iterator = numbers.iterator();
        while (iterator.hasNext()) {
            Integer next = iterator.next();
            if (next % 2 != 0) {
                iterator.remove();
            }
        }
        System.out.println(numbers);
    }
}
