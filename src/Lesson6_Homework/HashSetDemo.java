package Lesson6_Homework;

import java.util.HashSet;

public class HashSetDemo {
    public static void main(String[] args) {
        HashSet<Integer> numbers = new HashSet<>();
        HashSetUtils hashSetUtils = new HashSetUtils();

        numbers.add(2);
        numbers.add(3);
        numbers.add(5);
        System.out.println(numbers);

        //Task1
//        hashSetUtils.addElementAtEnd(numbers, 14);
//        System.out.println(numbers);

        //Task2
//        hashSetUtils.iterateHashSet(numbers);

        //Task3
//        int size = hashSetUtils.getNumberOfElements(numbers);
//        System.out.println(size);

        //Task4
//        hashSetUtils.emptyHashSet(numbers);
//        System.out.println(numbers);

        //Task5
//        System.out.println(hashSetUtils.isHashSetEmpty(numbers));

        //Task6
//        HashSet<Integer> newHashSet = hashSetUtils.cloneHashSet(numbers);
//        System.out.println(newHashSet);

        //Task7
//        System.out.println(numbers.getClass());
//        Object convertedHashSet = hashSetUtils.convertToArray(numbers);
//        System.out.println(convertedHashSet.getClass());

        //Task8
//        System.out.println(hashSetUtils.convertToTreeSet(numbers).getClass());
//        System.out.println(hashSetUtils.convertToTreeSet(numbers));

        //Task9
//        System.out.println(hashSetUtils.convertToList(numbers).getClass());

        //Task10
//            HashSet numbers2 = new HashSet();
//            numbers2.add(2);
//            numbers2.add(3);
//            numbers2.add(5);
//            numbers2.add(7);
//        System.out.println(hashSetUtils.compareHashSets(numbers, numbers2));

        //Task11
//        hashSetUtils.retainAllElements(numbers2, numbers);
//        System.out.println(numbers2);

        //Task12
//        hashSetUtils.removeAllElements(numbers);
//        System.out.println(numbers);

    }
}
