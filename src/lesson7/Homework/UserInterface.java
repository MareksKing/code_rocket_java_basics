package lesson7.Homework;

import java.util.Scanner;

public class UserInterface{

    Celsius celsius = new Celsius();
    Fahrenheit fahrenheit = new Fahrenheit();
    Kelvin kelvin = new Kelvin();

    public void run(){

        while(true){

            int fromChoice = choices();
            if(fromChoice == 4){
                break;
            }
            int toChoice = toConvertChoice(fromChoice);
            double temperature = takeTemperature(fromChoice);
            double convertedTemperature = converter(temperature, fromChoice, toChoice);
            printResult(temperature, convertedTemperature, fromChoice, toChoice);

        }


    }
    public int choices() {

        int fromChoice = 0;
        while(fromChoice < 1 || fromChoice > 4) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("1: From Celsius");
            System.out.println("2: From Fahrenheit");
            System.out.println("3: From Kelvin");
            System.out.println("4: Stop");
            System.out.print("From which measurement do you want to convert from?: ");
            fromChoice = scanner.nextInt();
        }
        return fromChoice;

    }

    public int toConvertChoice(int fromChoice){
        int toChoice = 0;
        while(toChoice < 1 || toChoice > 2) {
            Scanner scanner = new Scanner(System.in);
            switch (fromChoice) {
                case 1:
                    System.out.println("1: To Fahrenheit");
                    System.out.println("2: To Kelvin");
                    break;
                case 2:
                    System.out.println("1: To Celsius");
                    System.out.println("2: To Kelvin");
                    break;
                case 3:
                    System.out.println("1: To Celsius");
                    System.out.println("2: To Fahrenheit");
                    break;
            }
            System.out.print("To which scale do you want to convert to?: ");
            toChoice = scanner.nextInt();
        }
        return toChoice;

    }


    public double takeTemperature(int fromChoice){
        Scanner scanner = new Scanner(System.in);

        switch (fromChoice){
            case 1:
                System.out.print("Input temperature in Celsius: ");
                break;
            case 2:
                System.out.print("Input temperature in Fahrenheit: ");
                break;
            case 3:
                System.out.print("Input temperature in Kelvin: ");
                break;
        }
        return scanner.nextDouble();
    }
    public double converter(double temperature, int fromChoice, int toChoice){

        switch (fromChoice){
            case 1:
                if(toChoice == 1){
                    return celsius.celsiusToFahrenheit(temperature);
                }else{
                    return celsius.celsiusToKelvin(temperature);
                }
            case 2:
                if(toChoice == 1){
                    return fahrenheit.fahrenheitToCelsius(temperature);
                }else{
                    return fahrenheit.fahrenheitToKelvin(temperature);
                }
            case 3:
                if(toChoice == 1){
                    return kelvin.kelvinToCelsius(temperature);
                }else{
                    return kelvin.kelvinToFahrenheit(temperature);
                }
        }
        return 0;
    }

    public void printResult(double temperature, double convertedTemp, int fromChoice, int toChoice){

        switch (fromChoice){
            case 1:
                if(toChoice == 1){
                    System.out.println(temperature + "C" + " = " +convertedTemp + "F");
                }else{
                    System.out.println(temperature + "C" + " = " +convertedTemp + "K");
                }
                break;
            case 2:
                if(toChoice == 1){
                    System.out.println(temperature + "F" + " = " +convertedTemp + "C");
                }else{
                    System.out.println(temperature + "F" + " = " +convertedTemp + "K");
                }
                break;
            case 3:
                if(toChoice == 1){
                    System.out.println(temperature + "K" + " = " +convertedTemp + "C");
                }else{
                    System.out.println(temperature + "K" + " = " +convertedTemp + "F");
                }
                break;
        }
    }







}
