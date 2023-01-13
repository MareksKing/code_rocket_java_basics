package Lesson2_Homework.School;

public class Student {
    
    private final String name;
    private final int rollNumber;
    private final String phoneNumber;
    private final String address;


    public Student(String name, int rollNumber, String address, String phoneNumber) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.address = address;
        this.phoneNumber = phoneNumber;
    }


    @Override
    public String toString() {
        return "Student [name=" + name + ", rollNumber=" + rollNumber + ", phoneNumber=" + phoneNumber + ", address="
                + address + "]";
    }


    

    

    



}
