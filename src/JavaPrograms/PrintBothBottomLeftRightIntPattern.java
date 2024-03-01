package JavaPrograms;

/* O/P:

1                               1
1   2                       2   1
1   2   3               3   2   1
1   2   3   4       4   3   2   1
1   2   3   4   5   4   3   2   1

*/
public class PrintBothBottomLeftRightIntPattern {
    public static void main(String[] args) {
        printPattern(5);
    }

    private static void printPattern(int n) {

        int nst = 1;
        int nsp = 2 * n - 3;            // No of columns - 2 = (2n-1) - 2

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= nst; j++) {
                System.out.print(j + "\t");
            }

            for (int j = 1; j <= nsp; j++) {
                System.out.print("\t");
            }

            if (i == n) nst--;
            for (int j = nst; j >= 1; j--) {
                System.out.print(j + "\t");
            }
            nst++;
            nsp -= 2;
            System.out.println();
        }
    }
}
