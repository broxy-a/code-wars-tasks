public class ArraySearch {
    public static boolean check(Object[] a, Object x) {
      for (int i = 0; i < a.length; i++ ) {
        if (a[i].equals(x)) {
          return true;
        }
      }
    return false;
  }
    public static void main(String[] args) {
      System.out.println(ArraySearch.check(new Object[]{66, 101}, 66));
      System.out.println(ArraySearch.check(new Object[]{55, 101}, 66));
    }
}