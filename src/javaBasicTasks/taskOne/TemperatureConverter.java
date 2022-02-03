package javaBasicTasks.taskOne;

public class TemperatureConverter {
    public static double convertToCelsius(double Fahrenheit){
        return (Fahrenheit - 32) / 1.8;
    }

    public static double convertToFahrenheit(double Celsius){
        return Celsius * 1.8 + 32;
    }
}
