package Lesson6_Homework;

import java.util.*;

public class PriorityQueueUtils {

    public PriorityQueue createPriorityQueue(){
        PriorityQueue<String> colors = new PriorityQueue<>();

        colors.add("Red");
        colors.add("Orange");
        colors.add("Yellow");
        colors.add("Green");
        colors.add("Light blue");
        colors.add("Blue");
        colors.add("Violet");
        System.out.println(colors);
        return colors;

    }

    public void iterateQueue(PriorityQueue priorityQueue){
        Iterator p = priorityQueue.iterator();

        while(p.hasNext()){
            System.out.println(p.next());
        }
    }

    public void mergePriorityQueues(PriorityQueue priorityQueue1, PriorityQueue priorityQueue2){
        priorityQueue1.addAll(priorityQueue2);
    }

    public void insertElement(PriorityQueue priorityQueue, String element){
        priorityQueue.add(element);
    }

    public void clearQueue(PriorityQueue priorityQueue){
        priorityQueue.removeAll(priorityQueue);
    }

    public int queueSize(PriorityQueue priorityQueue){
        return priorityQueue.size();
    }

    public boolean compareQueues(PriorityQueue priorityQueue, PriorityQueue priorityQueue2){
        return priorityQueue.containsAll(priorityQueue2);
    }

    public String getFirstElement(PriorityQueue priorityQueue){
        return priorityQueue.peek().toString();
    }

    public String popFirstElement(PriorityQueue priorityQueue){

        String element = priorityQueue.peek().toString();
        priorityQueue.remove(priorityQueue.peek());
        return element;
    }

    public List<PriorityQueue> convertToArray(PriorityQueue priorityQueue){
        return Arrays.asList(priorityQueue);
    }

    public void maximumPriorityQueue(PriorityQueue priorityQueue){
        Iterator p = priorityQueue.iterator();
        String val = "";
        while(p.hasNext()) {
            val = priorityQueue.poll().toString();
            System.out.print(val+"  ");
        }
        System.out.print("\n");
    }


}
