package lesson8;

import java.math.BigDecimal;

public class TemperatureConversionMenuAction implements MenuAction {

    private final UserInput userInput;
    private final TemperatureConversionService temperatureConversionService;

    public TemperatureConversionMenuAction(UserInput userInput, TemperatureConversionService temperatureConversionService) {
        this.userInput = userInput;
        this.temperatureConversionService = temperatureConversionService;
    }

    @Override
    public String getName() {
        return "Convert";
    }

    @Override
    public void execute() {
        TemperatureConversionRequest request = userInput.getRequestFromUser();
        BigDecimal response = temperatureConversionService.convertTemperature(request);
        System.out.println("Conversion result: " + response);
    }
}
