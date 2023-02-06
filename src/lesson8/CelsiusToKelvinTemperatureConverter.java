package lesson8;

import java.math.BigDecimal;

public class CelsiusToKelvinTemperatureConverter implements TemperatureConverter {
    private static final BigDecimal KELVIN_OFFSET = new BigDecimal("273.15");
    @Override
    public boolean isSupported(TemperatureConversionRequest request) {
        return request.getFromUnit().equalsIgnoreCase("c")
                && request.getToUnit().equalsIgnoreCase("k");
    }

    @Override
    public BigDecimal convert(TemperatureConversionRequest request) {
        return request.getTemperature().add(KELVIN_OFFSET);
    }
}
