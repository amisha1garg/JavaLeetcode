package JavaPrograms.functions;

public class AnyBaseMultiplication {

    public static void main(String[] args) {
        System.out.println(anyBaseMultiplication(732, 463, 8));
    }

    private static int anyBaseMultiplication(int n1, int n2, int base) {
        int ans = 0;
        int power = 1;
        while (n2 > 0) {
            int ld = n2 % 10;
            n2 /= 10;
            int product = getProdWithSingDigit(n1, ld, base);
            ans = AnyBaseAddition.anyBaseAddition((product * power), ans, base);
            power *= 10;
        }
        return ans;
    }

    private static int getProdWithSingDigit(int n1, int d, int base) {
        int ans = 0;
        int carry = 0;
        int power = 1;

        while (carry != 0 || n1 != 0) {
            int ld = n1 % 10;
            n1 /= 10;
            int product = ld * d + carry;
            int rem = product % base;
            int quo = product / base;
            ans += (rem * power);
            carry = quo;
            power *= 10;
        }
        return ans;
    }
}
