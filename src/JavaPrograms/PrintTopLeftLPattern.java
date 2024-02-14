package JavaPrograms;

// O/P:
//        *	   *	*	*   *
//        *	   *	*	*
//        *	   *	*
//        *	   *
//        *

public class PrintTopLeftLPattern {

    public static void main(String[] args) {
        topLeftPattern(5);               // n -> no of rows
    }

    private static void topLeftPattern(int n) {
        int nst = 5;            // No of stars in a row
        int nsp = 0;            // No of spaces in a row

        for (int i = 1; i <= n; i++) {               // for no. of rows
            for (int j = 1; j <= nst; j++) {        // for no. of stars
                System.out.print("*\t");
            }
            // Update nst and nsp
            nst--;
            System.out.println();
        }
    }
}
