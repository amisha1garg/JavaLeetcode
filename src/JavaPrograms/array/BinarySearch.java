package JavaPrograms.array;

public class BinarySearch {
    public static void main(String[] args) {
        int[] array = {1, 4, 7, 10, 13, 16, 19, 22};
        System.out.println(binarySearch(array, 19, 0, array.length - 1));
    }

    private static int binarySearch(int[] arr, int x, int start, int end) {
        int mid = start + (end - start) / 2;

        if (arr[mid] == x) return mid;

        if (start > end) return -1;

        if (arr[mid] < x) {
            return binarySearch(arr, x, mid + 1, end);
        } else return binarySearch(arr, x, start, mid - 1);

    }

}
