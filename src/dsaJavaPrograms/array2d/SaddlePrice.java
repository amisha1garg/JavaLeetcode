package dsaJavaPrograms.array2d;

import java.util.Scanner;

// Saddle price is defined as the least price in a row but max price in a column
// n * n matrix
public class SaddlePrice {
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
        System.out.println(findSaddlePrice(arr));
    }

    private static int findSaddlePrice(int[][] arr) {
        int n = arr.length;  // no of rows

        for (int i = 0; i < n; i++) {
            int min = arr[i][0];
            int col = 0;
            for (int j = 0; j < n; j++) {
                if (min > arr[i][j]) {
                    min = arr[i][j];
                    col = j;
                }
            }
            int max = arr[0][col];
            for (int k = 0; k < n; k++) {
                if (max < arr[k][col]) {
                    max = arr[k][col];
                }
            }
            if (min == max) return min;
        }
        return -1;

    }
}
