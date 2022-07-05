package obiektowe.collections;

import java.util.ArrayList;
import java.util.List;

public class ArrayListDemo {
    public static void main(String[] args) {
        String[] names = new String[3];
        names[0] = "Marcin";
        names[1] = "Julia";
        names[2] = "Adam";


        List<String> nameList = new ArrayList<>();
        System.out.println(nameList);
        System.out.println(nameList.size());
        nameList.add("Marcin");
        nameList.add("Julia");
        nameList.add("Adam");
        System.out.println(nameList);
        System.out.println(nameList.size());


        nameList.add(0, "Grzegorz");
        System.out.println(nameList);

        String element = nameList.get(0);
        System.out.println(element);

        nameList.set(1, "Zofia");
        System.out.println(nameList);

        nameList.remove(0);
        System.out.println(nameList);


        List<String> names2 = new ArrayList<>(List.of("Ada", "Ania", "Marek", "Marta"));
        names2.add("Daniel");
        System.out.println(names2);



    }
}
