package multiply;

import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
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
}
