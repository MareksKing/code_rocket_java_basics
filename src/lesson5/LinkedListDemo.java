package lesson5;

import java.util.LinkedList;

public class LinkedListDemo {

    public static void main(String[] args) {
        LinkedList<String> strings = new LinkedList<>();
        strings.add("A");
        strings.add("B");
        strings.add("C");
        strings.add("D");
        String a = strings.get(0);

        System.out.println(a);

        System.out.println(strings);
    }
}
