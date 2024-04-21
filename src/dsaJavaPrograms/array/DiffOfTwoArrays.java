package dsaJavaPrograms.array;

public class DiffOfTwoArrays {

    public static void main(String[] args) {
        int[] array2 = {9, 9, 9, 9, 3};
        int[] array1 = {9, 9, 8, 9, 1};
        diffArrays(array1, array2, array1.length, array2.length);
    }

    private static void diffArrays(int[] arr1, int[] arr2, int n1, int n2) {
        int[] arr3 = new int[n2];
        int borrow = 0;
        int i = arr1.length - 1;
        int j = arr2.length - 1;
        int k = arr3.length - 1;

        while (k >= 0) {         // while (i >= 0 || j >= 0 || borrow > 0)
            int diff = arr2[j] - borrow;
            if (i >= 0) diff -= arr1[i];
            if (diff < 0) {
                diff += 10;
                borrow = 1;
            } else borrow = 0;
            arr3[k] = diff;
            i--;
            j--;
            k--;
        }

        int m = 0;
        while (arr3[m] == 0) {
            m++;
        }
        for (; m < arr3.length; m++) {
            System.out.print(arr3[m]);
        }
    }
}
