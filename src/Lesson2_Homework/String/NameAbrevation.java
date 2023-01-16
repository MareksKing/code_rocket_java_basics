package Lesson2_Homework.String;

import java.util.Scanner;

public class NameAbrevation {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        String name = new String();
        String middleName = new String();
        String lastName = new String();

        System.out.print("Input your full name: ");
        String nameInput = input.nextLine();
        input.close();
        
        String[] names = nameInput.split("\\s+");

        if(names.length == 2){
            name = names[0];
            lastName = names[names.length-1];
            System.out.println("Your name is: " + name + " " + lastName);
            System.out.println("Your abbrevation is: " + name.toUpperCase().charAt(0) + "." + lastName);
        } else if(names.length >= 3){
            name = names[0];
            middleName = names[1];
            lastName = names[names.length-1];
            System.out.println("Your name is: " + name + " " + middleName + " " + lastName);
            System.out.println("Your abbrevation is: " + name.toUpperCase().charAt(0) + "." + middleName.toUpperCase().charAt(0) + "." + lastName);
        }

        
    }
}
