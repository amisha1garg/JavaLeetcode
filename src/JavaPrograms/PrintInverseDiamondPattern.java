package JavaPrograms;
/*

O/P:
*   *   *       *   *   *
*   *               *   *
*                       *

*                       *
*   *               *   *
*   *   *       *   *   *

*/

public class PrintInverseDiamondPattern {

    public static void main(String[] args) {
        diamondPattern(7);               // n -> no of rows
    }

    private static void diamondPattern(int n) {
        int nsp = 1;            // No of stars in a row
        int nst = n / 2;            // No of spaces in a row

        for (int i = 1; i <= n; i++) {           // for no. of rows

            //  inner loop for stars
            for (int j = nst; j >= 1; j--) {        // for no. of stars
                System.out.print("*\t");
            }

            // inner loop for spaces
            for (int j = nsp; j >= 1; j--) {           // for no. of spaces
                System.out.print("\t");
            }

            //  inner loop for stars
            for (int j = nst; j >= 1; j--) {        // for no. of stars
                System.out.print("*\t");
            }

            // Update nst and nsp
            if (i <= n / 2) {
                nsp += 2;
                nst--;
            } else {
                nsp -= 2;
                nst++;
            }
            System.out.println();
        }
    }
}
