package dsaJavaPrograms.array;

import java.util.Arrays;

public class SumOfTwoArrays {

    public static void main(String[] args) {
        int[] array1 = {9, 9, 9, 9, 9};
        int[] array2 = {9, 9, 9, 9, 9, 9, 9};
        System.out.println(Arrays.toString(sumArrays(array1, array2, array1.length, array2.length)));
    }

    private static int[] sumArrays(int[] arr1, int[] arr2, int n1, int n2) {
        int max = Math.max(n1, n2);
        int[] arr3 = new int[max + 1];
        int carry = 0;
        int i = arr1.length - 1;
        int j = arr2.length - 1;
        int k = arr3.length - 1;

        while (k >= 0) {         // while (i >= 0 || j >= 0 || carry > 0)
            int sum = 0;
            if (i >= 0) sum += arr1[i];
            if (j >= 0) sum += arr2[j];
            sum += carry;
            int rem = sum % 10;
            int quo = sum / 10;
            arr3[k] = rem;
            carry = quo;
            i--;
            j--;
            k--;
        }
        return arr3;
    }
}
