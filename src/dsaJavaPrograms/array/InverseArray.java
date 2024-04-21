package dsaJavaPrograms.array;


import java.util.Arrays;

// Make value as index and index as value. Given - values are in range 0->n-1
public class InverseArray {
    public static void main(String[] args) {
        int[] array = {6, 2, 5, 1, 7, 0, 4, 3};
        System.out.println(Arrays.toString(inverseArray(array)));   // prints- [5, 3, 1, 7, 6, 2, 0, 4]`
    }

    private static int[] inverseArray(int[] arr) {
        int[] newArr = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            newArr[arr[i]] = i;
        }
        return newArr;
    }
}
