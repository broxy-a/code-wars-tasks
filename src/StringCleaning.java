public class StringCleaning {
    static String stringClean(final String text) {
       return text.replaceAll("\\d", "");
        
    }
    public static void main(String[] args) {
        System.out.println(stringClean("Artorias9 has one broken 1arm!"));
        System.out.println(stringClean("123Dark 0Souls!"));
    }
}
