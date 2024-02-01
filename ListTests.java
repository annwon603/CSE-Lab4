import static org.junit.Assert.*;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

import org.junit.*;

class MyStringChecker implements StringChecker{
    public boolean checkString(String s){
        //only accepting the string's length that are greater
        //than 2
        return s.length() > 2;
    }
}

public class ListTests {
    @Test
    public void testFilter(){
        List<String> list = new ArrayList<>();
        list.add("a");
        list.add("bbbb");
        list.add("ccc");


        List<String> listExpected = new ArrayList<>();
        listExpected.add("bbbb");
        listExpected.add("ccc");

        MyStringChecker sc = new MyStringChecker();
        ListExamples.filter(list, sc);
        assertArrayEquals(listExpected.toArray(), ListExamples.filter(list, sc).toArray());

        List<String> list2 = new ArrayList<>();
        list2.add("a");
        list2.add("b");
        list2.add("c");

        List<String> list3 = new ArrayList<>();
        list3.add("a");
        list3.add("b");
        list3.add("c");
        list3.add("d");

        List<String> listExpected2 = new ArrayList<>();
        listExpected2.add("a");
        listExpected2.add("a");
        listExpected2.add("b");
        listExpected2.add("b");
        listExpected2.add("c");
        listExpected2.add("c");
        listExpected2.add("d");

        assertArrayEquals(listExpected2.toArray(), ListExamples.merge(list2,list3).toArray());
    }











}
