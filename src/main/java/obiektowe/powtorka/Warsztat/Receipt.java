package obiektowe.powtorka.Warsztat;

public class Receipt {
    private String title = "Tire repair";
    private int amount = 1;
    private String price = amount + "x100 zl";

    @Override
    public String toString() {
        return "Recipe{" +
                "title='" + title + '\'' +
                ", amount=" + amount +
                ", price='" + price + '\'' +
                '}';
    }
}
