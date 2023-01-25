package lesson5;

import java.util.ArrayList;

public class ArrayListBenchmarkAddToEnd {

    public static void main(String[] args) {
        ArrayList<Integer> integers = new ArrayList<>();
        long start = System.currentTimeMillis();
        for (int i = 0; i < 10_000_000; i++) {
            integers.add(i);
        }

        long finish = System.currentTimeMillis();
        long result = finish - start;

        System.out.println("Result: " + result + " ms");
        System.out.println("Size: " + integers.size());
    }
}
