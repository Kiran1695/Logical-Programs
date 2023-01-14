package com.bridgelabz.junittesting;

import java.util.Scanner;

public class TemperatureConversion {
    public static void convertCelsiusToFahrenheit(float temperature) {
        float temperatureInFahrenheit = (temperature * 9 / 5) + 32;
        System.out.println(temperature + " C = " + temperatureInFahrenheit + " F");
    }

    public static void convertFahrenheitToCelsius(float temperature) {
        float temperatureInCelsius = (temperature - 32) * 5 / 9;
        System.out.println(temperature + " F = " + temperatureInCelsius + " C");
    }

    public static void main(String[] args) {

        Scanner scannerObject = new Scanner(System.in);
        float temperature;

        while (true) {

            System.out.println("Enter:\n1 - Celsius To Fahrenheit\n2 - Fahrenheit To Celsius\n3 - EXIT\n");
            int userchoice = scannerObject.nextInt();
            switch (userchoice) {
                case 1:
                    System.out.println("Enter temperature in Celsius: ");
                    temperature = scannerObject.nextFloat();
                    convertCelsiusToFahrenheit(temperature);
                    break;

                case 2:
                    System.out.println("Enter temperature in Fahrenheit: ");
                    temperature = scannerObject.nextFloat();
                    convertFahrenheitToCelsius(temperature);
                    break;

                case 3:
                    System.exit(0);
                    break;
            }
        }
    }

}
