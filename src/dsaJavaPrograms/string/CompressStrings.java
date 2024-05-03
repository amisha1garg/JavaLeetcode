package dsaJavaPrograms.string;

import java.util.Scanner;

public class CompressStrings {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter string: ");
        String str = scanner.nextLine();

        compress1(str);
        compress2(str);
    }

    private static void compress1(String str) {
        // if str is aaabbcccdaa then output should be abcda
        String compress = "" + str.charAt(0);

        for (int i = 1; i < str.length(); i++) {
            if (str.charAt(i) != compress.charAt(compress.length() - 1)) {
                compress += str.charAt(i);
            }
        }
        System.out.println(compress);
    }

    private static void compress2(String str) {
        // if str is aaabbcccdaa then output should be a3b3c3da2
        String compress = "" + str.charAt(0);

        int count = 1;
        for (int i = 1; i < str.length(); i++) {
            if (str.charAt(i) == compress.charAt(compress.length() - 1)) {
                count++;
            } else if (str.charAt(i) != compress.charAt(compress.length() - 1)) {
                if (count > 1) compress += String.valueOf(count);
                compress += str.charAt(i);
                count = 1;
            }
        }
        if (count > 1) compress += String.valueOf(count);
        System.out.println(compress);
    }
}
