package JavaPrograms.functions;

public class AnyBaseSubtraction {

    public static void main(String[] args) {
        System.out.println(anyBaseSubtraction(643, 724, 8));
    }

    private static int anyBaseSubtraction(int num1, int num2, int base) {
//        num2 > num1 and we need num2 - num1
        int ans = 0;
        int power = 1;
        int borrow = 0;
        while (num2 != 0) {
            int ld1 = num1 % 10;
            int ld2 = num2 % 10;
            if (ld1 > ld2) borrow = base;
            else borrow = 0;
            int sub = ld2 - ld1 + borrow;
            ans += (sub * power);
            power *= 10;

            num1 /= 10;
            if (borrow > 1) num2 = (num2 / 10) - 1;
            else num2 /= 10;
        }
        return ans;
    }
}
