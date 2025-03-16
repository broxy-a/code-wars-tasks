public class DrawStairs {
  public static String draw(int n) {
    String result = "";
      for (int i = 0; i < n; i++) {
        result += " ".repeat(i);
          result += "I";

        if (i < n - 1) {
          result += "\n";
        }
      }
      return result;
  }
    public static void main(String[] args) {
      System.out.println(draw(6));
      
}

}