package homework_collection_2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        HashMap<String, List<Integer>> hashMap = new HashMap<>();
        HashMap<String, Integer> listHashMap = new HashMap<>();
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            list.get(i).add((int) (Math.random() * 1000));
            list.get(i).add((int) (Math.random() * 1000));
            list.get(i).add((int) (Math.random() * 1000));

            hashMap.put("str" + Integer.toString(i), list.get(i));
            System.out.println("str" + Integer.toString(i) + " --> " + list.get(i));
            listHashMap.put("str" + Integer.toString(i),
                    list.get(i).get(0) + list.get(i).get(1) + list.get(i).get(2));
        }
        for (int i = 0; i < 5; i++) {
            System.out.println("str" + Integer.toString(i) + " --> " + listHashMap.get("str" + Integer.toString(i)));
        }


        HashMap<Integer,String> integerStringHashMap = new HashMap<>();
        for (int i = 0; i <= 10; i++) {
            integerStringHashMap.put(i, "str" + Integer.toString(i));
        }

        for (int i = 0; i <= 10; i++) {
            System.out.println(" " + integerStringHashMap.get(i));
        }
    }
}
