package lesson4.whileloop;

public class WhileLoopDemo {

    public static void main(String[] args) {
        int count = 0;
        while (count < 10) {
            System.out.println("Count: " + count);
            count++;
//            count = count + 1;
        }

        System.out.println(count);
    }
}
