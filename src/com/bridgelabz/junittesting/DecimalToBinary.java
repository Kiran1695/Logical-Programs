package com.bridgelabz.junittesting;

public class DecimalToBinary {
    public static void toBinary(int decimal) {
        System.out.println("Binary representation of " + decimal + " is : ");
        int[] binaryArray = new int[1000];
        int index = 0;

        while (decimal > 0) {
            binaryArray[index] = decimal % 2;
            decimal = decimal / 2;
            index++;
        }
        for (int arrayIndex = index - 1; arrayIndex >= 0; arrayIndex--) {
            System.out.println(binaryArray[arrayIndex]);
        }
    }

    public static void main(String[] args) {
        int decimalNumber = 9;
        toBinary(decimalNumber);
    }
}
