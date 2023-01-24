package Lesson5_Homework;

import java.util.ArrayList;
import java.util.LinkedList;

public class LinkedListDemo {
    public static void main(String[] args) {
        LinkedListUtils listUtils = new LinkedListUtils();
        LinkedList<String> cars = new LinkedList<>();
        cars.add("Volvo");
        cars.add("Volkswagen");
        cars.add("Audi");
        cars.add("Renault");
        cars.add("BMW");
        cars.add("Toyota");
        cars.add("Subaru");
        cars.add("Mitsubishi");

        //Task1
//        listUtils.addElement(cars, "Peugeot");
//        System.out.println(cars);

        //Task2
//        listUtils.iterateList(cars);

        //Task3
//        listUtils.startIterateAtIndex(cars,3);

        //Task4
//        listUtils.reverseOrderIterate(cars);

        //Task5
//        listUtils.insertElementAtIndex(cars,5, "Peugeot");
//        listUtils.iterateList(cars);

        //Task6,7,8
//        listUtils.insertAtFirstPosition(cars, "Peugeot");
//        listUtils.insertAtLastPosition(cars, "Fiat");
//        listUtils.iterateList(cars);

        //Task9
//        LinkedList<String> cars2 = new LinkedList<>();
//        cars2.add("Peugeot");
//        cars2.add("Fiat");
//        listUtils.insertElementsAtIndex(cars, cars2, 2);
//        listUtils.iterateList(cars);

        //Task10
//        System.out.println(listUtils.getFirstElement(cars));
//        System.out.println(listUtils.getLastElement(cars));

        //Task11
//        listUtils.printList(cars);

        //Task12
//        listUtils.removeElementAtIndex(cars,3);
//        listUtils.printList(cars);

        //Task13
//        listUtils.removeBothEnds(cars);
//        listUtils.printList(cars);

        //Task14
//        listUtils.removeAllElements(cars);
//        listUtils.printList(cars);

        //Task15
//        listUtils.swapElements(cars, 2, 6);
//        listUtils.printList(cars);

        //Task16
//        listUtils.shuffleElements(cars);
//        listUtils.printList(cars);

        //Task17
//        LinkedList<String> cars2 = new LinkedList<>();
//        cars2.add("Peugeot");
//        cars2.add("Fiat");
//        listUtils.joinLists(cars, cars2);
//        listUtils.printList(cars);

        //Task18
//        LinkedList<String> cars2 = new LinkedList<>();
//        cars2 = listUtils.cloneLists(cars);
//        listUtils.printList(cars2);

        //Task19
//        System.out.println("Removed: " + listUtils.removeFirst(cars));
//        listUtils.printList(cars);

        //Task20
//        System.out.println(listUtils.retrieveFirst(cars));

        //Task21
//        System.out.println(listUtils.retrieveLast(cars));

        //Task22
//        System.out.println(listUtils.doesExist(cars, "Audi"));

        //Task23
//        ArrayList<String> newList = new ArrayList<>();
//        System.out.println(cars.getClass());
//        System.out.println(cars);
//        newList = listUtils.convertToArrayList(cars);
//        System.out.println(newList.getClass());
//        System.out.println(newList);

        //Task24
//        System.out.println(listUtils.compareLists(cars, cars2));

        //Task25
//        System.out.println(listUtils.isListEmpty(cars));

        //Task26
//        listUtils.replaceElement(cars, "Audi", "Miskaste");
//        listUtils.printList(cars);
    }

}
