package lesson4.whileloop;

public class IncrementDemo {

    public static void main(String[] args) {
        int count = 0;
        count++;
        ++count;
        ++count;
        count++;
        System.out.println(count); // 4
        System.out.println(count++); // 4
        System.out.println(count); // 5
        System.out.println(++count); // 6

        count++;
        System.out.println(count);

        int c = count++ + ++count;
        System.out.println(c);
    }
}
