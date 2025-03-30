package SevenKyu;

public class InspitingString {
    public static String longeWord(String wordString) {
        String[] words = wordString.split(" ");
        String longWord = "";
        
        for (int i = 0; i < words.length; i++)  {
           if (words[i].length() >= longWord.length()) {
                longWord = words[i];
           }
        }
        return longWord;
    }
    public static void main(String[] args) {
        System.out.println(longeWord("red blue gold"));
        System.out.println(longeWord("red whie blue"));
    }
}
