public class DrinkAbout {
    public static String peopleWithAgeDrink(int age) {
        if (age < 14) {
            return "drink toddy";
        } else if (age < 18) {
            return "drink coke";
        } else if (age < 21) {
            return "drink beer";
        } else if  (age >= 21) {
            return "drink whisky";
        }
        return "";
    }
    public static void main(String[] args) {
        System.out.println(peopleWithAgeDrink(13));  
    System.out.println(peopleWithAgeDrink(17));  
    System.out.println(peopleWithAgeDrink(19));  
    System.out.println(peopleWithAgeDrink(21));  

    }   
}