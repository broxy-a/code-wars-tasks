public class PersonalizedMessage {
    static String greet(String name, String owner) {
        return name.equals(owner) ? "Hello boss" : "Hello guest";
    }
    public static void main(String[] args) {
        System.out.println(greet("Gwynevere", "Gwynevere"));
        System.out.println(greet("Gael", "Artorias"));
    }
}
