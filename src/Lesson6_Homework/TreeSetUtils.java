package Lesson6_Homework;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetUtils {

    public TreeSet createTreeSet(){
        TreeSet<String> colors = new TreeSet<>();
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

    public void iterateTree(TreeSet treeSet){
        Iterator p = treeSet.iterator();

        while(p.hasNext()){
            System.out.println(p.next());
        }
    }

    public void mergeTreeSets(TreeSet treeSet1, TreeSet treeSet2){
        treeSet1.addAll(treeSet2);
    }

    public void reverseOrderIterate(TreeSet treeSet){
        Iterator p =treeSet.descendingIterator();

        while (p.hasNext()){
            System.out.println(p.next());
        }
    }
    public String getFirstElement(TreeSet treeSet){
        return treeSet.first().toString();
    }

    public String getLastElement(TreeSet treeSet){
        return treeSet.last().toString();
    }

    public TreeSet cloneTree(TreeSet treeSet){
        return (TreeSet) treeSet.clone();
    }

    public int treeSize(TreeSet treeSet){
        return treeSet.size();
    }

    public boolean compareTrees(TreeSet treeSet, TreeSet treeSet2){
        return treeSet.containsAll(treeSet2);
    }

    public void findNumberSmallerThan7(TreeSet treeSet){
        Iterator p = treeSet.iterator();

        while(p.hasNext()){
            if(Integer.parseInt(p.next().toString()) < 7){
                System.out.println(p.next());
            }
        }
    }
    public void findNumbersGreaterOrEqualToNumber(TreeSet treeSet, int number){
        Iterator p = treeSet.iterator();

        while(p.hasNext()){
            if(Integer.parseInt(p.next().toString()) >= number){
                System.out.println(p.next());
            }
        }
    }

    public void findNumbersLessOrEqualToNumber(TreeSet treeSet, int number){
        Iterator p = treeSet.iterator();

        while(p.hasNext()){
            if(Integer.parseInt(p.next().toString()) <= number){
                System.out.println(p.next());
            }
        }
    }

    public void findNumberStrictlyGreaterOrEqualToNumber(TreeSet treeSet, int number){
        Iterator p = treeSet.iterator();

        while(p.hasNext()){
            if(Integer.parseInt(p.next().toString()) >= number){
                System.out.println(p.next());
                break;
            }
        }
    }

    public void findNumberStrictlyLessOrEqualToNumber(TreeSet treeSet, int number){
        Iterator p = treeSet.iterator();

        while(p.hasNext()){
            if(Integer.parseInt(p.next().toString()) <= number){
                System.out.println(p.next());
                break;
            }
        }
    }

    public String popFirstElement(TreeSet treeSet){

        String element = treeSet.first().toString();
        treeSet.remove(treeSet.first());
        return element;
    }

    public String popLastElement(TreeSet treeSet){

        String element = treeSet.last().toString();
        treeSet.remove(treeSet.last());
        return element;
    }

    public void removeElement(TreeSet treeSet, String element){
        if(element.equals(null)){return;}
        if(!treeSet.contains(element)){return;}

        treeSet.remove(element);
    }

}
