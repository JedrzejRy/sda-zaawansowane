package obiektowe.escapeRoom;

import java.util.ArrayList;
import java.util.List;

//zarzada przedmiotami
public class Room {
    private List<Item> items = new ArrayList<>();

    public Room(){
        items.add(new Door());
        items.add(new Key());
        items.add(new Window());
    }

    public List<Item> getItems() {
        return items;
    }

    public Item findItemByIndex(int index){
        return items.get(index);
    }
}
