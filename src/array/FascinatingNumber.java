package array;

public class FascinatingNumber {

    public static void main(String[] args) {

        System.out.println(fascinating(327));
    }

    static boolean fascinating(long n) {
        long mul2;
        long mul3;
        String concat;
        if (n > 99) {
            mul2 = n * 2;
            mul3 = n * 3;
            concat = Long.toString(n) + mul2 + mul3;
            System.out.println(concat);
            for (char c = '1'; c <= '9'; c++) {
                int count = 0;
                for (int i = 0; i < concat.length(); i++) {
                    if (c == concat.charAt(i)) count++;
                }
                if (count > 1 || count == 0) {
                   return false;
                }
            }
            return true;
        }
        return false;
    }
}
