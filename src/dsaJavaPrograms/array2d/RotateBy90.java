package dsaJavaPrograms.array2d;

import java.util.Scanner;

// n * m matrix
public class RotateBy90 {
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
//        rotateBy90(arr, n, m);
        rotate90(arr, n, m);
    }

    private static void rotateBy90(int[][] arr, int n, int m) {
//        Step 1 - Take transpose
//        Step 2 - Traverse from last column to 1st column
        for (int i = 0; i < n; i++) {
            for (int j = m - 1; j >= 0; j--) {
                System.out.print(arr[j][i] + "\t");
            }
            System.out.println();
        }
    }

    private static void rotate90(int[][] arr, int n, int m) {
        int left = 0;
        int right = n - 1;

//        Step-1 - Take transpose
        arr = transpose(arr);

//        Step-2 - arrange columns from right to left
        while (left < right) {
            for (int row = 0; row < arr.length; row++) {
                // swap
                int temp = arr[row][left];
                arr[row][left] = arr[row][right];
                arr[row][right] = temp;
            }
            left++;
            right--;
        }
        printOutput(arr);
    }

    private static int[][] transpose(int[][] arr) {
        int n = arr.length;
        int m = arr[0].length;
        for (int i = 0; i < n; i++) {
            for (int j = i; j < m; j++) {
                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
            }
        }
        return arr;

    }

    private static void printOutput(int[][] arr) {
        int n = arr.length;
        int m = arr[0].length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(arr[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
