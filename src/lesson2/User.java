package lesson2;

public class User {

    private final String name;
    private final Integer age;
    private final String status;

    public User(String name, Integer age, String status) {
        this.name = name;
        this.age = age;
        this.status = status;
    }

    public String getName() {
        return name;
    }

    public Integer getAge() {
        return age;
    }

    public String getStatus() {
        return status;
    }
}
