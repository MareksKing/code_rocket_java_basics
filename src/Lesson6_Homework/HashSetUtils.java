package Lesson6_Homework;

import java.util.*;

public class HashSetUtils {

    public void addElementAtEnd(HashSet hashSet, int number){
        hashSet.add(number);
    }

    public void iterateHashSet(HashSet hashSet){

        Iterator p = hashSet.iterator();
        // print list from second position
        while (p.hasNext()) {
            System.out.println(p.next());
        }
    }

    public int getNumberOfElements(HashSet hashSet){
        return hashSet.size();
    }

    public void emptyHashSet(HashSet hashSet){
        hashSet.removeAll(hashSet);
    }

    public boolean isHashSetEmpty(HashSet hashSet){
        return hashSet.isEmpty();
    }

    public HashSet cloneHashSet(HashSet hashSet){
        return (HashSet) hashSet.clone();
    }

    public Object[] convertToArray(HashSet hashSet){
        return hashSet.toArray();
    }

    public TreeSet convertToTreeSet(HashSet hashSet){
        return new TreeSet<>(hashSet);
    }

    public List convertToList(HashSet hashSet){
        return Arrays.asList(hashSet);
    }

    public boolean compareHashSets(HashSet hashSet1, HashSet hashSet2){
        return hashSet1.containsAll(hashSet2);
    }

    public boolean retainAllElements(HashSet hashSet1, HashSet hashSet2) {
        return hashSet1.retainAll(hashSet2);
    }

    public void removeAllElements(HashSet hashSet){
        hashSet.removeAll(hashSet);
    }

}
