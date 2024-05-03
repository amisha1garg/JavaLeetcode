package dsaJavaPrograms.string;

import java.util.Scanner;

public class InputDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter str1: ");
        String str1 = scanner.next();
//        System.out.print("Enter str2: ");
//        String str2 = scanner.nextLine();

        System.out.println(str1);
//        System.out.println(str2);

        System.out.println(str1.length());
        System.out.println(str1.charAt(3));
        System.out.println(str1.substring(3, 7));           // 3->6 7 excluded
        System.out.println(str1.substring(3));
        System.out.println(str1.substring(3, 3));            // empty string  > End index has higher priority
//        System.out.println("end " + str1.substring(3,2));   //error
        System.out.println(str1.substring(12, 12));        // length is 12  > empty
    }
}
