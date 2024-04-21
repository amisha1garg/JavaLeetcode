package JavaPrograms.array;


// Span of array means the diff between the max and min elements of array
public class SpanOfArray {
    public static void main(String[] args) {
        int[] arr = new int[5];
        arr[0] = -1;
        arr[1] = 3;
        arr[2] = 13;
        arr[3] = 2;
        arr[4] = 7;
        System.out.println(spanArray(arr));
    }

    private static int spanArray(int[] arr) {

        int max = arr[0];
        int min = arr[0];

        for (int j : arr) {
            if (max < j) {
                max = j;
            }
        }

        for (int j : arr) {
            if (min > j) {
                min = j;
            }
        }

        return max - min;
    }
}
