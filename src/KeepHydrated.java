public class KeepHydrated {
    public static int litres(double time) {
        return (int) Math.floor(time * 0.5);
    }
public static void main(String[] args) {
        System.out.println(litres(10));
        System.out.println(litres(3));
        System.out.println(litres(6.7));
    }
}
