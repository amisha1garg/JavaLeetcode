package array;

public class Sample2 {

    public static void main(String[] args) {
        int [] array ;
        array = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9};
        System.out.println(binarySearch(array, 0, 8, 0));
    }

    private static Boolean binarySearch(int[] arr, int start, int end, int x) {
        if (start == end && arr[start] != x) {
            return false;
        }

        int mid = (start + end) / 2;
        if (arr[mid] == x) {
            return true;
        }
        if (arr[mid] > x) {
            return binarySearch(arr, start, mid - 1, x);
        }

        if (arr[mid] < x) {
            return binarySearch(arr, mid + 1, end, x);
        }
        return false;
    }
}
