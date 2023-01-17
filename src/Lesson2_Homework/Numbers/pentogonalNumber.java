package Lesson2_Homework.Numbers;

public class pentogonalNumber {
    public static void main(String[] args) {

        for (int i = 0; i <= 50; i++) {
            System.out.println((3*Math.pow((double) i, 2) - i)/2);
        }
    }
}
