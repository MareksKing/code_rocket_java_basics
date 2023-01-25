package lesson5.equals;

public class StringDemo {

    public static void main(String[] args) {
        String a = "a";
        String a1 = new String("a");
        String a2 = "a";

        if (a == a1) {
            System.out.println("a == a1");
        }

        if (a == a2) {
            System.out.println("a == a2");
        }

        if (a1 == a2) {
            System.out.println("a1 == a2");
        }

        if (a1.equals(a2)) {
            System.out.println("a1.equals(a2)");
        }


    }
}
