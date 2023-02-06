package lesson9;

public class SystemExceptionDemo {

    public static void main(String[] args) {
        try {
            throwSystemException();
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println(e.getMessage());
        }
    }

    private static void throwSystemException() throws Exception {
        throw new Exception("My Exception message");
    }
}
