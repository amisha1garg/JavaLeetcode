package array;

public class GetAllOnes {
    public static void main(String[] args) {
        int[] array = {0, 0, 0, 1, 1, 1, 1, 1};

        int value = (getAllOnes(array, 0, array.length - 1));
        if (value != -1) {
            System.out.println(array.length - value);
        }
    }

    public static int getAllOnes(int arr[], int start, int end) {

        int length = arr.length; // 8
        int mid = (start + end) / 2; // 4 //1 // 2 // 3
        int firstIndex = -1;

        if (start == end && arr[mid] == 0) {
            return firstIndex;
        }
        if (start == end && arr[mid] == 1) {
            firstIndex = mid;
            return firstIndex;
        }

        if (arr[mid] == 1) {
            firstIndex = mid; //3
            getAllOnes(arr, start, mid - 1);
        }
        if (arr[mid] == 0) {
            getAllOnes(arr, mid + 1, end);
        }

        return firstIndex; // 3
    }


}
