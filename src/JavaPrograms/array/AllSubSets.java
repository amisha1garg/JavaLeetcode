package JavaPrograms.array;

public class AllSubSets {
    public static void main(String[] args) {
        int[] array = {6, 2, 5, 4};
        findAllSubSets(array);
    }

    private static void findAllSubSets(int[] arr) {
        int n = arr.length;
        int totalSubSets = (int) Math.pow(2, n);
        for (int i = 0; i < totalSubSets; i++) {
            String binary = decimalToBinary(i, 2, n);
            char[] binCharArray = binary.toCharArray();
            for (int j = 0; j < binCharArray.length; j++) {
                if (binCharArray[j] == '0') System.out.print("_\t");
                else if (binCharArray[j] == '1') System.out.print(arr[j] + "\t");
            }
            System.out.println();
        }
    }

    private static String decimalToBinary(int dec, int base, int width) {
        int power = 1;
        int ans = 0;
        while (dec > 0) {
            int rem = dec % base;
            dec /= base;
            ans += rem * power;
            power *= 10;
        }
        return String.format("%0" + width + "d", ans);
    }
}
