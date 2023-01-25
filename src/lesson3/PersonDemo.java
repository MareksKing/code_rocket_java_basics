package lesson3;

public class PersonDemo {

    public static void main(String[] args) {
        Person person = new Person();
        person.setName("Ruslan");

        System.out.println("First person:");
        System.out.println(person.getName());

        Person secondPerson = new Person();
        secondPerson.setName("John");

        System.out.println("Second person:");
        System.out.println(secondPerson.getName());

        System.out.println("First person:");
        System.out.println(person.getName());
    }
}
