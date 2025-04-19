public class RegexpBasics {
    public static boolean isDigit(String s) {

        return s.length() != 1 ? false : s.matches("\\d") ? true : false;
    }

    public static void main(String[] args) {
        System.out.println(isDigit("5"));
        System.out.println(isDigit("hello"));
        System.out.println(isDigit("10"));
        System.out.println(isDigit("0"));
    }
}
