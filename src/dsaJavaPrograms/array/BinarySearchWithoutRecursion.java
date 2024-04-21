package dsaJavaPrograms.array;

public class BinarySearchWithoutRecursion {
    public static void main(String[] args) {
        int[] array = {1, 4, 7, 10, 13, 16, 19, 22};
        System.out.println(binarySearch(array, 4));
    }

    private static int binarySearch(int[] arr, int x) {
        int left = 0;
        int right = arr.length - 1;
        while (left <= right) {
            int mid = (left + right) / 2;
            if (arr[mid] == x) return mid;
            if (arr[mid] < x) {
                left = mid + 1;
            } else right = mid - 1;
        }
        return -1;
    }

}
