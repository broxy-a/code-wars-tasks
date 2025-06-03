package SevenKyu;

public class HeronsFormula {
    public static double heron(int a, int b, int c) {
        double s = (a + b + c) / 2.0;
        double square = Math.sqrt(s * (s - a) * (s - b) * (s - c));
        return square;
    }

    public static void main (String[] args) {
        System.out.println(heron(77, 5, 81));
    }
}
