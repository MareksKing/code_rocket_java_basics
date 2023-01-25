package lesson5.equals;

public class CarDemo {

    public static void main(String[] args) {
        Car firstCar = new Car("Red");//0x2131
        Car secondCar = new Car("Red");//0x65465
        Car thirdCar = firstCar;


        if (firstCar == thirdCar) {
            System.out.println("firstCar == thirdCar");
        }

        if (firstCar == secondCar) {
            System.out.println("firstCar == secondCar");
        }

        if (firstCar.equals(secondCar)) {
            System.out.println("firstCar.equals(secondCar)");
        }
    }
}
