public class MakingSixToast {
    public static int sixToast(int num){
        int defference = num - 6; 
        int removeOrAdd = Math.abs(defference);
        return removeOrAdd;
    }
    public static void main(String[] args) {
        System.out.println(sixToast(12));
        System.out.println(sixToast(7));
        System.out.println(sixToast(1));
    }
}
