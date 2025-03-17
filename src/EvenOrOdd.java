public class EvenOrOdd {
    public static String evenOrOdd(int number) {
      String result = number % 2 == 0 ? "Even" : "Odd";
      return result;
    }
    public static void main(String[] args) {
        System.out.println(evenOrOdd(5));
    }
}