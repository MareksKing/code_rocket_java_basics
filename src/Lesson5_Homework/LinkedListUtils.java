package Lesson5_Homework;

import java.util.*;

public class LinkedListUtils {

    public void addElement(LinkedList list, String element){
        list.add(element);
    }

    public void iterateList(LinkedList list){
        Iterator p = list.listIterator(0);

        // print list from second position
        while (p.hasNext()) {
            System.out.println(p.next());
        }
    }

    public void startIterateAtIndex(LinkedList list, int index){
        for (int i = index; i < list.size(); i++) {
            System.out.println(i +": " + list.get(i));
        }
    }

    public void reverseOrderIterate(LinkedList list){
        for (int i = list.size(); i >= 1 ; --i) {
            System.out.println(i +": " + list.get(i-1));
        }
    }

    public void insertElementAtIndex(LinkedList list, int index, String car){
        list.add(index, car);
    }

    public void insertAtFirstPosition(LinkedList list, String car){
        list.add(0, car);
    }

    public void insertAtLastPosition(LinkedList list, String car){
        list.add(list.size(), car);
    }

    public void insertElementsAtIndex(LinkedList list, LinkedList insertedList, int index){
        list.addAll(index, insertedList);
    }

    public String getFirstElement(LinkedList list){
        return list.get(0).toString();
    }
    public String getLastElement(LinkedList list){
        return list.get(list.size()-1).toString();
    }

    public void printList(LinkedList list){
        for (int i = 0; i < list.size(); i++) {
            System.out.println(i +": " + list.get(i));
        }
    }

    public void removeElementAtIndex(LinkedList list, int index){
        list.remove(index);
    }

    public void removeBothEnds(LinkedList list){
        list.remove(0);
        list.remove(list.size()-1);
    }

    public void removeAllElements(LinkedList list){
        list.removeAll(list);
    }

    public void swapElements(LinkedList list, int index, int index2){
        Collections.swap(list, index2, index);
    }

    public void shuffleElements(LinkedList list){
        Collections.shuffle(list);
    }

    public void joinLists(LinkedList list1, LinkedList list2){
        list1.addAll(list2);
    }

    public LinkedList cloneLists(LinkedList list){
        return (LinkedList) list.clone();
    }

    public String removeFirst(LinkedList list){
        String element = list.get(0).toString();
        list.remove(0);
        return element;
    }

    public String retrieveFirst(LinkedList list){
        return list.get(0).toString();
    }

    public String retrieveLast(LinkedList list){
        return list.get(list.size()-1).toString();
    }

    public boolean doesExist(LinkedList list, String car){
        return list.contains(car);
    }

    public ArrayList convertToArrayList(LinkedList list){
        ArrayList<String> arrayList = new ArrayList<String>(list);
        return arrayList;
    }

    public boolean compareLists(LinkedList list1, LinkedList list2){
        if(list1.isEmpty() || list2.isEmpty()){return false;}
        return list1.containsAll(list2);
    }

    public boolean isListEmpty(LinkedList list){
        return list.isEmpty();
    }

    public void replaceElement(LinkedList list, String elementToReplace, String replacement){
        if(!list.contains(elementToReplace)){return;}
        if(elementToReplace.equals(replacement)){return;}

        for (int i = 0; i < list.size(); i++) {
            if(list.get(i).toString().equals(elementToReplace)){
                list.set(i, replacement);
            }
        }
    }
}

