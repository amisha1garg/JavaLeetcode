package dsaJavaPrograms.array2d;

import java.util.Scanner;

// Print all diagonal elements from diagonal 0 to diagonal n-1
// n * n matrix
public class StateOfWakanda2 {
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
        printAllDiagonals(arr);
    }

    private static void printAllDiagonals(int[][] arr) {
        int n = arr.length;  // no of rows
        int counter = 0;
        while (counter < n) {
            for (int i = 0; i < n; i++) {
                int j = i + counter;
                if (j < n)
                    System.out.print(arr[i][j] + "\t");
            }
            counter++;
        }
    }
}
