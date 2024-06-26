package dsaJavaPrograms.basicPatterns;
/*

// O/P:

*
    *
        *
            *
                *

*/


public class PrintDiagonal {

    public static void main(String[] args) {
        printPattern(5);               // n -> no of rows
    }

    private static void printPattern(int n) {
        int nst = 1;            // No of stars in a row
        int nsp = 0;            // No of spaces in a row

        /*for (int i = 1; i <= n; i++) {           // for no. of rows

            // inner loop for spaces
            for (int j = nsp; j >= 1; j--) {           // for no. of spaces
                System.out.print("\t");
            }

            // for no. of stars
            System.out.print("*\t");

            // Update nst and nsp
            nsp++;
            System.out.println();
        }*/


        // Gap method           diagonal - subtraction
        for (int i = 1; i <= n; i++) {           // for no. of rows
            for (int j = 1; j <= n; j++) {
                if (i - j == 0) {
                    System.out.print("*\t");
                } else
                    System.out.print("\t");
            }
            System.out.println();
        }

    }
}
