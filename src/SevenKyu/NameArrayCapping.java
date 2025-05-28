package SevenKyu;

public class NameArrayCapping {
    public static String[] capMe(String[] strings) {
        /* В этой задаче требуется написать функцию, которая:
        * Возвращает массив строк в котором первая буква всегда заглавная, а следуюющие строчные.
         */

        String[] upperArray = new String[strings.length];


        for (int i = 0; i < strings.length; i++) {
            if (strings[i].length() == 0) {
                upperArray[i] = strings[i];
            } else {
                // Основная логика которая переводит первый символ в вверхний регистр, а остальные символы в нижний при этом соединяя их.
                upperArray[i] = strings[i].substring(0, 1).toUpperCase().concat(strings[i].substring(1).toLowerCase());
            }
        }
        return upperArray;
    }

    public static void main(String[] args) {
        String[] names = {"artorias", "john", "KELVIN", "annA", ""};

        String[] result = capMe(names);

        for (String name : result) {
            System.out.println(name);
        }

    }
}
