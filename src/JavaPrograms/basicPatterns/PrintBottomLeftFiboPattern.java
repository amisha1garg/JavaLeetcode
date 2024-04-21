package JavaPrograms.basicPatterns;

// O/P:
//        0
//        1	   1
//        2	   3	5
//        8	   13	21	34

public class PrintBottomLeftFiboPattern {

    public static void main(String[] args) {
        printPattern(5);               // n -> no of rows
    }

    private static void printPattern(int n) {
        int a = 0;
        int b = 1;
        int c = a + b;
        for (int i = 1; i <= n; i++) {               // for no. of rows
            for (int j = 1; j <= i; j++) {        // for no. of stars
                System.out.print(a + "\t");
                a = b;
                b = c;
                c = a + b;
            }
            System.out.println();
        }
    }
}
