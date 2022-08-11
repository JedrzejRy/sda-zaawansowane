package obiektowe.escapeRoom;

import java.util.List;
import java.util.Scanner;

//interakcja z aplikacja
//jedyna klasa z sout i scannerem
public class Controller {
    private Scanner scanner = new Scanner(System.in);
    private Game game = new Game();

    public void start() {
        printMenu();
        int selection = selectOption();
        useSelectedItem(selection);
    }

    private void printMenu() {
        System.out.println("Witamy w grze");
        List<Item> items = game.getItems();
        for (int i = 0; i < items.size(); i++) {
            System.out.printf("%d. %s\n", i + 1, items.get(i).getName());
        }
    }

    private int selectOption() {
        System.out.println("Co wybierasz?");
        return scanner.nextInt();
    }

    private void useSelectedItem(int itemNumber){
        System.out.println("Używasz przedmiotu nr " + itemNumber);
        game.useItem(itemNumber);
    }

}
