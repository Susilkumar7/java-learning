package com.basics;

public class SharedDigit {
    public static boolean hasSharedDigit(int num1, int num2){
        if((num1 < 10 || num1 > 99) || ((num2 < 10 || num2 > 99))){
            return false;
        }

        while (num1 > 0){
            int digit = num1 % 10;
            num1 = num1 / 10;

            int tempNum2 = num2;
            while (tempNum2 > 0){
                int num2Digit = tempNum2 % 10;
                tempNum2 = tempNum2 / 10;

                if (digit == num2Digit){
                    return true;
                }
            }

        }
        return false;
    }
}
