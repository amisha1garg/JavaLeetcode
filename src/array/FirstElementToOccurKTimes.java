package array;

import java.util.Arrays;
import java.util.HashMap;

public class FirstElementToOccurKTimes {

    public static void main(String[] args) {
        int []arr = {2, 8, 8, 2, 5};
        System.out.println(firstElementKTime(arr, 5, 2));
    }

    public static int firstElementKTime(int[] a, int n, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            int count = 0;
            if (map.get(a[i]) != null){
                count = map.get(a[i]);
            }
            map.put(a[i], count+1 );
            System.out.println(map);
            if (map.get(a[i]) == k) return a[i];



           /* int count = 0;
            int num = a[i];
            count++;
            for (int j = i + 1; j < n - 1; j++) {
                if (num == a[j]) count++;
                if (count == k) return num;
            }*/
        }
        return -1;
    }
}
