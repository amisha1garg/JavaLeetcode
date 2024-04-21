package dsaJavaPrograms.array;

import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args) {
        int[] array = {1, 4, 9, 2, 8, 0, 2};
//        System.out.println(Arrays.toString(reverseArray(array)));
        System.out.println(Arrays.toString(reverseArrayWithinSameArray(array)));
    }

    private static int[] reverseArray(int[] arr) {
        int[] newArr = new int[arr.length];
        int i = 0;
        for (int j = arr.length - 1; j >= 0; j--) {
            newArr[i] = arr[j];
            i++;
        }
        return newArr;
    }

    private static int[] reverseArrayWithinSameArray(int[] arr) {
        int i = 0;
        int j = arr.length - 1;
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
