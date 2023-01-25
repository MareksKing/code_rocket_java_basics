package lesson5;

import java.util.LinkedList;

public class LinkListBenchmarkAddToStart {

    public static void main(String[] args) {
        LinkedList<Integer> integers = new LinkedList<>();
        long start = System.currentTimeMillis();
        for (int i = 0; i < 10_000_000; i++) {
            integers.add(0, i);
        }

        long finish = System.currentTimeMillis();
        long result = finish - start;

        System.out.println("Result: " + result + " ms");
        System.out.println("Size: " + integers.size());
    }
}
