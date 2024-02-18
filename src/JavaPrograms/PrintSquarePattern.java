package JavaPrograms;

// O/P:
//        *    *	*	*
//        *	   *	*	*
//        *	   *	*	*
//        *	   *	*	*

public class PrintSquarePattern {
    public static void main(String[] args) {
        printPattern(4);               // n -> no of rows
    }

    private static void printPattern(int n) {
        int nst = n;            // No of stars in a row
        int nsp = 0;            // No of spaces in a row

        for (int i = 1; i <= n; i++) {           // for no. of rows
            for (int j = 1; j <= nst; j++) {     // for no. of stars
                System.out.print("*\t");
            }
            System.out.println();
        }
    }
}
