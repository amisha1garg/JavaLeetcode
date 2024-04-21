package dsaJavaPrograms.array;

public class BarChart {

    public static void main(String[] args) {
        int[] array = {1, 4, 0, 10, 13, 6, 9, 2};
        displayBarChart(array);
    }

    private static void displayBarChart(int[] arr) {
        int max = maxArray(arr);
        for (int i = max; i > 0; i--) {
            for (int j = 0; j < arr.length; j++) {
                if (i > arr[j]) System.out.print("\t");
                else System.out.print("*\t");
            }
            System.out.println();
        }
    }

    private static int maxArray(int[] arr) {
        int max = arr[0];
        for (int j : arr) {
            if (j > max) max = j;
        }
        return max;
    }
}
