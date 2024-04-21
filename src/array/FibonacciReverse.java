package array;

public class FibonacciReverse {
    public static void main(String[] args) {
        int n = 10; // Number of Fibonacci numbers to print
        System.out.println("Fibonacci series in reverse order:");
        printFibonacciReverse(n);
    }

    // Recursive method to generate Fibonacci numbers
    public static int fibonacci(int n) {
        if (n <= 1) {
            return n;
        } else {
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }

    // Method to print Fibonacci series in reverse order
    public static void printFibonacciReverse(int n) {
        for (int i = n - 1; i >= 0; i--) {
            System.out.print(fibonacci(i) + " ");
        }
    }
}
