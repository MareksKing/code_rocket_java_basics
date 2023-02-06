package lesson9;

public class NPEDemo {

    public static void main(String[] args) {
        String a = null;
        a.toLowerCase();
    }
}
