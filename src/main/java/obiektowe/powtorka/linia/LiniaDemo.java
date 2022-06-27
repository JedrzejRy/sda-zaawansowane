package obiektowe.powtorka.linia;

public class LiniaDemo {
    public static void main(String[] args) {
        Linia linia = new Linia(15,"@");
        Linia linia2 = new Linia(20,"*");
        Linia linia3 = new Linia(8,"$");
        Linia liniatest = new Linia();

        linia.drukujLinie();
        linia2.drukujLinie();
        linia3.drukujLinie();
        liniatest.drukujLinie();
        System.out.println(liniatest.toString());
    }
}
