package homework_collection_1;


import product.Product;

public class Main {

    public static void main(String[] args) {

        TaskList taskList = new TaskList();
        taskList.getNameAndNumber("Str1", 2);
        taskList.getNameAndNumber("Str1", 1);

        System.out.println(taskList);
    }

}
