package SevenKyu;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Validation24Hours {
    public static boolean validateTime(String time) {
        /* В данном задании нужно написать регулярное выражение, которое будет проверять валидность времени. Условия валидности:
        *   01:00 – корректно (часы и минуты с ведущими нулями)
        *   1:00 – корректно (часы могут быть без нуля)
        *   00:00 – корректно (полночь) */

        String regex = "^(0?[0-9]|1[0-9]|2[0-3]):([0-5][0-9])$"; // Регулярное выражение с шаблоном: часы от 0 до 23 (0 не обязателен), : - разделитель, минуты 0 до 59.
        Pattern pattern = Pattern.compile(regex); // Конструкция Pattern создает сам шаблон.
        Matcher matcher = pattern.matcher(time); // Конструкция Mather проверяет шаблон на заданной строке.
        return matcher.matches();
    }
    public static void main(String[] args) {
        System.out.println(validateTime("23:59"));
        System.out.println(validateTime("7:60"));
    }
}
