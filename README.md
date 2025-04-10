Здесь описание всех задач которые я решаю на CodeWars.

## 📝 addLength

Этот код вычисляет длину строки в массиве и передает её в формате:

```java
addLength("Manus Gwin Artorias Sif ") ➝ ["Manus 5", "Gwin 4", "Artorias 8", "Sif 3"]

🔹 Основные моменты:
    📌 Разделение строки на слова с помощью split(" ").
    📌 Создание нового массива для хранения слов и их длины.
    📌 Перебор массива слов циклом for, вычисление длины слова с word + " " + word.length().
    📌 Сохранение результата в новый массив и его возвращение.

## 🔍 ArraySearch

Этот код проверяет, содержится ли заданный элемент в массиве.

ArraySearch.check(new Object[]{66, 101}, 66); ➝ true
ArraySearch.check(new Object[]{55, 101}, 66); ➝ false   

🔹 Основные моменты:
    📌 Статический метод check(Object[] a, Object x)
    📌 Перебор массива с помощью for
    📌 Сравнение элементов с объектом x
    📌 Возвращает true, если x найден, иначе false.

## 💲 DollarToCny

Этот код конвертирует доллары в юани и возвращает результат в формате строки.

usdcny(390) → "2632.50 Chinese Yuan"
usdcny(10) → "67.50 Chinese Yuan"
usdcny(5) → "33.75 Chinese Yuan"

🔹 Основные моменты:
    📌 Объявление курса юаня к доллару: double cny = 6.75;
    📌 Умножение переданного количества долларов на курс: usd * cny;
    📌 Форматирование результата с двумя знаками после запятой
    📌 Конкатенация строки для возврата нужного результата: String.format("%.2f", usdToCny);

## 🪜 DrawStairs

Этот код рисует лестницу из символов `"I"`, добавляя пробелы перед каждой следующей ступенью.

draw(6) → 
I
 I
  I
   I
    I
     I

🔹 Основные моменты:
    📌 Используется цикл for, который проходит n раз.
    📌 В каждой итерации добавляется i пробелов(.repeat(i)); перед символом "I", создавая эффект сдвига.
    📌 После каждого "I" (кроме последнего) добавляется символ перевода строки "\n".
    📌 Итоговая строка сохраняется в переменной result.

## 🍹 DrinkAbout

Этот код определяет, какой напиток подходит человеку в зависимости от его возраста.

peopleWithAgeDrink(13) → "drink toddy"
peopleWithAgeDrink(17) → "drink coke"
peopleWithAgeDrink(19) → "drink beer"
peopleWithAgeDrink(21) → "drink whisky"

🔹 Основные моменты:
    📌 Метод принимает int age - возраст, и возвращает строку с напитком.
    📌 Используется тернанрный оператор, который проверяет возраст и выбирает нужный напиток.
    📌 Код короткий и не содержит лишних if-else.

## ⚖️ EvenOrOdd

Этот код проверяет, является ли число четным или нечетным.

evenOrOdd(5) → "Odd"
evenOrOdd(4) → "Even"

🔹 Основные моменты:
    Метод принимает число int и возвращает "Even" или "Odd".
    Используется тернарный оператора, который проверяет четность числа.
    Не используется if-else.

## 💧 KeepHydrated

Этот код вычисляет, сколько литров воды нужно выпить за заданное время.

litres(10) → 5
litres(3) → 1
litres(6.7) → 3

🔹 Основные моменты:
    📌 Метод принимает количество часов litres(double time).
    📌 Человек выпиывает 0.5 литров воды в час.
    📌 Количество литров округляется вниз с помощь метода Math.flor().
    📌 Возвращает целое число int.

## 🍞 MakingSixToast

Этот код вычисляет, сколько тостов нужно добавить или убрать, чтобы получилось ровно **6**.

sixToast(12) → 6
sixToast(7) → 1
sixToast(1) → 5

🔹 Основные моменты:
    📌 Метод sixToast(int num) принимает текущее количество тостов.
    📌 Вычисляется разница между num и 6.
    📌 Используется Math.abs(), чтобы получить модуль разницы — число тостов, которые нужно добавить или убрать.
    📌 Возвращается целочисленный результат (int).

## 🧼 StringCleaning 

Этот код удаляет все цифры из строки, оставляя остальные символы без изменений.

stringClean("Artorias9 has one broken 1arm!") → "Artorias has one broken arm!"
stringClean("123Dark 0Souls!") → "Dark Souls!"

🔹 Основные моменты:
    📌 Метод stringClean(String text) принимает строку.
    📌 Для удалений цифр используется реуглярное выражение \\d, которое находится все цифры.
    📌 Метод replaceAll("\\d", "") удаляет найденные цифры, оставляя пробелы и знаки препинания.
    📌 Возвращается чистая строка.

## 🔁 StringRepeat

Этот код повторяет заданную строку **n** раз.

repeatStr(5, "Artorias") → "ArtoriasArtoriasArtoriasArtoriasArtorias"
repeatStr(3, "Souls") → "SoulsSoulsSouls"
repeatStr(0, "Knight") → ""

🔹 Основные моменты:
    📌 Метод repeatStr(int repeat, String string) принимает количество повторений (int), и саму строку (string).
    📌 С помощью метода repeat(n), дублируется строка n раз.
    📌 Если количество повторений 0, repeat == 0, возвращается пустая строка.

## ➕ SumTheStrings

Этот код выполняет сложение строк, содержащих числа, и возвращает результат в виде строки.

sumStr("4", "5") → "9"
sumStr("34", "5") → "39"
sumStr("", "") → "0"
sumStr("2", "") → "2"

🔹 Основные моменты:
    📌 Метод sumStr(String a, String b), принимает две строки, которые содержат числа.
    📌 Если строка пуста, вернуть 0.
    📌 Для преобразования строки в число, помогает метод Integer.parseInt().
    📌 Результат преобразуется обратно в строку String.valueOf(result).

## 📦 SurfaceAreaAndVolume

Этот код вычисляет площадь поверхности и объем прямоугольного параллелепипеда (коробки) и возвращает их в виде массива.

getSize(5, 15, 10) → [550, 750]  
getSize(1, 1, 1) → [6, 1]  
getSize(5, 5, 5) → [150, 125]

🔹 Основные моменты:
    📌 Метод getSize(int w, int h, int d) принимает три целых числа: ширину, высоту и глубину.
    📌 Вычисляет площадь поверхности по формуле: S = 2 * (w * h + w * d + h * d).
    📌 Вычисляет объем по формуле: V = w * h * d;
    📌 Возвращает результат в виде массива {S, V}.

## ❤️ CheckAlive

Этот код проверяет, жив ли игрок, исходя из его уровня здоровья.

checkAlive(5) → true  
checkAlive(0) → false

🔹 Основные моменты:
    📌 Метод checkAlive(int health) принимает один целочисленный параметр health, который варьируется от -10 до 10.
    📌 Если health больше 0, возвращает true (игрок жив).
    📌 Если health равно 0 или меньше, возвращает false (игрок мёртв).
    📌 Используется конструкция if/else для проверки условий.

## 📊 BetterThanAverage

betterThanAverage(new int[]{2, 3}, 5) → true
betterThanAverage(new int[]{2, 3}, 1) → false

🔹 Основные моменты:
    📌 Метод принимает массив оценок класса и твою оценку.
    📌 Вычисляет средний балл (сумма / количество).
    📌 Возвращает true, если твоя оценка выше среднего, иначе false.
    📌 Сравнивает твою оценку со средним баллом.

## 🏷️ NickName

Этот код создает никнейм из переданного имени, обрезая его в зависимости от третьей буквы.

nickname("Robert")  → "Rob"  
nickname("Samanta")  → "Sam"  
nickname("Jeannie")  → "Jean"    
nickname("Al")    → "Error: Name too short"  

🔹 Основные моменты:
    📌 В первом решении используется if-else, это делает код более длинным, но в тоже время более читаемым.
    📌 Гласные буквы хранятся в списке ArrayList.
    📌 Если третья буква есть в списке гласных → берем 4 буквы, иначе 3.
    📌 Во втором примере используется тернанрый оператор, это делает код коротким.

## 📏 Longest Word

Этот код находит самое длинное слово в строке. Если есть несколько слов одинаковой длины, возвращает последнее из них.

longestWord("red blue gold")   → "gold"  
longestWord("red white blue")  → "white"  
longestWord("a bb ccc")        → "ccc"

🔹 Основные моменты:
    📌 Учитывает пробелы между словами
    📌 Возвращает первое встреченное слово, если все одинаковой длины
    📌 Читаемый и простой алгоритм без сложных условий
    📌 Работает за O(n), где n - количество слов

## ♻️ Roman Numerals Converter

Этот код преобразует римские числа в целочисленные значения, следуя историческим правилам записи.

"III" → 3
"IV" → 4
"IX" → 9
"LVIII" → 58
"MCMXCIV" → 1994

🔹 Основные моменты:
    📌 Использует HashMap для быстрого доступа к значениям символов
    📌 Временная сложность: O(n), где n - длина строки
    📌 Четко обрабатывает все стандартные римские цифры (от I до M)

## 🎓 Final Grade

Этот код вычисляет итоговую оценку студента на основе двух параметров оценки за экзамен и количества завершённых проектов.

finalGrage(100, 12) → 100  
finalGrage(99, 0) → 100  
finalGrage(85, 5) → 90  
finalGrage(55, 3) → 75  
finalGrage(55, 0) → 0  

🔹 Основные моменты:
    📌 Простой и понятный if-else без лишней логики
    📌 Чётко обрабатывает все граничные условия
    📌 Итоговая оценка зависит от двух факторов — балла за экзамен и количества выполненных проектов
    📌 Если студент не проявил активности (низкий балл и мало проектов), результат — 0

## 📜 Scrolling Text

Эта функция принимает строку и возвращает массив всех возможных вращений данной строки, преобразованных в верхний регистр.

[CODEWARS, ODEWARSC, DEWARSCO, EWARSCOD, WARSCODE, ARSCODEW, RSCODEWA, SCODEWAR]
[ARTORIAS, RTORIASA, TORIASAR, ORIASART, RIASARTO, IASARTOR, ASARTORI, SARTORIA]
[BONFIRE, ONFIREB, NFIREBO, FIREBON, IREBONF, REBONFI, EBONFIR]

🔹 Основные моменты:
    📌 Преобразует входную строку в верхний регистр
    📌 Генерирует все возможные циклические сдвиги строки
    📌 Каждый следующий элемент - строка, сдвинутая на 1 символ влево
    📌 Количество элементов в массиве равно длине входной строки

## ✨ Персонализированное приветствие

Этот код генерирует приветственное сообщение в зависимости от того, является ли пользователь владельцем.

greet("Gwynevere", "Gwynevere") → "Hello boss"  
greet("Gael", "Artorias") → "Hello guest"

🔹 Основные моменты:
    📌 Используется тернарный оператор для компактной записи условия
    📌 Сравнение имён происходит через equals() для точного совпадения
    📌 Чистая функция без побочных эффектов
    📌 Идеально подходит для систем аутентификации и персональных приветствий

##
