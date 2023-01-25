package lesson5;

public class NumberDemo {

    public static void main(String[] args) {
        //&
        //|
        //8 4 2 1
        int a = 6; //0110
        int b = 5; //0101
        // | 0111 - 7
        // & 0100 - 4
        int result = a & b;
        System.out.println(result);

//        int secondResult = a | b;
//        System.out.println(secondResult);
    }
}
