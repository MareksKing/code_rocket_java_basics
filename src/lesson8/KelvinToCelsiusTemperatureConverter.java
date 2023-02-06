package lesson8;

import java.math.BigDecimal;

public class KelvinToCelsiusTemperatureConverter implements TemperatureConverter {

    private static final BigDecimal KELVIN_OFFSET = new BigDecimal("273.15");

    @Override
    public boolean isSupported(TemperatureConversionRequest request) {
        return request.getFromUnit().equalsIgnoreCase("k")
                && request.getToUnit().equalsIgnoreCase("c");
    }

    @Override
    public BigDecimal convert(TemperatureConversionRequest request) {
        return request.getTemperature().subtract(KELVIN_OFFSET);
    }
}
