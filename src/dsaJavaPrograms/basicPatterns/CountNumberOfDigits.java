package dsaJavaPrograms.basicPatterns;

public class CountNumberOfDigits {
    public static void main(String[] args) {
        System.out.println(calculateDigits(1121212777791237L));

    }

    private static int calculateDigitsByStringConversion(Long n) {
        String num = String.valueOf(n);
        return num.length();
    }

    private static int calculateDigits(Long n) {
        int count = 0;
       /* while (n > 0) {
            n = n / 10;
            count++;
        }*/

        for (long i = n; i > 0; i /= 10) {
            count++;
        }
        return count;
    }
}
