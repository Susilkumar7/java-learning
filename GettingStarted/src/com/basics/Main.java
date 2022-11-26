package com.basics;

public class Main {
    public static void main(String[] args) {

        /*
        com.basics.SpeedConverter.printConversion(1.5);
        com.basics.SpeedConverter.printConversion(10.25);
        com.basics.SpeedConverter.printConversion(-5.6);
        com.basics.SpeedConverter.printConversion(25.43);
        com.basics.SpeedConverter.printConversion(75.114);
        com.basics.MegaBytesConverter.printMegaBytesAndKiloBytes(2500);
        com.basics.MegaBytesConverter.printMegaBytesAndKiloBytes(-1024);
        com.basics.MegaBytesConverter.printMegaBytesAndKiloBytes(5000);
        System.out.println(com.basics.BarkingDog.shouldWakeUp(true, 1));
        System.out.println(com.basics.BarkingDog.shouldWakeUp(false, 2));
        System.out.println(com.basics.BarkingDog.shouldWakeUp(true, 8));
        System.out.println(com.basics.BarkingDog.shouldWakeUp(true, -1));
        com.basics.DecimalComparator.areEqualByThreeDecimalPlaces(-3.1756, -3.175);
        com.basics.DecimalComparator.areEqualByThreeDecimalPlaces(3.175, 3.176);
        com.basics.DecimalComparator.areEqualByThreeDecimalPlaces(3.0, 3.0);
        com.basics.DecimalComparator.areEqualByThreeDecimalPlaces(-3.123, 3.123);
        com.basics.DecimalComparator.areEqualByThreeDecimalPlaces(3.175, 3.1756);

        com.basics.NumberPalindrome.isPalindrome(-1221);
        com.basics.NumberPalindrome.isPalindrome(707);
        com.basics.NumberPalindrome.isPalindrome(11212);
        com.basics.FirstLastDigitSum.sumFirstAndLastDigit(101);
        com.basics.FirstLastDigitSum.sumFirstAndLastDigit(5);
        com.basics.FirstLastDigitSum.sumFirstAndLastDigit(919);

        com.basics.EvenDigitSum.getEvenDigitSum(1234567890);
        com.basics.EvenDigitSum.getEvenDigitSum(252);
        com.basics.EvenDigitSum.getEvenDigitSum(-22);

        boolean res;
        res = com.basics.SharedDigit.hasSharedDigit(12, 23);
        System.out.println("Res: " + res);
        res = com.basics.SharedDigit.hasSharedDigit(9, 99);
        System.out.println("Res: " + res);
        res = com.basics.SharedDigit.hasSharedDigit(15, 55);
        System.out.println("Res: " + res);

        boolean res;
        res = com.basics.LastDigitChecker.hasSameLastDigit (41, 22, 71);
        System.out.println("Res: " + res);
        res = com.basics.LastDigitChecker.hasSameLastDigit (23, 32, 42);
        System.out.println("Res: " + res);
        res = com.basics.LastDigitChecker.hasSameLastDigit (9, 99, 999);
        System.out.println("Res: " + res);

        int res;
        res = com.basics.GreatestCommonDivisor.getGreatestCommonDivisor(25, 15);
        System.out.println("Res: " + res);
        res = com.basics.GreatestCommonDivisor.getGreatestCommonDivisor(12, 30);
        System.out.println("Res: " + res);
        res = com.basics.GreatestCommonDivisor.getGreatestCommonDivisor(9, 18);
        System.out.println("Res: " + res);
        res = com.basics.GreatestCommonDivisor.getGreatestCommonDivisor(81, 153);
        System.out.println("Res: " + res);

        com.basics.FactorPrinter.printFactors(6);
        System.out.println();
        com.basics.FactorPrinter.printFactors(32);
        System.out.println();
        com.basics.FactorPrinter.printFactors(10);
        System.out.println();
        com.basics.FactorPrinter.printFactors(-1);

        */

        System.out.println("Digit Count");
        int count;
        count = NumberToWords.getDigitCount(0);
        System.out.println(count);
        count = NumberToWords.getDigitCount(123);
        System.out.println(count);
        count = NumberToWords.getDigitCount(-12);
        System.out.println(count);
        count = NumberToWords.getDigitCount(5200);
        System.out.println(count);

        System.out.println("Reversed Num");
        int reverse;
        reverse = NumberToWords.reverse(-121);
        System.out.println(reverse);
        reverse = NumberToWords.reverse(1212);
        System.out.println(reverse);
        reverse = NumberToWords.reverse(1234);
        System.out.println(reverse);
        reverse = NumberToWords.reverse(100);
        System.out.println(reverse);

        System.out.println("Words");
        NumberToWords.numberToWords(123);
        NumberToWords.numberToWords(1010);
        NumberToWords.numberToWords(1000);
        NumberToWords.numberToWords(-12);


    }
}
