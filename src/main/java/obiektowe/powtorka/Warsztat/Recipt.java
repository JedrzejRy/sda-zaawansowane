package obiektowe.powtorka.Warsztat;

public class Recipt {
    private String title = "Tire repair";
    private int ammount = 1;
    private String price = ammount + "x100 zl";

    @Override
    public String toString() {
        return "Recipt{" +
                "title='" + title + '\'' +
                ", ammount=" + ammount +
                ", price='" + price + '\'' +
                '}';
    }
}
