package obiektowe.collections.myLinkedList;

import obiektowe.collections.ListTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class MyLinkedListTest extends ListTest {

    public MyLinkedListTest() {
        super(new MyLinkedList<>());
    }

}