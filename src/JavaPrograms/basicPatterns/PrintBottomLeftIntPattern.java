package JavaPrograms.basicPatterns;

// O/P:
//        1
//        2	   3
//        4	   5	6
//        7	   8	9	10
//        11   12	13	14   15

public class PrintBottomLeftIntPattern {

    public static void main(String[] args) {
        printPattern(5);               // n -> no of rows
    }

    private static void printPattern(int n) {
        int number = 1;            // No of stars in a row
        int nsp = 0;            // No of spaces in a row

        for (int i = 1; i <= n; i++) {               // for no. of rows
            for (int j = 1; j <= i; j++) {        // for no. of stars
                System.out.print(number + "\t");
                number++;
            }
            System.out.println();
        }
    }
}
