public class FinalGrage {
    public static int finalGrage(int exam, int projects) {
        
        if (exam > 90 || projects > 10) {
            return 100;
        } else if (exam > 75 && projects >= 5) {
            return 90;
        } else if (exam > 50 && projects >= 2) {
            return 75;
        } else {
            return 0;
        }
        
    }

    public static void main(String[] args) {
        System.out.println(finalGrage(100, 12));
        System.out.println(finalGrage(99, 0));

        System.out.println(finalGrage(85, 5));
        System.out.println(finalGrage(55, 3));

        System.out.println(finalGrage(55, 0));
        
    }
}
