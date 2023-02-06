package lesson8;

import java.util.List;

public class TemperatureConversionDemo {

    public static void main(String[] args) {
        List<TemperatureConverter> converters = List.of(
                new CelsiusToKelvinTemperatureConverter(),
                new KelvinToCelsiusTemperatureConverter()
        );
        TemperatureConversionService temperatureConversionService = new TemperatureConversionService(converters);

        UserInput userInput = new UserInput();


        List<MenuAction> actions = List.of(
                new TemperatureConversionMenuAction(userInput, temperatureConversionService),
                new ExitMenuAction()
        );

        UserMenu userMenu = new UserMenu(userInput, actions);
        userMenu.startMenu();

    }
}
