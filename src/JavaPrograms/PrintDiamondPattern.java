package JavaPrograms;
/*

// O/P:
        *
    *   *   *
*   *   *   *   *
    *   *   *
        *

*/



public class PrintDiamondPattern {

    public static void main(String[] args) {
        diamondPattern(5);               // n -> no of rows
    }

    private static void diamondPattern(int n) {
        int nst = 1;            // No of stars in a row
        int nsp = n / 2;            // No of spaces in a row

        for (int i = 1; i <= n; i++) {           // for no. of rows

            // first inner loop for spaces
            for (int j = nsp; j >= 1; j--) {           // for no. of spaces
                System.out.print("\t");
            }

            // second inner loop for stars
            for (int j = nst; j >= 1; j--) {        // for no. of stars
                System.out.print("*\t");
            }

            // Update nst and nsp
            if (i <= n / 2) {
                nst += 2;
                nsp--;
            } else {
                nst -= 2;
                nsp++;
            }
            System.out.println();
        }
    }
}
