package javaBasicTasks.taskOne;

import java.util.InputMismatchException;
import java.util.Scanner;

import static javaBasicTasks.taskOne.TemperatureConverter.convertToCelsius;
import static javaBasicTasks.taskOne.TemperatureConverter.convertToFahrenheit;

public class TemperatureConverterTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double temperature;
        byte type;

        System.out.print("Choose which type of conversion would you use\n 1 - Celsius to Fahrenheit\n 2 - Fahrenheit to Celsius\n");

        while (true) {
            type = scanner.nextByte();

            if (type == 1) {
                System.out.println("Please enter your temperature in celsius");
                try {
                    temperature = scanner.nextDouble();
                    System.out.printf("Your celsius temperature %f in Fahrenheit is %f", temperature, convertToFahrenheit(temperature));
                    break;
                } catch (InputMismatchException ex) {
                    System.err.println("You entered invalid data, enter your type and try again");
                    scanner.nextLine(); // очищаем буфер сканера
                }
            } else if (type == 2) {
                System.out.println("Please enter your temperature in fahrenheit");
                try {
                    temperature = scanner.nextDouble();
                    System.out.printf("Your fahrenheit temperature %f in celsius is %f", temperature, convertToCelsius(temperature));
                    break;
                } catch (InputMismatchException ex) {
                    System.err.println("You entered invalid data, enter your type and try again");
                    scanner.nextLine(); // очищаем буфер сканера
                }
            } else {
                System.out.println("I don't know this type, try again");
            }
        }

    }
}
