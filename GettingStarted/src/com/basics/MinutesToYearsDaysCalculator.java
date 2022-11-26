package com.basics;

public class MinutesToYearsDaysCalculator {
    public static void printYearsAndDays(long minutes) {
        if (minutes < 0) {
            System.out.println("Invalid Value");
        } else {
            int oneYearMinutes = (60 * 24 * 365);
            int years = (int) (minutes / oneYearMinutes);
            int days = (int) (minutes - (years * oneYearMinutes)) / (24 * 60);
            System.out.println(minutes + " min = " + years + " y and " + days + " d");
        }
    }
}
