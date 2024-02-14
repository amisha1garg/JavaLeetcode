package array;

import java.util.Arrays;

public class AtLeastTwoGreaterElements {

    public static void main(String[] args) {

        long []arr = {2, 8, 7, 1, 5};
        System.out.println(Arrays.toString(findElements(arr, 5)));
    }

    public static long[] findElements( long a[], long n)
    {
        Arrays.sort(a);
         int length = (int) (n-2);
        long arr[] = new long[length];
        for (int i = 0; i < n-2; i++){
            arr[i] = a[i];
        }
        return arr;
    }
}
