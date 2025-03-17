public class SumTheStrings {
    public static String sumStr(String a, String b) {
        if (a.isEmpty()) {
            a = "0";
        }
        if (b.isEmpty()) {
            b = "0";
         }
        int result = Integer.parseInt(a) + Integer.parseInt(b);
        return String.valueOf(result);
    }
    public static void main(String[] args) {
        System.out.println(sumStr("4", "5"));
        System.out.println(sumStr("34", "5"));
        System.out.println(sumStr("", ""));
        System.out.println(sumStr("2", ""));
        System.out.println(sumStr("-5", "3"));
    }
}
