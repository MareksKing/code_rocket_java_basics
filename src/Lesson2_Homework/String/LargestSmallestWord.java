package Lesson2_Homework.String;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

public class LargestSmallestWord {
    public static void main(String[] args) {

        String sizeCheck = new String("This is an umbrella");
        String[] words = sizeCheck.split("\\s+");
        HashMap<String, Integer> listing = new HashMap<String, Integer>();

        for (String string : words) {
            listing.put(string, string.length());
        }
        listing.entrySet().stream().
        sorted(Map.Entry.comparingByValue(Comparator.reverseOrder())).
        forEach(System.out::println);

    }
}
