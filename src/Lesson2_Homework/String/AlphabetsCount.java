package Lesson2_Homework.String;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class AlphabetsCount {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Input the string of alphabets: ");
        String alphabetsText = input.nextLine();

        HashMap<Character, Integer> occurences = new HashMap<Character, Integer>( );

        for (char alpha: alphabetsText.toUpperCase().toCharArray()) {
            if(alpha >= 'A' && alpha <= 'Z'){
                if(occurences.containsKey(alpha)){
                    occurences.replace(alpha, occurences.get(alpha), occurences.get(alpha)+1);
                }else{
                    occurences.put(alpha, 1);
                }
            }

        }

        occurences.entrySet().stream().
        sorted(Map.Entry.comparingByValue(Comparator.reverseOrder())).
        forEach(System.out::println);
    }
}
