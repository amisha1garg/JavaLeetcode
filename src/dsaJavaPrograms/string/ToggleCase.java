package dsaJavaPrograms.string;

import java.util.Scanner;

public class ToggleCase {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter string: ");
        String str = scanner.nextLine();

        toggleCase(str);
        toggleCase2(str);
    }

    private static void toggleCase(String str) {
        // if str is aAtjUIkOp then output should be AaTJuiKoP
        String toggleStr = "";
        String upper = str.toUpperCase();
        String lower = str.toLowerCase();

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == upper.charAt(i)) toggleStr += lower.charAt(i);
            else toggleStr += upper.charAt(i);
        }
        System.out.println(toggleStr);
    }

    private static void toggleCase2(String str) {
        // if str is aAtjUIkOp then output should be AaTJuiKoP
        StringBuilder toggleStr = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch >= 'A' && ch <= 'Z')
                toggleStr.append((char) (ch - 'A' + 'a'));
            else toggleStr.append((char) (ch - 'a' + 'A'));
        }
        System.out.println(toggleStr);
    }

}
