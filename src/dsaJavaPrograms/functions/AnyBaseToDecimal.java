package dsaJavaPrograms.functions;

public class AnyBaseToDecimal {

    public static void main(String[] args) {
        System.out.println(anyBaseToDecimal(111010, 2));
    }

    private static Long anyBaseToDecimal(long number, int base) {

        long power = 1;
        Long result = 0L;
        while (number > 0) {
            long lastDigit = number % 10;
            number /= 10;
            result += lastDigit * power;
            power *= base;
        }
        return result;
    }
}
