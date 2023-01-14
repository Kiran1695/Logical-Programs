package com.bridgelabz.logicalprograms;

import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        Scanner scannerObject = new Scanner(System.in);
        int remainder, reverseNumber = 0;
        System.out.println("Enter the number to be reversed: ");
        int numberToReverse = scannerObject.nextInt();
        scannerObject.close();

        while (numberToReverse > 0) {
            remainder = numberToReverse % 10;
            reverseNumber = (reverseNumber * 10) + remainder;
            numberToReverse = numberToReverse / 10;
        }
        System.out.println("The reversed number is " + reverseNumber);
    }
}
