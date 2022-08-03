package obiektowe.collections.Sets;

import java.util.Objects;

public class Dish {
    private String name;
    private int price;
    private int kcal;
    private DishType dishType;

    public Dish(String name, int price, int kcal, DishType dishType) {
        this.name = name;
        this.price = price;
        this.kcal = kcal;
        this.dishType = dishType;
    }

    public String getName() {
        return name;
    }

    public DishType getDishType() {
        return dishType;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Dish dish = (Dish) o;
        return price == dish.price && kcal == dish.kcal && Objects.equals(name, dish.name) && dishType == dish.dishType;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, price, kcal, dishType);
    }

    @Override
    public String toString() {
        return "Dish{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", kcal=" + kcal +
                ", dishType=" + dishType +
                '}';
    }
}
