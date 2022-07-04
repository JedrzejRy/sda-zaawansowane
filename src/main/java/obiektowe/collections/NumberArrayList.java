package obiektowe.collections;

import java.util.ArrayList;
import java.util.ListIterator;

public class NumberArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(12);
        numbers.add(23);
        numbers.add(11);
        numbers.add(53);
        numbers.add(64);
        numbers.add(89);
        System.out.println(numbers);

        System.out.println(numbers.contains(23));

        numbers.set(0,32);
        numbers.set(5,14);
        numbers.set(2,99);
        System.out.println(numbers);

        numbers.add(0,44);
        numbers.add(5,77);
        System.out.println(numbers);
        System.out.println(numbers.size());

        numbers.remove(2);
        numbers.remove(3);
        System.out.println(numbers);

        numbers.clear();
        System.out.println(numbers);

        System.out.println(numbers.size());


    }
}
