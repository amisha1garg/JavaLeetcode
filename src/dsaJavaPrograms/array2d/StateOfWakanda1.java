package dsaJavaPrograms.array2d;

import java.util.Scanner;

// Print 2D array such that columns are printed first
//first column downward, next column upward. Alternate directions
// n * m matrix
public class StateOfWakanda1 {
    public static void main(String[] args) {
        takeInput();
    }

    private static void takeInput() {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = scn.nextInt();
        System.out.print("Enter m: ");
        int m = scn.nextInt();
        int[][] arr = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print("Enter value: ");
                arr[i][j] = scn.nextInt();
            }
        }
        printOutputInverted(arr);
    }

    private static void printOutputInverted(int[][] arr) {
        int n = arr.length;  // no of rows
        int m = arr[0].length;   // no of columns
        for (int i = 0; i < m; i++) {
            if (i % 2 == 0) {
                for (int j = 0; j < n; j++) {
                    System.out.print(arr[j][i] + "\t");
                }
            } else {
                for (int j = n - 1; j >= 0; j--) {
                    System.out.print(arr[j][i] + "\t");
                }
            }
            System.out.println();
        }
    }
}
