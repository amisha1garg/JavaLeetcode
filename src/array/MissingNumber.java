package array;

import java.util.Arrays;

public class MissingNumber {

    public static void main(String[] args) {
        int []arr = {2, 3, 1, 5};
        System.out.println((missingNumber(arr, 5)));
    }

    public static int missingNumber(int A[], int N) {
        int sum = ((N + 1) * (N)) / 2;
        for (int i = 0; i < N-1; i++)
            sum -= A[i];
        return sum;
    }
}
