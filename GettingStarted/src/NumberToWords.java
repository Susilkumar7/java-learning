public class NumberToWords {
    public static void numberToWords(int number) {
        if (number < 0) System.out.println("Invalid Value");
        int digitCount = getDigitCount(number);
        int printedDigitCount = 0;
        int reversedNumber = reverse(number);
        while (reversedNumber > 0) {
            printedDigitCount += 1;
            int lastDigit = reversedNumber % 10;
            switch (lastDigit) {
                case 0:
                    System.out.print("Zero");
                    break;
                case 1:
                    System.out.print("One");
                    break;
                case 2:
                    System.out.print("Two");
                    break;
                case 3:
                    System.out.print("Three");
                    break;
                case 4:
                    System.out.print("Four");
                    break;
                case 5:
                    System.out.print("Five");
                    break;
                case 6:
                    System.out.print("Six");
                    break;
                case 7:
                    System.out.print("Seven");
                    break;
                case 8:
                    System.out.print("Eight");
                    break;
                case 9:
                    System.out.print("Nine");
                    break;
            }
            reversedNumber /= 10;
            System.out.print(" ");
        }
        while (printedDigitCount < digitCount) {
            System.out.print("Zero ");
            printedDigitCount++;
        }
    }

    public static int reverse(int number) {
        int reversedNumber = 0;

        boolean isNegative = number < 0;
        number = Math.abs(number);
        while (number > 0) {
            reversedNumber = (reversedNumber * 10) + (number % 10);
            number = number / 10;
        }
        return (isNegative) ? -reversedNumber : reversedNumber;
    }

    public static int getDigitCount(int number) {
        if (number < 0) return -1;
        if (number < 10) return 1;
        int digitCount = 0;
        while (number > 0) {
            digitCount += 1;
            number /= 10;
        }
        return digitCount;
    }
}
