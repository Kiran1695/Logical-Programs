package com.bridgelabz.junittesting;

public class SquareRoot {
    public static double sqrt(int number) {
        double sqrtValue = number;
        double epsilon = 1e-15;
        while (Math.abs(sqrtValue - number / sqrtValue) > epsilon * sqrtValue) {
            sqrtValue = (number / sqrtValue + sqrtValue) / 2;
        }
        return sqrtValue;
    }

    public static void main(String[] args) {
        int number = Integer.parseInt(args[0]);
        double sqrt = sqrt(number);
        System.out.println("The Square Root Of " + number + " is: " + sqrt);
    }
}
