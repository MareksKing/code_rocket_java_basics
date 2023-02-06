package lesson8;

import java.math.BigDecimal;
import java.util.List;

public class TemperatureConversionService {

    private final List<TemperatureConverter> converters;

    public TemperatureConversionService(List<TemperatureConverter> converters) {
        this.converters = converters;
    }

    public BigDecimal convertTemperature(TemperatureConversionRequest request) {
        for (TemperatureConverter converter : converters) {
            if (converter.isSupported(request)) {
                return converter.convert(request);
            }
        }

//        return converters.stream()
//                .filter(converter -> converter.isSupported(request))
//                .findFirst()
//                .map(converter -> converter.convert(request))
//                .orElse(null);

        return null;
    }
}
