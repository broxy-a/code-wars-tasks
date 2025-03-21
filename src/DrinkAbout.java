public class DrinkAbout {
    public static String peopleWithAgeDrink(int age) {
        return age < 14 ? "drink toddy" : age < 18 ? "drink coke" : age < 21 ? "drink beer" : (age >= 21 ? "drink whisky" : "");
    }
    public static void main(String[] args) {
    System.out.println(peopleWithAgeDrink(13));  
    System.out.println(peopleWithAgeDrink(17));  
    System.out.println(peopleWithAgeDrink(13)); 
    System.out.println(peopleWithAgeDrink(17)); 
    System.out.println(peopleWithAgeDrink(19));  
    System.out.println(peopleWithAgeDrink(21));

    }   
}
