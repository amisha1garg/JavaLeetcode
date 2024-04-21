package dsaJavaPrograms.functions;

public class DecimalToAnyBase {

    public static void main(String[] args) {
        System.out.println(decimalToAnyBase(58, 2));
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
