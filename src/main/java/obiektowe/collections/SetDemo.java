package obiektowe.collections;

import java.util.HashSet;
import java.util.Set;

public class SetDemo {
    public static void main(String[] args) {

        //sety nie przechowuja powtorek elementow
        //kolejnosc w HashSetach jest przypadkowa/nieoczywista - nie mozna na niej polehac ani wykorzystywac
        Set<String> zwierzeta = new HashSet<>();
        zwierzeta.add("Krowa");
        zwierzeta.add("Pies");
        zwierzeta.add("Kon");
        zwierzeta.add("Okon");
        zwierzeta.add("Krowa");

        System.out.println(zwierzeta);

        //zwierzeta.get(0) - nie dziala

        for (String s : zwierzeta) {
            System.out.println(s);
        }

        System.out.println(zwierzeta.contains("Pies"));

        Object object = new Object();
        System.out.println(object);
        //hash to jest liczbowa reprezentacja objektu - hashe mozliwe rownomiernie wykorzystuja zakres int
        //hash dwoch roznych objektow moze byc taki sam
        // sa czesto wyrazone w systemie heksadecymalnym (16)
    }
}
