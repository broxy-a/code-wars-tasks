import java.util.HashMap;

public class RomanToInt {
    public int romanToInt(String s) {
        int total = 0;
        HashMap<Character, Integer> numbers = new HashMap<>();
        numbers.put('I', 1);
        numbers.put('V', 5);
        numbers.put('X',10);
        numbers.put('L', 50);
        numbers.put('C', 100);
        numbers.put('D', 500);
        numbers.put('M', 1000);

        for (int i = 0; i < s.length(); i++) {
            int currentValue = numbers.get(s.charAt(i));
            if (i + 1 < s.length() && currentValue < numbers.get(s.charAt(i + 1))) {
                total -= currentValue;
            } else {
                total += currentValue;
            }

            }
            return total;
        }
    public static void main(String[] args) {
        RomanToInt converter = new RomanToInt();
    System.out.println("III " + converter.romanToInt("III"));    
    System.out.println("IV " + converter.romanToInt("IV"));     
    System.out.println("IX " + converter.romanToInt("IX"));      
    System.out.println("LVIII " + converter.romanToInt("LVIII")); 
    System.out.println("MCMXCIV " + converter.romanToInt("MCMXCIV"));
    }
}
