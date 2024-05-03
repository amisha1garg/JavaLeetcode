package dsaJavaPrograms.string;

public class StringDiff2ConsecChars {

    public static void main(String[] args) {
        String str = "abecd";
        stringWIthDiffEvery2ConsecChars(str);
    }

    private static void stringWIthDiffEvery2ConsecChars(String str) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length() - 1; i++) {
            int diff = str.charAt(i + 1) - str.charAt(i);
            sb.append(str.charAt(i));
            sb.append(diff);
        }
        sb.append(str.charAt(str.length() - 1));
        System.out.println(sb);
    }
}
