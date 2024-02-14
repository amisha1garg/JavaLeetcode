package JavaPrograms;

// O/P:
//                          *
//                      *	*
//                  *	*	*
//              *   *	*	*
//         *	*	*	*   *

public class PrintBottomRightLPattern {

    public static void main(String[] args) {
        bottomRightPattern(5);               // n -> no of rows
    }

    private static void bottomRightPattern(int n) {
        int nst = 1;            // No of stars in a row
        int nsp = n - 1;            // No of spaces in a row

        for (int i = 1; i <= n; i++) {           // for no. of rows

            // first inner loop for spaces
            for (int j = nsp; j >= 1; j--) {           // for no. of spaces
                System.out.print("\t");
            }

            // second inner loop for stars
            for (int j = 1; j <= nst; j++) {        // for no. of stars
                System.out.print("*\t");
            }

            // Update nst and nsp
            nst++;
            nsp--;
            System.out.println();
        }
    }
}
