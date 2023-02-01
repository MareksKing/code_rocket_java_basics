package lesson7.Homework;

public class Celsius implements toKelvin, toFahrenheit{


    @Override
    public double celsiusToFahrenheit(double celsius) {
        return (celsius*1.8)+32;
    }

    @Override
    public double celsiusToKelvin(double celsius) {
        return celsius+273.15;
    }

    @Override
    public double kelvinToFahrenheit(double kelvin) {
        return 0;
    }

    @Override
    public double fahrenheitToKelvin(double fahrenheit) {
        return 0;
    }
}
