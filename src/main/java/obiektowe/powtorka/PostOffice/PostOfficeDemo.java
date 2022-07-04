package obiektowe.powtorka.PostOffice;

public class PostOfficeDemo {
    public static void main(String[] args) {
        double price = 0;
        Package paczka = new Package();
        System.out.println(paczka.toString());
        System.out.println(paczka.priceTag(paczka.getWeight(),paczka.isPriority()));
        Package paczka2 = new Package("Klaudia Nos", "Kamil Bak", 1);
        System.out.println(paczka2.toString());
        Package paczka4 = new Package("", "", 5);
        System.out.println(paczka4.toString());
        Package paczka5 = null;
        paczka5 = paczka;
        System.out.println(paczka5.toString());
        System.out.println();

        Package[] packages = new Package[]{paczka, paczka2, paczka4};
        System.out.println(packages[1].toString());

        Package[] packages1 = new Package[100];
        for (int i = 0; i < 100; i++) {
            packages1[i] = new Package();
        }
        for (Package c : packages1) {
            System.out.println(c.toString());
            price += c.priceTag(c.getWeight(), c.isPriority());
        }
        System.out.println(price);
        System.out.println();

        Post post = new Post();
        Package gift = post.createAPackage();
        System.out.println(gift.priceTag(gift.getWeight(), gift.isPriority()));
        post.sendAPackage(gift,20);
        System.out.println(gift.toString());




    }
}
