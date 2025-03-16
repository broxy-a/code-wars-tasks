import java.util.Arrays;

public class AddLength {
    public static String[] addLength(String str){
        String[] words = str.split(" ");
        String[] arrayWord = new String[words.length];
            for (int i = 0; i < words.length; i++) {
                String sumWord = words[i] + " " + words[i].length();
                arrayWord[i] = sumWord;
            }
            return arrayWord;
      }
    public static void main(String[] args) {
        System.out.println(Arrays.toString(addLength("Manus Gwin")));

    }
}