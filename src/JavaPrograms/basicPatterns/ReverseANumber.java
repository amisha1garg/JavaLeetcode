package JavaPrograms.basicPatterns;

public class ReverseANumber {
    public static void main(String[] args) {
        System.out.println(reverseNumber(191237L));
    }

    private static long reverseNumber(Long n) {
        long reverse = 0L;
        while (n > 0) {
            reverse = reverse * 10 + n % 10;
            n = n / 10;
        }
        return reverse;
    }
}
