package com.basics;

public class NumberPalindrome {
    public static boolean isPalindrome(int number) {
        number = Math.abs(number);
        int actualNumber = number;

        int reversedNumber = 0;
        while (number != 0) {
            int digit = number % 10;
            number = number / 10;
            reversedNumber = (reversedNumber * 10) + digit;
        }
        return actualNumber == reversedNumber;
    }
}
