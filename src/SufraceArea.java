import java.util.Arrays;

public class SufraceArea {
    public static int[] getSize(int w, int h, int d) {
        int S = 2 * (w * h + w * d + h * d);
        int V = w * h * d;
        return new int[]{S, V};
    }
    public static void main(String[] args) {
        System.out.println(Arrays.toString(getSize(5, 15, 10)));
        System.out.println(Arrays.toString(getSize(4, 2, 6)));
        System.out.println(Arrays.toString(getSize(5, 5, 5)));
    }
}
