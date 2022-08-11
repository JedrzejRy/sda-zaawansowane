package obiektowe.escapeRoom;

import java.util.List;

//klasa zarzadajaca zasadami gry i dzialaniem rozgrywki
public class Game {

    private Room room = new Room();


    public List<Item> getItems() {
        return room.getItems();
    }

    public void useItem(int itemNumber) {
       Item item = room.findItemByIndex(itemNumber-1);
    }
}
