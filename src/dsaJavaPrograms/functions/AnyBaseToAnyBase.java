package dsaJavaPrograms.functions;

public class AnyBaseToAnyBase {

    public static void main(String[] args) {
        System.out.println(anyBaseToAnyBase(111010, 2, 8));
    }

    private static Long anyBaseToAnyBase(long number, int sourceBase, int destinationBase) {
        Long decimal = anyBaseToDecimal(number, sourceBase);
        Long result = decimalToAnyBase(decimal, destinationBase);
        return result;
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

    private static Long decimalToAnyBase(long decimal, int base) {
        long power = 1;
        long ans = 0;
        while (decimal > 0) {
            long rem = decimal % base;
            decimal /= base;
            ans += rem * power;
            power *= 10;
        }
        return ans;
    }
}
