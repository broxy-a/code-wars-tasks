package SevenKyu;
import java.util.*;

public class PartialWorldSearching {
    static String[] findWord(String x, String[] y){
        /* В этой задаче надо найти все строки в массиве, в которых содержится строка запрос. Например:
        * x = "me";
        * y = ["home", "milk", "Mercury", "fish"]
        * result = ["home", "Mercury"]
         */

        x = x.toLowerCase();
        ArrayList<String> list = new ArrayList<>();
        /* Создаем список для результата т.к:
        * Список динамичекий и при появлении новых данных, можно спокойно его расширить
        * Не нужно морочить голову с размером массива
        * И список позволит пройтись по элементам один раз
         */

        for (int i = 0; i < y.length; i++) {
            if (y[i].toLowerCase().contains(x)) { // Если элемент массива, содержит строку х то
                list.add(y[i]);
            }
        }
        if (list.isEmpty()) { // Если список пуст, то вернуть один элемент - "Empty", это условие задачи
            list.add("Empty");
        }

        return list.toArray(new String[list.size()]);  // Вернуть список, преобразованный в массив.
    }


    public static void main(String[] args) {
            String[] words = {"Artorias", "Gwin", "gwynevere"};
            String x = "gw";

            String[] found = findWord(x, words);
            for (String word : found) {
                System.out.println(word);
            }
    }

}
