package array;

public class BinarySearch {

    public static void main(String[] args) {
        int[] array = {1, 4, 7, 10, 13, 16, 19, 22};
        System.out.println(binarySearch(array, 0, 7, 17));
    }

    private static Boolean binarySearch(int[] arr, int start, int end, int x) {
        if (start == end && arr[start] != x) {
            return false;
        }

        if (end < start) return false;

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
