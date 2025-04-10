public class StringReplace {
    public static String replace(final String s) {
        String vowel = "aeiouAEIOU";
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            if (vowel.indexOf(s.charAt(i)) >= 0) {
                sb.append('!');
            } else {
                sb.append(s.charAt(i));
            }
        }
        return sb.toString();
    }
    public static void main(String[] args) {
        System.out.println(replace("Hi!"));
        System.out.println(replace("!Hi! Hi!"));
    }
}