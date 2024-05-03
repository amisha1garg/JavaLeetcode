package dsaJavaPrograms.array2d;

import java.util.Scanner;

// n * m matrix
public class SpiralDisplay2DArray {
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
        spiralDisplay(arr, n, m);
    }

    private static void spiralDisplay(int[][] arr, int n, int m) {
        int rmin = 0;
        int rmax = n - 1;
        int cmin = 0;
        int cmax = m - 1;
        int count = 0;
        while (count < n * m) {
            // left boundary
            for (int row = rmin; row <= rmax && (count < n * m); row++) {
                System.out.println(arr[row][cmin] + "\t");
                count++;
            }
//            to avoid duplicates
            cmin++;

            // bottom boundary
            for (int col = cmin; col <= cmax && (count < n * m); col++) {
//              (count < n * m) means all elements are printed and task can be terminated now.
//              It can happen after any loop. That's why it's checked in each loop
                System.out.println(arr[rmax][col] + "\t");
                count++;
            }
            rmax--;

            // right boundary
            for (int row = rmax; row >= rmin && (count < n * m); row--) {
                System.out.println(arr[row][cmax] + "\t");
                count++;
            }
            cmax--;

            // upper boundary
            for (int col = cmax; col >= cmin && (count < n * m); col--) {
                System.out.println(arr[rmin][col] + "\t");
                count++;
            }
            rmin++;
        }
    }
}
