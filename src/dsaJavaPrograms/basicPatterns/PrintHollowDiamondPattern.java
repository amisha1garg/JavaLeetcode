package dsaJavaPrograms.basicPatterns;
/*

O/P:
         *
    *         *
*                   *
    *         *
         *

*/

public class PrintHollowDiamondPattern {

    public static void main(String[] args) {
        printPattern(7);               // n -> no of rows
    }

    private static void printPattern(int n) {
        int nsp1 = n / 2;
//        int nst1 = 1;
        int nsp2 = -1;
//        int nst2 = 1;

        for (int i = 1; i <= n; i++) {           // for no. of rows

            for (int j = nsp1; j >= 1; j--) {
                System.out.print("\t");
            }

            System.out.print("*\t");    // nst1

            for (int j = nsp2; j >= 1; j--) {
                System.out.print("\t");
            }

            if (!(i == 1 || i == n)) {
                System.out.print("*\t");      // nst2
            }

            // Update nst and nsp
            if (i <= n / 2) {
                nsp1 -= 1;
                nsp2 += 2;
            } else {
                nsp1 += 1;
                nsp2 -= 2;
            }
            System.out.println();
        }
    }
}
