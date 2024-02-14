package array;

import java.util.ArrayList;
import java.util.Arrays;

public class FirstAndLastOccurrencesOfX {
    public static void main(String[] args) {
        long[] arr = {3, 3, 3, 2, 3};
        System.out.println((find(arr, 5, 2)));

    }

    static ArrayList<Long> find(long arr[], int n, int x) {
        int firstOccurrence = -1;
        int lastOccurrence = -1;
        for (int i = 0; i < n; i++) {
            if (arr[i] == x) {
                if (firstOccurrence == -1) {
                    firstOccurrence = i;
                }
                lastOccurrence = i;
            }
        }
        ArrayList<Long> result = new ArrayList<>();
        result.add((long) firstOccurrence);
        result.add((long) lastOccurrence);
        return result;
    }
}
