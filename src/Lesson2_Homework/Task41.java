package Lesson2_Homework;

import java.util.ArrayList;

public class Task41 {

    public static void main(String[] args) {

        int firstPrimeNumber = 0;
        int secondPrimeNumber = 0;

        ArrayList<Integer> allPrimes=new ArrayList<>();
        for(int number=1; number<=100; number++){
            int c = 0;
            for (int i = 1; i <= number; i++)
                if (number % i == 0)
                    c++;
            if (c == 2)
                allPrimes.add(number);
            else
                continue;
        }

        for (int i = 0; i < allPrimes.size()-1; i++) {
            if(allPrimes.get(i) - allPrimes.get(i+1) == -2){
                System.out.println("(" + allPrimes.get(i) + ", " + allPrimes.get(i+1) + ")");
            }
        }


    }
}
