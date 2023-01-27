package Lesson6_Homework;

import java.util.List;
import java.util.PriorityQueue;


public class PriorityQueueDemo {
    public static void main(String[] args) {
        PriorityQueueUtils priorityQueueUtils = new PriorityQueueUtils();

        PriorityQueue<String> colors = priorityQueueUtils.createPriorityQueue();
        PriorityQueue<String> colors2 = new PriorityQueue<>();
        colors2.add("Pink");
        colors2.add("Beige");
        colors2.add("Cyan");
        colors2.add("Purple");
        colors2.add("Magenta");

        //Task2
//        priorityQueueUtils.iterateQueue(colors);

        //Task3
//        priorityQueueUtils.mergePriorityQueues(colors, colors2);

        //Task4
//        priorityQueueUtils.insertElement(colors, "Black");
//        System.out.println(colors);

        //Task5
//        priorityQueueUtils.clearQueue(colors2);
//        System.out.println(colors2);

        //Task6
//        int size = priorityQueueUtils.queueSize(colors);
//        System.out.println(size);

        //Task7
//        System.out.println(priorityQueueUtils.compareQueues(colors, colors2));

        //Task8
//        System.out.println(priorityQueueUtils.getFirstElement(colors));

        //Task9
//        System.out.println(priorityQueueUtils.popFirstElement(colors));
//        System.out.println(colors);

        //Task10
//        List<PriorityQueue> converted = priorityQueueUtils.convertToArray(colors);
//        System.out.println(converted);

        //Task11
//        System.out.println(colors.toString());

        //Task12
//        priorityQueueUtils.maximumPriorityQueue(colors);
//        System.out.println(colors);


    }
}
