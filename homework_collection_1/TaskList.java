package homework_collection_1;

import java.util.*;

public class TaskList {
    private final HashMap<String, Integer> stringIntegerHashMap = new HashMap<>();
    public void getNameAndNumber(String name, Integer number) {
        if (name == null || name.isEmpty() || number < 0) {
            throw new IllegalArgumentException("Заполните данные полностью");
        }
        Iterator<Map.Entry<String, Integer>> iterator = stringIntegerHashMap.entrySet().iterator();
        while(iterator.hasNext()){
            Map.Entry<String, Integer> check = iterator.next();
            String key = check.getKey();
            Integer value = check.getValue();
            if(key.equals(name) && value.equals(number)) {
                throw new IllegalArgumentException("Данные повторяются");
            }else {
                this.stringIntegerHashMap.put(name,number);
            }
        }
        this.stringIntegerHashMap.put(name, number);
    }
    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Список данных").append('\n');
        for (Map.Entry<String, Integer> entry : stringIntegerHashMap.entrySet()) {
            stringBuilder.append(entry.getKey().toString()).append(" --> ");
            stringBuilder.append(entry.getValue().intValue());
            stringBuilder.append('\n');
        }
        return stringBuilder.toString();
    }

}

