public class StringRepeat {
    public static String repeatStr(final int repeat, final String string) {
        return string.repeat(repeat);
    }
public static void main(String[] args) {
        System.out.println(repeatStr(5, "Artorias"));
        System.out.println(repeatStr(5, "Souls"));
        System.out.println(repeatStr(5, "Knight"));
    }
}
