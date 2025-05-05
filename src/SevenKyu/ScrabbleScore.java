package SevenKyu;

import java.util.HashMap;

public class ScrabbleScore {
    public static int scrabbleScore(String word) {
        /* В этой задаче надо написать код который считает очки за слово по правилам Scrabble
         */
        word = word.toUpperCase().strip(); // Перевод строки в верхний регистр и удаление всех пробелов.
        int score = 0;
        HashMap<Character, Integer> map = new HashMap<>();
        map.put('A', 1); map.put('G', 2); map.put('K', 5); // Все очки за буквы.
        map.put('E', 1); map.put('D', 2); map.put('J', 8);
        map.put('I', 1); map.put('B', 3); map.put('X', 8);
        map.put('O', 1); map.put('C', 3); map.put('Q', 10);
        map.put('U', 1); map.put('M', 3); map.put('Z', 10);
        map.put('L', 1); map.put('P', 3);
        map.put('N', 1); map.put('F', 4);
        map.put('R', 1); map.put('H', 4);
        map.put('S', 1); map.put('V', 4);
        map.put('T', 1); map.put('W', 4);
                         map.put('Y', 4);

        for (int i = 0; i < word.length(); i++) {  // Пройтись по каждому символу в строке

            if (map.containsKey(word.charAt(i))) {  // Если было найдено сходство
                score += map.get(word.charAt(i)); // Суммируем
            }
        }
        return score;
    }
    public static void main(String[] args) {
        System.out.println("Total points: " + scrabbleScore("cabbage"));
        System.out.println("Total points: " + scrabbleScore("Artorias"));
        System.out.println("Total points: " + scrabbleScore("Gael"));
        System.out.println("Total points: " + scrabbleScore("Oldrik"));
        System.out.println("Total points: " + scrabbleScore("Kalamit"));
    }
}
