package obiektowe.functionalProgramming.task3;

import java.beans.Customizer;
import java.util.Comparator;
import java.util.Random;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Main {
    public static void main(String[] args) {

        Supplier randomNumber = () -> new Random().nextInt(10) + 1;

        System.out.println(randomNumber.get());

        Comparator<String> stringComparator = (String text, String text2) -> {
            if (text.length() == text2.length()) {
                return 0;
            }
            return 1;
        };

        Predicate<String> isBiggerThanFive = text -> text.length() >= 5;
        if(isBiggerThanFive.test("asgdfsas")){
            System.out.println("Conajmniej 5");
        }else {
            System.out.println("Mniej niz 5");
        }

    }
}
