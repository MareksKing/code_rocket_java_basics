package lesson6;

import java.util.HashMap;

public class HashMapUserDemo {

    public static void main(String[] args) {
        HashMap<User, Integer> map = new HashMap<>();
        User firstUser = new User("Ruslan");
        User secondUser = new User("Ruslan");

        if (firstUser.equals(secondUser)) {
            System.out.println("firstUser.equals(secondUser)");
        }

        map.put(new User("John"), 20);
        map.put(firstUser, 29);
        map.put(secondUser, 31);

        System.out.println(map);

        User key = new User("Ruslan");

        if (secondUser.equals(key)) {
            System.out.println("secondUser.equals(key)");
        }

        Integer result = map.get(key);

        System.out.println(result);
    }
}
