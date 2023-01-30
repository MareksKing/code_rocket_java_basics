package Lesson6_Homework;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapDemo {
    public static void main(String[] args) {
        //Task1
        HashMap<String, Integer> cars = new HashMap<>();
        cars.put("Audi", 1);
        cars.put("Golf", 1);
        cars.put("BMW", 4);
        cars.put("Mercedes", 3);
        cars.put("Bugatti", 3);

        for(Map.Entry<String, Integer> car: cars.entrySet()){
            System.out.println("I got " + car.getValue() + " " + car.getKey());
        }

        //Task2
        System.out.println("Size of cars hashmap is: " + cars.size());

        //Task3
        HashMap<String, Integer> newCars = new HashMap<>();
        newCars.putAll(cars);
        System.out.println(newCars);

        //Task4
        newCars.clear();
        System.out.println(newCars);

        //Task5
        System.out.println("The newCars hashmap is " + ((newCars.isEmpty()) ? "empty" : "not empty"));

        //Task6
        HashMap<String, Integer> shallowCars = (HashMap<String, Integer>) cars.clone();
        System.out.println(shallowCars);

        //Task7
        System.out.println("The shallowCars hashmap " +(shallowCars.containsKey("Audi") ? "does " : "doesn't ") + "contain the specified key");

        //Task8
        System.out.println("The shallowCars hashmap " +(shallowCars.containsValue(3) ? "does " : "doesn't ") + "contain the specified car amount");

        //Task9
        Set set = cars.entrySet();
        System.out.println("Set: " + set);

        //Task10
        System.out.println(cars.get("BMW"));

        //Task11
        Set set2 = cars.keySet();
        System.out.println("Key set: "+ set2);

        //Task12
        System.out.println(cars.values());
    }

}
