package obiektowe.functionalProgramming.task2;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Printer scream = text -> text.toUpperCase() + "!";
        System.out.println(scream.print("Koza i kaczka"));

        Printer firstLetters = text -> {
            String result = "";
            List<String> list = new ArrayList<>(List.of(text.split(" ")));
            for (String letter : list) {
                char charAt = letter.charAt(0);
                result += charAt;
            }
            return result;

        };

        System.out.println(firstLetters.print("Janek i Arek poszli do sklepu kupić bułki"));
    }

    interface Printer {
        public String print(String text);
    }

}
