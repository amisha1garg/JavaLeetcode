package JavaPrograms.basicPatterns;

/*

// O/P:
            1
        2   3   2
    3   4   5   4   3
4   5   6   7   6   5   4
    3   4   5   4   3
        2   3   2
            1

*/

public class PrintIntegerDiamond {

    public static void main(String[] args) {
        printPattern(7);
    }

    private static void printPattern(int n) {
        int nst = 1;
        int nsp = n / 2;
        int oval = 1;

        for (int i = 1; i <= n; i++) {
            int ival = oval;
            for (int j = nsp; j >= 1; j--) {
                System.out.print("\t");
            }

            for (int j = 1; j <= nst; j++) {
                if (j <= nst / 2) {
                    System.out.print(ival + "\t");
                    ival++;
                } else {
                    System.out.print(ival + "\t");
                    ival--;
                }
            }

            if (i <= n / 2) {
                nst += 2;
                nsp -= 1;
                oval++;
            } else {
                nsp += 1;
                nst -= 2;
                oval--;
            }
            System.out.println();
        }
    }
}
