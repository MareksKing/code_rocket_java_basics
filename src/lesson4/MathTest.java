package lesson4;

public class MathTest {

    public static void main(String[] args) {
        shouldReturn1whenPowerIs0();
        shouldReturn1whenPowerIs0andNumberIs0();
        shouldReturn4whenPowerIs2andNumberIs2();
        shouldReturn27whenPowerIs3andNumberIs3();
        shouldReturn1whenPowerIs1andNumberIs1();
        shouldReturn5whenPowerIs1andNumberIs5();
    }

    private static void shouldReturn1whenPowerIs0() {
        Math math = new Math();
        int result = math.pow(2,0);
        if (result == 1) {
            System.out.println("shouldReturn1whenPowerIs0: SUCCESS");
        } else {
            System.err.println("shouldReturn1whenPowerIs0: FAILED, expected: 1, but actual: " + result);
        }
    }

    private static void shouldReturn1whenPowerIs0andNumberIs0() {
        Math math = new Math();
        int result = math.pow(0,0);
        if (result == 1) {
            System.out.println("shouldReturn1whenPowerIs0andNumberIs0: SUCCESS");
        } else {
            System.err.println("shouldReturn1whenPowerIs0andNumberIs0: FAILED , expected: 1, but actual: " + result);
        }
    }

    private static void shouldReturn4whenPowerIs2andNumberIs2() {
        Math math = new Math();
        int result = math.pow(2,2);
        if (result == 4) {
            System.out.println("shouldReturn4whenPowerIs2andNumberIs2: SUCCESS");
        } else {
            System.err.println("shouldReturn4whenPowerIs2andNumberIs2: FAILED , expected: 4, but actual: " + result);
        }
    }


    private static void shouldReturn27whenPowerIs3andNumberIs3() {
        Math math = new Math();
        int result = math.pow(3,3);
        if (result == 27) {
            System.out.println("shouldReturn27whenPowerIs3andNumberIs3: SUCCESS");
        } else {
            System.err.println("shouldReturn27whenPowerIs3andNumberIs3: FAILED , expected: 27, but actual: " + result);
        }
    }

    private static void shouldReturn1whenPowerIs1andNumberIs1() {
        Math math = new Math();
        int result = math.pow(1,1);
        if (result == 1) {
            System.out.println("shouldReturn1whenPowerIs1andNumberIs1: SUCCESS");
        } else {
            System.err.println("shouldReturn1whenPowerIs1andNumberIs1: FAILED , expected: 1, but actual: " + result);
        }
    }

    private static void shouldReturn5whenPowerIs1andNumberIs5() {
        Math math = new Math();
        int result = math.pow(5,1);
        if (result == 5) {
            System.out.println("shouldReturn5whenPowerIs1andNumberIs5: SUCCESS");
        } else {
            System.err.println("shouldReturn5whenPowerIs1andNumberIs5: FAILED, expected: 5, but actual: " + result);
        }
    }
}
