package SevenKyu;

public class ShiftLeft {
    public static int shiftLeft(String a, String b) {
        /* Нужно определить минимальное кол-во ходов, чтобы строки были одинаковы.
        Так же нужно удалять первый символ из строки (условие задачи)
        * a = cat; b = bat;
        * result = 2;
         */

        // Если строки равны, сразу вернуть 0
        if (a.equals(b)) return 0;
        int i = a.length() - 1; // Последний символ строки "a"
        int j = b.length() - 1; // Последний символ строки "b"

        // Пока i и j не вышли за границы строк и сиволы a и b совпадают
        while (i >= 0 && j >= 0 && a.charAt(i) == b.charAt(j)) {
            // Двигаемся с конца строки, к началу
            i--;
            j--;
        }
        /* После выхода из цикла:
        * j + 1 — количество символов перед общим суффиксом в b.
        * i + 1 — количество символов перед общим суффиксом в a.
        * Их сумма - общее количество удалений, чтобы строки были равны
         */
        return (i + 1) + (j + 1);
    }

    public static void main(String[] args) {
        System.out.println(shiftLeft("M", "M"));
        System.out.println(shiftLeft("test", "west"));
        System.out.println(shiftLeft("artorias", "gwyn"));
    }
}
