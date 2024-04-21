package dsaJavaPrograms.array;

public class BinarySearchCeilFloor {
    public static void main(String[] args) {
        int[] array = {1, 4, 7, 10, 13, 16, 19, 22};
        findFloorAndCeil(array, 17);
    }

    private static void findFloorAndCeil(int[] arr, int x) {
        int left = 0;
        int right = arr.length - 1;
        int floor = -1;
        int ceil = -1;
        while (left <= right) {
            int mid = (left + right) / 2;
            if (arr[mid] == x) {
                floor = arr[mid];
                ceil = arr[mid];
                break;
            }
            if (arr[mid] < x) {
                left = mid + 1;
                floor = arr[mid];
            } else {
                right = mid - 1;
                ceil = arr[mid];
            }
        }

        System.out.println(floor);
        System.out.println(ceil);
    }

}
