public class Main {
    public static void main(String[] args) {

        /*
        SpeedConverter.printConversion(1.5);
        SpeedConverter.printConversion(10.25);
        SpeedConverter.printConversion(-5.6);
        SpeedConverter.printConversion(25.43);
        SpeedConverter.printConversion(75.114);
        MegaBytesConverter.printMegaBytesAndKiloBytes(2500);
        MegaBytesConverter.printMegaBytesAndKiloBytes(-1024);
        MegaBytesConverter.printMegaBytesAndKiloBytes(5000);
        System.out.println(BarkingDog.shouldWakeUp(true, 1));
        System.out.println(BarkingDog.shouldWakeUp(false, 2));
        System.out.println(BarkingDog.shouldWakeUp(true, 8));
        System.out.println(BarkingDog.shouldWakeUp(true, -1));
        DecimalComparator.areEqualByThreeDecimalPlaces(-3.1756, -3.175);
        DecimalComparator.areEqualByThreeDecimalPlaces(3.175, 3.176);
        DecimalComparator.areEqualByThreeDecimalPlaces(3.0, 3.0);
        DecimalComparator.areEqualByThreeDecimalPlaces(-3.123, 3.123);
        DecimalComparator.areEqualByThreeDecimalPlaces(3.175, 3.1756);

        NumberPalindrome.isPalindrome(-1221);
        NumberPalindrome.isPalindrome(707);
        NumberPalindrome.isPalindrome(11212);
        FirstLastDigitSum.sumFirstAndLastDigit(101);
        FirstLastDigitSum.sumFirstAndLastDigit(5);
        FirstLastDigitSum.sumFirstAndLastDigit(919);

        EvenDigitSum.getEvenDigitSum(1234567890);
        EvenDigitSum.getEvenDigitSum(252);
        EvenDigitSum.getEvenDigitSum(-22);

        boolean res;
        res = SharedDigit.hasSharedDigit(12, 23);
        System.out.println("Res: " + res);
        res = SharedDigit.hasSharedDigit(9, 99);
        System.out.println("Res: " + res);
        res = SharedDigit.hasSharedDigit(15, 55);
        System.out.println("Res: " + res);

        boolean res;
        res = LastDigitChecker.hasSameLastDigit (41, 22, 71);
        System.out.println("Res: " + res);
        res = LastDigitChecker.hasSameLastDigit (23, 32, 42);
        System.out.println("Res: " + res);
        res = LastDigitChecker.hasSameLastDigit (9, 99, 999);
        System.out.println("Res: " + res);

        int res;
        res = GreatestCommonDivisor.getGreatestCommonDivisor(25, 15);
        System.out.println("Res: " + res);
        res = GreatestCommonDivisor.getGreatestCommonDivisor(12, 30);
        System.out.println("Res: " + res);
        res = GreatestCommonDivisor.getGreatestCommonDivisor(9, 18);
        System.out.println("Res: " + res);
        res = GreatestCommonDivisor.getGreatestCommonDivisor(81, 153);
        System.out.println("Res: " + res);

        FactorPrinter.printFactors(6);
        System.out.println();
        FactorPrinter.printFactors(32);
        System.out.println();
        FactorPrinter.printFactors(10);
        System.out.println();
        FactorPrinter.printFactors(-1);

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
