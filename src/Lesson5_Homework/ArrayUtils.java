package Lesson5_Homework;

import java.util.*;

public class ArrayUtils {

    public void iterateArray(ArrayList arrayList){
        for (int i = 0; i < arrayList.size(); i++) {
            System.out.println(arrayList.get(i));
        }
    }

    public void insertAsFirstElement(ArrayList arrayList, String element){
        arrayList.add(0, element);
    }

    public String retriveItemAtIndex(ArrayList arrayList, int index){
        return arrayList.get(index).toString();
    }

    public void replaceElement(ArrayList arrayList, String elementToReplace, String replacement){
        if(!arrayList.contains(elementToReplace)){return;}
        if(elementToReplace.equals(replacement)){return;}

        for (int i = 0; i < arrayList.size(); i++) {
            if(arrayList.get(i).toString().equals(elementToReplace)){
                arrayList.set(i, replacement);
            }
        }
    }

    public void removeThirdElement(ArrayList arrayList){
        arrayList.remove(2);
    }

    public int searchElement(ArrayList arrayList, String element){
        if(!arrayList.contains(element)){return 0;}

        return arrayList.indexOf(element);
    }

    public void sortArray(ArrayList arrayList){
        arrayList.sort(Comparator.naturalOrder());
    }

    public void copyArray(ArrayList originalArray, ArrayList copiedArray){
        Collections.copy(originalArray, copiedArray);
    }

    public void shuffleArray(ArrayList arrayList){
        Collections.shuffle(arrayList);
    }

    public void reverseArray(ArrayList arrayList){
        Collections.reverse(arrayList);
    }

    public ArrayList extractPartOfArray(ArrayList arrayList, int start, int end){
        ArrayList<String> newArray = new ArrayList<>();
        int i = 0;
        while(start <= end) {
            newArray.add(i, arrayList.get(start).toString());
            i++;
            start++;
        }
        return newArray;
    }

    public boolean compareArrays(ArrayList arrayList1, ArrayList arrayList2){
        if(arrayList1.isEmpty() || arrayList2.isEmpty()){return false;}
        return arrayList1.containsAll(arrayList2);
    }

    public void swapElements(ArrayList arrayList, int index1, int index2){
        Collections.swap(arrayList, index1, index2);
    }

    public void joinArrays(ArrayList arrayList1, ArrayList arrayList2){
        arrayList1.addAll(arrayList2);
    }

    public ArrayList cloneArrays(ArrayList source){
        return (ArrayList) source.clone();
    }

    public void emptyList(ArrayList arrayList){
        arrayList.removeAll(arrayList);
    }

    public boolean isArrayListEmpty(ArrayList arrayList){
        return arrayList.isEmpty();
    }

    public void trimArrayList(ArrayList arrayList){
        arrayList.trimToSize();
    }

    public void increaseSizeOfList(ArrayList arrayList, int newCapacity){
        arrayList.ensureCapacity(newCapacity);
    }

    public void replaceSecondElement(ArrayList arrayList, String element){
        arrayList.set(1, element);
    }

    public String printArrayList(ArrayList arrayList){
        String output = "[ ";
        for (int i = 0; i < arrayList.size(); i++) {
            if(i == arrayList.size()-1){
                output += arrayList.get(i).toString();
            }else{
                output += arrayList.get(i).toString() + ", ";
            }
        }
        output += " ]";
        return output;
    }
}
