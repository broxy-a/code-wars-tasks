package SevenKyu;
import java.util.ArrayList;

public class NickNameSecond {
    public static String nickname(String name) {
        ArrayList<Character> vowels = new ArrayList<>();
        vowels.add('a');
        vowels.add('e');
        vowels.add('i');
        vowels.add('o');
        vowels.add('u');
        
        if (name.length() < 4) {
            return "Error: Name too short";
        }
        return vowels.contains(name.charAt(2)) ? name.substring(0, 4) : name.substring(0, 3);
    }
    public static void main(String[] args) {
        System.out.println(nickname("Robert"));
        System.out.println(nickname("Kimberly"));
        System.out.println(nickname("Samanta"));

        System.out.println(nickname("Jeannie"));
        System.out.println(nickname("Douglas"));
        System.out.println(nickname("Gregory"));
    }
}
