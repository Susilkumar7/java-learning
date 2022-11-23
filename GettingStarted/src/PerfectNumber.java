public class PerfectNumber {
    public static boolean isPerfectNumber(int number) {
        int divisorSum = 1;
        for (int i = 2; i <= number / 2; i++) {
            if (number % i == 0)
                divisorSum += i;
        }
        return number == divisorSum;
    }
}
