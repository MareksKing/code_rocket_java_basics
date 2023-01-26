package lesson6;

import java.util.HashMap;

public class HashMapDemo {

    public static void main(String[] args) {
        HashMap<String, Integer> stringIntegerHashMap = new HashMap<>();
        stringIntegerHashMap.put("A", 2);
        stringIntegerHashMap.put("B", 3);
        stringIntegerHashMap.put("C", 4);

        System.out.println(stringIntegerHashMap);

        Integer result = stringIntegerHashMap.get("C");

        System.out.println(result);

    }
}
