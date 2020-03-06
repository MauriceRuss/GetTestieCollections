package rocks.zipcode;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;


import java.util.LinkedList;

import static org.junit.Assert.assertEquals;

public class LinkedListTest {

    private static String TEST_STRING1 = "Test_String1";
    private static String TEST_STRING2 = "Test_String2";
    private LinkedList<String> array;

    @Before
    public void setUp() throws Exception {
        array = new LinkedList<>();
        array.add(TEST_STRING1);
        array.add(TEST_STRING2);
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void testLinkedList() {
        assertEquals(array.getLast(),TEST_STRING2);
        assertEquals(array.getFirst(),TEST_STRING1);
        array.remove(TEST_STRING1);
        assertEquals(array.size(),1);
    }


}
