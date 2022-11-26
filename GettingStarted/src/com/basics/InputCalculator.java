package com.basics;

import java.util.Scanner;

public class InputCalculator {
    public static void inputThenPrintSumAndAverage() {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int numCount = 0;

        while (scanner.hasNextInt()) {
            sum += scanner.nextInt();
            numCount++;
        }
        System.out.println("SUM = " + sum + " AVG = " + Math.round((double) sum / numCount));
        scanner.close();
    }
}
