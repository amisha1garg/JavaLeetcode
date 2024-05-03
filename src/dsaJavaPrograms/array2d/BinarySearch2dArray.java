package dsaJavaPrograms.array2d;

import java.util.Scanner;

// n * m sorted matrix
public class BinarySearch2dArray {
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
        System.out.print("Enter data: ");
        int data = scn.nextInt();
        binarySearch(arr, data);
    }

    private static void binarySearch(int[][] arr, int data) {
        int n = arr.length;
        int i = 0;      // We can take i as n-1 and j as 0 as well. The i and j will be updated accordingly.
        int j = n - 1;
        while (j >= 0 && i < n) {
            if (data == arr[i][j]) {
                System.out.println("Position: Row: " + i + " Column: " + j);
                return;
            }
            if (data > arr[i][j]) {
                i++;
            } else j--;
        }
        System.out.println("Data not found!");
    }
}
