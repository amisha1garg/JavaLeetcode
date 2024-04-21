package JavaPrograms.basicPatterns;
/*

// O/P:

        *
        *   *
*   *   *   *   *
        *   *
        *

*/


public class PrintArrowShapedPattern {

    public static void main(String[] args) {
        printPattern(5);               // n -> no of rows
    }

    private static void printPattern(int n) {
        int nst = 1;            // No of stars in a row
        int nsp = n / 2;            // No of spaces in a row

        for (int i = 1; i <= n; i++) {           // for no. of rows

            for (int j = nsp; j >= 1; j--) {
                if (i == (n / 2 + 1)) {
                    System.out.print("*\t");

                } else {
                    System.out.print("\t");
                }
            }

                // for no. of stars
                for (int j = nst; j >= 1; j--) {           // for no. of spaces
                    System.out.print("*\t");
                }

                System.out.println();

                // Update nst and nsp
                if (i <= n / 2) nst++;
                else nst--;
            }
        }
    }
