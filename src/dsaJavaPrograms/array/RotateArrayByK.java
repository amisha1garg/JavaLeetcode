package dsaJavaPrograms.array;

import java.util.Arrays;

public class RotateArrayByK {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7};
        System.out.println(Arrays.toString(rotateArray(array, 8)));
    }

    private static int[] rotateArray(int[] arr, int k) {
        k = k % arr.length;         // if k > arr.length
        if (k < 0) k += arr.length;
        int[] rotatedArr = reverseArrayWithinSameArray(arr, 0, arr.length - 1);
        reverseArrayWithinSameArray(rotatedArr, 0, k - 1);
        reverseArrayWithinSameArray(rotatedArr, k, arr.length - 1);
        return rotatedArr;

    }

    private static int[] reverseArrayWithinSameArray(int[] arr, int start, int end) {
        int i = start;
        int j = end;
        while (i <= j) {
            swap(arr, i, j);
            i++;
            j--;
        }
        return arr;
    }

    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
