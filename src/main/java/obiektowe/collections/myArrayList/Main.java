package obiektowe.collections.myArrayList;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> myList = new MyArrayList<>();
        String text = "TEST";
        String text2 = "TESTx2";
        String text3 = "TESTx3";
        myList.add(text);
        System.out.println(myList);

        myList.add(text2);
        System.out.println(myList);

        myList.set(1,text3);
        System.out.println(myList);
        System.out.println();

        myList.add(1,text);
        System.out.println(myList);

        myList.remove(1);
        System.out.println(myList);

        System.out.println(myList.get(1));

        System.out.println(myList.size());

        System.out.println(myList.isEmpty());

        List<String> myList2 = new MyArrayList<>();
        System.out.println(myList2.isEmpty());

        System.out.println(myList.contains(text));

        System.out.println(myList.contains(text2));

        List<String> lista = new ArrayList<>();
        System.out.println(lista);
    }
}
