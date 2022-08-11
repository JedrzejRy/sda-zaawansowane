package obiektowe.io.task32;

import java.io.Serializable;

public class Product implements Serializable {
    private String name;
    private double price;
    private int amount;

    public Product() {
        this.name = "name";
        this.price = 13.0;
        this.amount = 2;
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", amount=" + amount +
                '}';
    }
}
