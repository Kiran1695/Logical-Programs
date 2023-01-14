package com.bridgelabz.logicalprograms;

public class PerfectNumber {
    public static void main(String[] args) {
        int sumOfDivisor = 0;
        int numberToCheck = 28;
        for (int index = 1; index <= numberToCheck / 2; index++) {
            if (numberToCheck % index == 0) {
                sumOfDivisor += index;
            }
        }

        if (sumOfDivisor == numberToCheck) {
            System.out.println(numberToCheck + " is a perfect number");

        } else {
            System.out.println(numberToCheck + " is not a perfect number");
        }
    }
}
