package lesson6;

import java.util.HashSet;

public class HashSetDemo {

    public static void main(String[] args) {
        HashSet<String> strings = new HashSet<>();
        strings.add("A");
        strings.add("C");
        strings.add("A");
        strings.add("B");
        strings.add("A");
        strings.add("D");
        strings.add("A");
        strings.add("C");

        System.out.println(strings);
    }
}
