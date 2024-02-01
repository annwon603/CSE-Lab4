import static org.junit.Assert.*;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

import org.junit.*;

public class LinkedListTest {

    @Test
    public void prependTest(){
        LinkedList list1 = new LinkedList();
        list1.prepend(1);
        assertEquals(1, list1.first());
        assertEquals(1, list1.length());
        assertEquals("1 ", list1.toString());
        list1.prepend(2);
        assertEquals(2, list1.first());
        assertEquals(1, list1.last());
        assertEquals(2, list1.length());
        assertEquals("2 1 ", list1.toString());
        list1.prepend(3);
        assertEquals(3, list1.first());
        assertEquals(1, list1.last());
        assertEquals(3, list1.length());
        assertEquals("3 2 1 ", list1.toString());

    }   

    @Test
    public void appendTest(){
        LinkedList list1 = new LinkedList();
        list1.append(1);
        assertEquals(1, list1.first());
        assertEquals(1, list1.length());
        assertEquals("1 ", list1.toString());

        list1.append(2);
        assertEquals(1, list1.first());
        assertEquals(2, list1.last());
        assertEquals(2, list1.length());
        assertEquals("1 2 ", list1.toString());

        list1.append(3);
        assertEquals(1, list1.first());
        assertEquals(3, list1.last());
        assertEquals(3, list1.length());
        assertEquals("1 2 3 ", list1.toString());
    }
    
}
