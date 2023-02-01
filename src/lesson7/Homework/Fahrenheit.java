package lesson7.Homework;

public class Fahrenheit implements toCelsius, toKelvin{
    @Override
    public double fahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit-32)*0.5556;
    }

    @Override
    public double fahrenheitToKelvin(double fahrenheit) {
        return (fahrenheit - 32) *0.5556 + 273.15;

    }

    @Override
    public double kelvinToCelsius(double kelvin) {
        return 0;
    }

    @Override
    public double celsiusToKelvin(double celsius) {
        return 0;
    }
}
