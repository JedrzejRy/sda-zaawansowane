package obiektowe.powtorka.postOffice;

import java.util.Arrays;

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


        Address address = new Address("Dobra",15,"05-125");
        Address address2 = new Address("Mila",7,"05-125");
        System.out.println(address);

        Letter letter = new Letter(address,address2);
        post.sendALetter(letter,6);
        Letter letter2 = new Letter(address2,address);
        post.sendALetter(letter,6);

        post.sendAllLetters();




    }
}
