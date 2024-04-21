package dsaJavaPrograms.basicPatterns;

import java.util.Scanner;

public class FibonacciSeries {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long N = scanner.nextLong();
        fibSeries(N);
        System.out.println("The sum is: " + fibSum(N));

    }

    private static long fibSum(long N) {
        int sum = 0;
        int a = 0;
        int b = 1;
        for (int i = 0; i <= N; i++) {
            int c = a + b;
            sum += a;
            a = b;
            b = c;
        }
        return sum;
    }

    private static void fibSeries(long N) {
        int a = 0;
        int b = 1;
        for (int i = 0; i <= N; i++) {
            int c = a + b;
            System.out.println(a);
            a = b;
            b = c;
        }
    }
}
