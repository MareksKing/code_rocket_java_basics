package lesson7.Homework;

import jdk.jshell.spi.ExecutionControl;

public class Kelvin implements toCelsius, toFahrenheit{

    @Override
    public double kelvinToCelsius(double kelvin) {
        return kelvin-273.15;
    }

    @Override
    public double kelvinToFahrenheit(double kelvin) {
        return 1.8*(kelvin-273.15) + 32;
    }

    @Override
    public double celsiusToFahrenheit(double celsius) {
        return 0;
    }

    @Override
    public double fahrenheitToCelsius(double fahrenheit) {
        return 0;
    }
}
