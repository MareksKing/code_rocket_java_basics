package lesson8;

import java.math.BigDecimal;
import java.util.Objects;

public class TemperatureConversionRequest {

    private String fromUnit;
    private String toUnit;
    private BigDecimal temperature;

    public TemperatureConversionRequest(String fromUnit, String toUnit, BigDecimal temperature) {
        this.fromUnit = fromUnit;
        this.toUnit = toUnit;
        this.temperature = temperature;
    }

    public String getFromUnit() {
        return fromUnit;
    }

    public void setFromUnit(String fromUnit) {
        this.fromUnit = fromUnit;
    }

    public String getToUnit() {
        return toUnit;
    }

    public void setToUnit(String toUnit) {
        this.toUnit = toUnit;
    }

    public BigDecimal getTemperature() {
        return temperature;
    }

    public void setTemperature(BigDecimal temperature) {
        this.temperature = temperature;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TemperatureConversionRequest that = (TemperatureConversionRequest) o;
        return Objects.equals(fromUnit, that.fromUnit) && Objects.equals(toUnit, that.toUnit)
                && Objects.equals(temperature, that.temperature);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fromUnit, toUnit, temperature);
    }

    @Override
    public String toString() {
        return "TemperatureConversionRequest{" +
                "fromUnit='" + fromUnit + '\'' +
                ", toUnit='" + toUnit + '\'' +
                ", temperature=" + temperature +
                '}';
    }
}
