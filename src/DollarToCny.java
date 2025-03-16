public class DollarToCny {
    public static String usdcny(int usd) {
    double cny = 6.75;
        double usdToCny = usd * cny;
        String result = String.format("%.2f", usdToCny) + " Chinese Yuann";
        return result;  
    }
    public static void main(String[] args){
        System.out.println(usdcny(390));
        System.out.println(usdcny(10));
        System.out.println(usdcny(5));
    }
}