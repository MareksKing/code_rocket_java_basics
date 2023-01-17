package Lesson2_Homework.Numbers;

import java.util.Scanner;

public class middleCharacterFinder {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Input a string: ");
        String string = input.nextLine();
        int stringLength = string.length();
        System.out.println(stringLength);
        if(stringLength % 2 ==0){
            char firstMiddleNumber = string.charAt((stringLength/2)-1);
            char secondMiddleNumber = string.charAt((stringLength/2));
            System.out.println("The middle numbers of " + string + " are: " + firstMiddleNumber + "" + secondMiddleNumber);
        }else{
            System.out.println("The middle number of " + string + " is: " + string.charAt(string.length()/2));
        }
    }
}
