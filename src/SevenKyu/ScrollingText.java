package SevenKyu;

import java.util.ArrayList;
import java.util.Arrays;

public class ScrollingText {
    public static String[] scrollingText(String text) {
       text = text.toUpperCase();
       ArrayList<String> result = new ArrayList<>();

       for (int i = 0; i < text.length(); i++) {
            result.add(text.substring(i) + text.substring(0, i));
       }
       return result.toArray(new String[0]);
    }
    public static void main(String[] args) {
        System.out.println(Arrays.toString(scrollingText("codewars")));
        System.out.println(Arrays.toString(scrollingText("artorias")));
        System.out.println(Arrays.toString(scrollingText("bonfire")));
    }
}
