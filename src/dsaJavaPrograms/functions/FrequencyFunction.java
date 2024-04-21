package dsaJavaPrograms.functions;

public class FrequencyFunction {

    public static void main(String[] args) {
        System.out.println(findFrequency(54453563335843L, 3));
    }

    public static int findFrequency(long n, int d) {
        int count = 0;
        while (n > 0) {
            long x = n % 10;
            if (x == d) count++;
            n /= 10;
        }
        return count;
    }
}
