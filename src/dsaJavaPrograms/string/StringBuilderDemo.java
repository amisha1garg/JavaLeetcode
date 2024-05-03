package dsaJavaPrograms.string;

public class StringBuilderDemo {
    public static void main(String[] args) {

        StringBuilder sb = new StringBuilder("hello");

        System.out.println(sb);

        sb.append('e');
        sb.append('b');
        System.out.println(sb);

        Character character = sb.charAt(4);
        System.out.println(character);

        sb.setCharAt(3, 'y');
        System.out.println(sb);

        sb.deleteCharAt(4);
        System.out.println(sb);

        sb.insert(3, 'l');
        System.out.println(sb);

    }
}
