package JavaPrograms.basicPatterns;

public class PrintMultiplicationTable {
    public static void main(String[] args) {
        printTable(6);
    }


    private static void printTable(int n) {
        for (int i = 1; i < 11; i++) {
            System.out.println(n + " X " + i + " = " + n * i);
        }
    }
}
