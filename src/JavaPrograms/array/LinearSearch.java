package JavaPrograms.array;

public class LinearSearch {
    public static void main(String[] args) {
        int[] array = {1, 4, 7, 10, 13, 16, 19, 22};
        System.out.println(linearSearch(array, 7));
    }

    private static int linearSearch(int[] arr, int x) {
        for (int j = 0; j < arr.length; j++) {
            if (arr[j] == x) return j;
        }
        return -1;
    }

}
