package JavaPrograms.functions;

public class CombinationFunction {

    public static void main(String[] args) {
        System.out.println(findCombination(5, 3));
    }

    public static int findCombination(int n, int r) {
        int nf = findFactorial(n);
        int rf = findFactorial(r);
        int nmrf = findFactorial(n - r);
        return nf / (rf * nmrf);
    }

    public static int findFactorial(int x) {
        int factorial = 1;
        for (int i = 1; i <= x; i++) {
            factorial *= i;
        }
        return factorial;
    }
}
