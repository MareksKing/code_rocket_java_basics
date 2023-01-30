package Lesson6_Homework;


import java.util.Comparator;
import java.util.Map;
import java.util.SortedMap;
import java.util.TreeMap;

public class TreeMapDemo {
    public static void main(String[] args) {

        //Task1
        TreeMap<String, Integer> cars = new TreeMap<>();
        cars.put("Audi", 1);
        cars.put("Golf", 1);
        cars.put("BMW", 4);
        cars.put("Mercedes", 3);
        cars.put("Bugatti", 3);

        System.out.println(cars);

        //Task2
        TreeMap<String, Integer> newCars = new TreeMap<>();
        newCars.putAll(cars);
        System.out.println(newCars);

        //Task3
        System.out.println("The treemap " + (cars.containsKey("Golf") ? "does " : "doesn't ") + "contain the key: Golf");

        //Task4
        System.out.println("The treemap " + (cars.containsValue(2) ? "does " : "doesn't ") + "contain the key: 2");

        //Task5
        for(Map.Entry<String, Integer> car: cars.entrySet()){
            System.out.println(car.getValue() + " " + car.getKey());
        }

        //Task6
        newCars.clear();
        System.out.println(newCars);

        //Task7
        TreeMap<String, Integer> cars2 = new TreeMap<String, Integer>(new sort_key());
        cars2.put("Renault", 1);
        cars2.put("Fiat", 4);
        cars2.put("Lamborghini", 2);
        cars2.put("Audi", 6);
        System.out.println(cars2);

        //Task8, 9
        System.out.println("Greatest: " + cars.firstKey());
        System.out.println("Least: " + cars.lastKey());

        //Task10
        System.out.println(cars.descendingKeySet());

        //Task11
        System.out.println(cars.floorEntry("Audi"));

        //Task12
        System.out.println(cars.floorKey("BMW"));

        //Task13
        System.out.println(cars.headMap("Bugatti"));

        //Task14
        System.out.println(cars.headMap("Bugatti", true));

        //Task15
        System.out.println(cars.higherEntry("Mercedes"));

        //Task16
        System.out.println(cars.lowerKey("Mercedes"));

        //Task18
        System.out.println(cars.navigableKeySet());

        //Task19
//        System.out.println(cars.pollFirstEntry());
//        System.out.println(cars);
//
//        //Task20
//        System.out.println(cars.pollLastEntry());
//        System.out.println(cars);

        //Task21
        System.out.println(cars.subMap("Audi", "Golf"));

        //Task22
        System.out.println(cars.subMap("Audi", true, "Golf", true));

        //Task23
        System.out.println(cars.tailMap("Bugatti", true));

        //Task24
        System.out.println(cars.tailMap("Bugatti", false));

        //Task25
        System.out.println(cars.ceilingKey("Bugatti"));



    }

}
class sort_key implements Comparator<String> {
    @Override
    public int compare(String str1, String str2) {
        return str1.compareTo(str2);
    }
}
