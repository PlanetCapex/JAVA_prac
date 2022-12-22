package ru.mirea.lab6.n11;

import java.util.Objects;

public class ConvertClass implements Convertable{
    private int tempC = 0;
    private int tempF = 0;
    private int tempK = 0;
    private String initialTempType;

    ConvertClass(int temp, String tempType) {
        this.initialTempType = tempType;
        switch (this.initialTempType) {
            case ("C") -> { this.tempC = temp; }
            case ("F") -> { this.tempF = temp; }
            case ("K") -> { this.tempK = temp; }
            default -> System.out.println("Ошибка!");
        }
    }

    @Override
    public void convert() {
        if (Objects.equals(initialTempType, "C")) {
            this.tempF = (tempC * 9/5) + 32;
            this.tempK = tempC + 273;
            return;
        }
        if (Objects.equals(initialTempType, "F")) {
            this.tempK = (tempF - 32) * 5/9 + 273;
            this.tempC = (tempF - 32) * 5/9;
            return;
        }
        if (Objects.equals(initialTempType, "K")) {
            this.tempC = tempK - 273;
            this.tempF = (tempK - 273) * 9/5 + 32;
            return;
        }
    }

    @Override
    public String toString() {
        return "Temperature in Celsius: " + this.tempC +
                "\nTemperature in Fahrenheit: " + this.tempF +
                "\nTemperature in Kelvin: " + this.tempK;
    }
}
