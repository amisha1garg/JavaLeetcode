package JavaPrograms;

/* O/P:

 1
 1 1
 1 2 1
 1 3 3 1
 1 4 6 4 1
 1 5 10 10 5 1
 1 6 15 20 15 6 1

*/

public class PascalTriangle {

    public static void main(String[] args) {
        printPascalTriangle(6);
    }


    private static void printPascalTriangle(int n) {
        for (int i = 0; i < n; i++) {
            int k = 1;
            for (int j = 0; j <= i; j++) {
                System.out.print(k + "\t");
                k = k * (i - j) / (j + 1);
            }
            System.out.println();
        }
    }
}
