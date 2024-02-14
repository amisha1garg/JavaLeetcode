package array;

import java.util.Arrays;

public class PendulumnArrangement {
    public static void main(String[] args) {

        int[] arr = {2, 3, 1, 5, 4};
        System.out.println((Arrays.toString(pendulumArrangement(arr, 5))));

    }

    public static int[] pendulumArrangement(int arr[], int n) {
        Arrays.sort(arr);
        int[] result = new int[n];
        int center = (n - 1) / 2;
        int rightToCenter = center + 1;
        int leftToCenter = center - 1;
        result[center] = arr[0];
        for (int i = 1; i < n; i++) {
            result[rightToCenter] = arr[i];
            if (i < n - 1) i += 1;
            else break;
            result[leftToCenter] = arr[i];
            if (leftToCenter != 0)
                leftToCenter -= 1;
            if (rightToCenter < n - 1)
                rightToCenter += 1;
        }
        return result;
    }
}
