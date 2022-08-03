package obiektowe.collections.Sets;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Restaurant {
    private final Set<Dish> menu = new HashSet<>();

    public void addDish(Dish dish) {
        menu.add(dish);
    }

    public void removeDish(Dish dish) {
        menu.remove(dish);
    }

    public Dish findDish(String dishName) throws RestaurantException {
        for (Dish dish : menu) {
            if (dish.getName().equals(dishName)) {
                return dish;
            }
        }
        throw new RestaurantException();
    }

    public List<Dish> findDishesByType(DishType dishType) {
        List<Dish> dishList = new ArrayList<>();
        for (Dish dish : menu) {
            if (dish.getDishType() == dishType) {
                dishList.add(dish);
            }
        }
        return dishList;
    }


    @Override
    public String toString() {
        return menu.toString();
    }
}
