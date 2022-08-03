package obiektowe.collections.Sets;

public class Main {
    public static void main(String[] args) {
        Restaurant restaurant = new Restaurant();

        Dish pizza = new Dish("Pizza",30,800,DishType.DINNER);
        Dish lasagne = new Dish("Lasagne",24,600,DishType.DINNER);
        Dish hamburger = new Dish("Hamburger",18,450,DishType.DINNER);
        Dish cake = new Dish("Cake",15,300,DishType.APPETIZER);
        Dish soup = new Dish("Soup",10,120,DishType.BREAKFAST);
        Dish soup3 = soup;
        Dish soup2 = new Dish("Soup",10,120,DishType.BREAKFAST);

        restaurant.addDish(pizza);
        restaurant.addDish(lasagne);
        restaurant.addDish(hamburger);
        restaurant.addDish(cake);
        restaurant.addDish(soup);

        restaurant.addDish(soup2);
        restaurant.addDish(soup3);

        System.out.println(restaurant);

        try {
            System.out.println(restaurant.findDish("Soup"));
        } catch (RestaurantException e) {
            System.out.println(e);
        }

        System.out.println(restaurant.findDishesByType(DishType.DINNER));

    }
}
