public class HowGoodAreYou {
    public static boolean betterThanAverage(int[] classPoints, int yourPoints) {
        int sum = 0;
        for (int i = 0; i < classPoints.length; i++) {
          sum = sum + classPoints[i];
    }
        int GPA = sum / classPoints.length;
        return yourPoints > GPA ? true : false;
      }
    
    public static void main(String[] args) {
        System.out.println(HowGoodAreYou.betterThanAverage(new int[]{2, 3}, 5));
        System.out.println(HowGoodAreYou.betterThanAverage(new int[]{2, 3}, 1));
    }

}