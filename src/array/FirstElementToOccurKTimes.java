package array;

import java.util.HashMap;

public class FirstElementToOccurKTimes {

    public static void main(String[] args) {
        int[] arr = {2, 8, 8, 2, 5};
        System.out.println(firstElementKTime(arr, 5, 2));
    }

    public static int firstElementKTime(int[] a, int n, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            map.put(a[i], map.getOrDefault(a[i], 0) + 1);
            System.out.println(map);
            if (map.get(a[i]) == k) return a[i];
        }
        return -1;
    }
}
