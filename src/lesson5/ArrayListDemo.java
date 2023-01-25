package lesson5;

import java.util.ArrayList;

public class ArrayListDemo {

    public static void main(String[] args) {
        ArrayList<String> strings = new ArrayList<>();
        strings.add("A");
        strings.add("B");
        strings.add("C");
        strings.add("D");
        String a = strings.get(0);

        System.out.println(a);

        System.out.println(strings);
    }
}
