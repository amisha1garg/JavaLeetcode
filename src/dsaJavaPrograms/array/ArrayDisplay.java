package dsaJavaPrograms.array;

public class ArrayDisplay {

    public static void main(String[] args) {
        int[] arr = new int[5];
        arr[0] = 1;
        arr[1] = 3;
        arr[2] = 6;
        arr[3] = 2;
        arr[4] = 7;
        displayArray(arr);
        System.out.println(sumArray(arr));
    }

    private static void displayArray(int[] arr) {
        for (int j : arr) {
            System.out.println(j);
        }
    }

    private static int sumArray(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum;
    }
}
