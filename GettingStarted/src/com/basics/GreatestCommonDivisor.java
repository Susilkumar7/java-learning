package com.basics;

public class GreatestCommonDivisor {
    public static int getGreatestCommonDivisor(int first, int second) {
        if ((first < 10) || (second < 10)) return -1;
        int min = Math.min(first, second);

        int gcm = -1;
        while (min > 0) {
            if ((first % min == 0) && (second % min == 0)) {
                gcm = min;
                break;
            }
            min--;
        }
        return gcm;
    }
}
