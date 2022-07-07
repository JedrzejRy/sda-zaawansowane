package obiektowe.collections.myArrayList;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class MyArrayListTest {

    List<Integer> element = new MyArrayList<>();

    @Test
    public void addShouldHandleFewElements(){

        element.add(23);
        element.add(10);
        element.add(13);

        assertEquals(3,element.size());
    }

    @Test
    public void addShouldHandleManyElements(){

        element.add(23);
        element.add(10);
        element.add(13);
        element.add(13);
        element.add(13);
        element.add(13);
        element.add(13);
        element.add(13);
        element.add(13);
        element.add(13);
        element.add(13);

        assertEquals(11,element.size());
    }

    @Test
    public void itsImpossibleToAddNullValue(){
        element.add(null);

        assertEquals(0,element.size());
    }

}