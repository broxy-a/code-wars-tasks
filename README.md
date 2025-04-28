# 🧠 CodeWars Java задачи с пояснениями.

Сборник кратких разборов популярных задач с сайта [CodeWars](https://www.codewars.com/) на языке Java. Каждая задача сопровождается примером и ключевыми моментами реализации.

---

## 📝 addLength

Этот код вычисляет длину строки в массиве и передает её в формате:

```java
addLength("Manus Gwin Artorias Sif ") ➝ ["Manus 5", "Gwin 4", "Artorias 8", "Sif 3"]

🔹 Основные моменты:
    📌 Разделение строки на слова с помощью split(" ").
    📌 Создание нового массива для хранения слов и их длины.
    📌 Перебор массива слов циклом for, вычисление длины слова с word + " " + word.length().
    📌 Сохранение результата в новый массив и его возвращение.

🔍 ArraySearch

Этот код проверяет, содержится ли заданный элемент в массиве.

ArraySearch.check(new Object[]{66, 101}, 66); ➝ true  
ArraySearch.check(new Object[]{55, 101}, 66); ➝ false

🔹 Основные моменты:
    📌 Статический метод check(Object[] a, Object x)
    📌 Перебор массива с помощью for
    📌 Сравнение элементов с объектом x
    📌 Возвращает true, если x найден, иначе false.

💲 DollarToCny

Этот код конвертирует доллары в юани и возвращает результат в формате строки.

usdcny(390) → "2632.50 Chinese Yuan"
usdcny(10) → "67.50 Chinese Yuan"
usdcny(5) → "33.75 Chinese Yuan"

🔹 Основные моменты:
    📌 Объявление курса юаня к доллару: double cny = 6.75;
    📌 Умножение переданного количества долларов на курс: usd * cny;
    📌 Форматирование результата с двумя знаками после запятой
    📌 Конкатенация строки: String.format("%.2f", usdToCny;

🪜 DrawStairs

Этот код рисует лестницу из символов "I":

draw(6) → 
I  
 I  
  I  
   I  
    I  
     I

🔹 Основные моменты:
    📌 Используется цикл for, который проходит n раз.
    📌 В каждой итерации добавляется i пробелов (.repeat(i)) перед символом "I".
    📌 После каждого "I" (кроме последнего) добавляется символ перевода строки "\n".

🍹 DrinkAbout

Определяет, какой напиток подходит человеку по возрасту:

peopleWithAgeDrink(13) → "drink toddy"  
peopleWithAgeDrink(17) → "drink coke"  
peopleWithAgeDrink(19) → "drink beer"  
peopleWithAgeDrink(21) → "drink whisky"

⚖️ EvenOrOdd

Проверка, является ли число четным или нечетным:

evenOrOdd(5) → "Odd"  
evenOrOdd(4) → "Even"

🔹 Основные моменты:
    📌 Тернарный оператор проверяет четность (% 2 == 0)
    📌 Метод возвращает "Even" или "Odd"

💧 KeepHydrated

Сколько литров воды нужно выпить:

litres(10) → 5  
litres(3) → 1  
litres(6.7) → 3

🔹 Основные моменты:
    📌 Метод litres(double time)
    📌 Расчет: 0.5 литров в час
    📌 Округление вниз через Math.floor()

🍞 MakingSixToast

Сколько тостов нужно добавить или убрать:

sixToast(12) → 6  
sixToast(7) → 1  
sixToast(1) → 5

🔹 Основные моменты:
    📌 Метод sixToast(int num)
    📌 Разница: Math.abs(num - 6)
    📌 Возвращается int

🧼 StringCleaning

Удаляет все цифры из строки:

stringClean("Artorias9 has one broken 1arm!") → "Artorias has one broken arm!"  
stringClean("123Dark 0Souls!") → "Dark Souls!"

🔹 Основные моменты:
    📌 Используется replaceAll("\\d", "")
    📌 Удаляет все цифры, не трогая остальной текст

🔁 StringRepeat

Повторяет заданную строку n раз:

repeatStr(5, "Artorias") → "ArtoriasArtoriasArtoriasArtoriasArtorias"
repeatStr(3, "Souls") → "SoulsSoulsSouls"
repeatStr(0, "Knight") → ""

🔹 Основные моменты:
    📌 Метод repeatStr(int repeat, String string)
    📌 Используется string.repeat(n)

➕ SumTheStrings

Сложение чисел в виде строк:

sumStr("4", "5") → "9"  
sumStr("34", "5") → "39"  
sumStr("", "") → "0"  
sumStr("2", "") → "2"

🔹 Основные моменты:
    📌 Преобразование: Integer.parseInt()
    📌 Если строка пуста → 0
    📌 Возврат через String.valueOf()

📦 SurfaceAreaAndVolume

Площадь поверхности и объем коробки:

getSize(5, 15, 10) → [550, 750]  
getSize(1, 1, 1) → [6, 1]  
getSize(5, 5, 5) → [150, 125]

🔹 Основные моменты:
    📌 Формулы: S = 2*(w*h + w*d + h*d), V = w*h*d
    📌 Возврат в массиве {S, V}

❤️ CheckAlive

Проверяет, жив ли игрок:

checkAlive(5) → true  
checkAlive(0) → false

🔹 Основные моменты:
    📌 Если health > 0, возвращает true
    📌 Иначе false

📊 BetterThanAverage

Выше ли твоя оценка среднего:

betterThanAverage(new int[]{2, 3}, 5) → true  
betterThanAverage(new int[]{2, 3}, 1) → false

🔹 Основные моменты:
    📌 Вычисляет среднее значение
    📌 Сравнивает с твоей оценкой

🏷️ NickName

Создание никнейма по имени:

nickname("Robert") → "Rob"  
nickname("Samanta") → "Sam"  
nickname("Jeannie") → "Jean"  
nickname("Al") → "Error: Name too short"

🔹 Основные моменты:
    📌 Учет третьей буквы — гласная или нет
    📌 Использование if-else или тернарного оператора

📏 Longest Word

Находит самое длинное слово в строке:

longestWord("red blue gold") → "gold"  
longestWord("red white blue") → "white"  
longestWord("a bb ccc") → "ccc"

🔹 Основные моменты:
    📌 Возвращает последнее самое длинное слово
    📌 Работает за O(n) — где n количество слов

♻️ Roman Numerals Converter

Преобразует римские числа в целые:

"III" → 3  
"IV" → 4  
"IX" → 9  
"LVIII" → 58  
"MCMXCIV" → 1994

🔹 Основные моменты:
    📌 Использует HashMap
    📌 Учитывает правила римской записи
    📌 Сложность O(n)

🎓 Final Grade

Вычисляет итоговую оценку студента:

finalGrade(100, 12) → 100  
finalGrade(99, 0) → 100  
finalGrade(85, 5) → 90  
finalGrade(55, 3) → 75  
finalGrade(55, 0) → 0

🔹 Основные моменты:
    📌 Простой if-else без лишней логики
    📌 Учет баллов за экзамен и проектов
    📌 Возврат 0, если низкий балл и мало проектов

📜 Scrolling Text

Генерирует вращения строки в верхнем регистре:

[CODEWARS, ODEWARSC, DEWARSCO, EWARSCOD, WARSCODE, ARSCODEW, RSCODEWA, SCODEWAR]
[ARTORIAS, RTORIASA, TORIASAR, ORIASART, RIASARTO, IASARTOR, ASARTORI, SARTORIA]
[BONFIRE, ONFIREB, NFIREBO, FIREBON, IREBONF, REBONFI, EBONFIR]

🔹 Основные моменты:
    📌 Преобразование в верхний регистр
    📌 Генерация циклических сдвигов
    📌 Количество элементов = длине строки

🏷️ Personalized Greeting

Выводит персональное приветствие:

greet("Gwynevere", "Gwynevere") → "Hello boss"

🔹 Основные моменты:
    📌 Сравнение имени гостя и владельца
    📌 Возврат специального приветствия

🔢 RegexpBasics – IsDigit

Этот код проверяет, является ли переданная строка одной цифрой от 0 до 9:

isDigit("5")     → true  
isDigit("hello") → false  
isDigit("10")    → false  
isDigit("0")     → true

🔹 Основные моменты:
    📌 Метод isDigit(String s) проверяет, содержит ли строка только одну цифру.
    📌 Сначала проверяется, что длина строки равна 1 (s.length() == 1).
    📌 Затем используется метод s.matches("\\d") для проверки, что символ — цифра (0-9).
    📌 Используется тернарный оператор для краткой записи условий.
    📌 Возвращает true, если условие выполнено, иначе false.

❗ ReplaceVowelsWithExclamations

Этот код заменяет все гласные буквы в строке на восклицательные знаки.

replace("Hi!")         → "H!!"  
replace("!Hi! Hi!")    → "!H!! H!!"  
replace("aeiou")       → "!!!!!"  
replace("ABCDE")       → "!BCD!"

🔹 Основные моменты:
    📌 Метод replace(String s) принимает строку.
    📌 Все гласные символы (a, e, i, o, u в любом регистре) заменяются на "!".
    📌 Используется StringBuilder для построения новой строки.
    📌 Проход по каждому символу строки с помощью цикла for.
    📌 Проверка, входит ли символ в строку vowel, содержащую гласные.
    📌 Если входит — добавляется "!", иначе — сам символ.

⏰ Validation24Hours

Этот код проверяет корректность времени суток с помощью регулярного выражения.

(validateTime("23:59")); -> true
(validateTime("7:60")); -> false
(validateTime("01:00") -> true
(validateTime("13:1") -> false

🔹 Основные моменты:
    📌 Использует конструкцию Pattern для создания шаблона по которому проверяется время.
    📌 Использует конструкцию Matcher для проверки строки заданным шаблоном.
    📌 Метод matches() возвращает true только при полном соответствии
