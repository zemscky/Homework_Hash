package homework_collection_1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {

        HashMap<String, Integer> stringIntegerHashMap = new HashMap<>();

        stringIntegerHashMap.put("str1", 2);
        stringIntegerHashMap.put("str2", 1);
        stringIntegerHashMap.put("str3", 3);
        stringIntegerHashMap.put("str4", 4);

        if(stringIntegerHashMap.containsKey("str1")) {
            stringIntegerHashMap.get("str1");
        }
        if(stringIntegerHashMap.containsKey("str1") && stringIntegerHashMap.containsValue(1)) {
           throw new IllegalArgumentException("Данные повторяются");
        }else  {
           stringIntegerHashMap.get("str1");
        }

        System.out.println(stringIntegerHashMap);

    }

}
