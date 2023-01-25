package lesson3;

import java.util.Scanner;

public class UserInputService {

    public int getUserAge() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your age: ");
        return scanner.nextInt();
    }
}
