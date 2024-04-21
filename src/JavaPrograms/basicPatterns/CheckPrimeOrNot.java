package JavaPrograms.basicPatterns;

public class CheckPrimeOrNot {

    public static void main(String[] args) {
        System.out.println(isPrime(21));
    }

    private static int isPrime(int N) {
        if (N == 1) return 0;
        for (int i = 2; i <= Math.abs(Math.sqrt(N)); i++) {         // or  for (int i = 2; i*i <= N; i++){
            if (N % i == 0) {
                return 0;
            }
        }
        return 1;
    }
}
