public class GrassHoper {
    public static boolean checkAlive(int health) {
        if (health > 0) {
            return true;
        }
            return false;
    }
    public static void main(String[] args) {
        System.out.println(checkAlive(0));
        System.out.println(checkAlive(5));
    }
}
