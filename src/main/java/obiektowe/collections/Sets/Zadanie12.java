package obiektowe.collections.Sets;

import java.util.HashSet;
import java.util.Set;

public class Zadanie12 {
    public static void main(String[] args) {
        Set<String> dishes = new HashSet<>();
        dishes.add("Hamburger");
        dishes.add("Lasagne");
        dishes.add("Pizza");
        dishes.add("Soup");
        dishes.add("Cake");

        System.out.println(dishes);
        for (String dish : dishes) {
            System.out.println(dish.toUpperCase());
        }

    }
}
