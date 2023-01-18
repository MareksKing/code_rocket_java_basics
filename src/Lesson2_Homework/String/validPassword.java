package Lesson2_Homework.String;

import java.util.Scanner;

public class validPassword {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("1. A password must have at least ten characters.\n" +
                "2. A password consists of only letters and digits.\n" +
                "3. A password must contain at least two digits");

        System.out.print("Input password: ");
        String password = scanner.next();
        int digitCount = 0;

        for (int i = 0; i < password.length(); i++) {
            if(password.length() <= 10){
                System.out.println("Password too short!");
                break;
            }
            if(isDigit(password.charAt(i))){
                digitCount++;
            }
            if(!isLetter(password.charAt(i)) && !isDigit(password.charAt(i))){
                System.out.println("Password must consist of only letters and digits");
                break;
            }
            if(digitCount < 2 && i == password.length()-1){
                System.out.println("Password must contain at least two digits");
                break;
            }

            if(i == password.length()-1){
                System.out.println("Password valid: " + password);
                break;
            }

        }
    }

    public static boolean isLetter(char nowChar){

        if(nowChar >= 'a' && nowChar <= 'z'
         || nowChar >= 'A' && nowChar <= 'Z'){
            return true;
        }else{
            return false;
        }
    }
    public static boolean isDigit(char nowChar){

        if(nowChar >= '0' && nowChar <= '9' ){
            return true;
        }else{
            return false;
        }
    }
}
