package dsaJavaPrograms.string;

import java.util.Scanner;

public class PalindromicStrings {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter string: ");
        String str = scanner.nextLine();

        printAllPalindromicStrings(str);
    }

    private static void printAllPalindromicStrings(String str) {
        // Find all substrings
        // Check each substring if its equal to its reverse
        // if yes, then print

        for (int si = 0; si < str.length(); si++) {
            for (int ei = si; ei < str.length(); ei++) {
                if (isPalindrome(str.substring(si, ei + 1))) {
                    System.out.println(str.substring(si, ei + 1));
                }
            }
        }
    }

    private static boolean isPalindrome(String string) {

        int left = 0;
        int right = string.length() - 1;
        while (left < right) {
            if (string.charAt(left) != string.charAt(right)) {
                return false;
            } else {
                left++;
                right--;
            }

        }
        return true;
    }
}
