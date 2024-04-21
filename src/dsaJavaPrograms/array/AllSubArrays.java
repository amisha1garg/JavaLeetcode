package dsaJavaPrograms.array;

public class AllSubArrays {
    public static void main(String[] args) {
        int[] array = {6, 2, 5, 1};
        printAllSubArrays(array);
    }

    private static void printAllSubArrays(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                for (int k = j; k < arr.length; k++) {
                    System.out.print(arr[k] + "\t");
                }
                System.out.println();
            }
        }
    }
}
