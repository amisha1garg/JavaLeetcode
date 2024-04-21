package JavaPrograms.functions;

public class AnyBaseAddition {

    public static void main(String[] args) {
        System.out.println(anyBaseAddition(777, 77, 8));
    }

    public static int anyBaseAddition(int num1, int num2, int base) {
        int ans = 0;
        int power = 1;
        int carry = 0;
        while (num1 != 0 || num2 != 0 || carry != 0) {
            int ld1 = num1 % 10;
            int ld2 = num2 % 10;
            num1 /= 10;
            num2 /= 10;
            int sum = ld1 + ld2 + carry;
            int rem = sum % base;
            int quo = sum / base;
            ans += (rem * power);
            carry = quo;
            power *= 10;
        }
        return ans;
    }
}
