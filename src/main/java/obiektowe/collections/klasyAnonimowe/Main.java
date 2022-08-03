package obiektowe.collections.klasyAnonimowe;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Tree> forest = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            forest.add(new Tree());
        }
        Tree tree = new Tree(){
            @Override
            public void display() {
                System.out.println("Magical Tree!");
            }
        };
        forest.add(tree);
        Collections.shuffle(forest);
        for (Tree tree1 : forest) {
            tree1.display();
        }

        Equation addition = new Equation() {
            @Override
            public int execute(int number, int number2) {
                return number + number2;
            }
        };
        Equation subtraction = new Equation() {
            @Override
            public int execute(int number, int number2) {
                return number - number2;
            }
        };

        System.out.println(addition.execute(12, 10));
        System.out.println(subtraction.execute(12,10));

    }



}
