package lesson2;

public class UserCreationDemo {

    public static void main(String[] args) {
        User firstUser = new User("Dmitry", 20, "..");

        System.out.println(firstUser.getName());
        System.out.println(firstUser.getAge());

        User secondUser = new User(firstUser.getName(), 21, firstUser.getStatus());
        System.out.println(secondUser);
    }
}
