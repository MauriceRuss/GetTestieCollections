package rocks.zipcode;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.PriorityQueue;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

public class PriorityQueueTest {
    private static String TEST_STRING1 = "Test_String1";
    private static String TEST_STRING2 = "Test_String2";
    private PriorityQueue<String> array;

    @Before
    public void setUp() throws Exception {
        array = new PriorityQueue<>();
        array.add(TEST_STRING1);
        array.add(TEST_STRING2);
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void testArrayList() {
        assertEquals(array.size(),2);
        array.remove(TEST_STRING1);
        assertEquals(array.size(),1);
        assertFalse(array.contains(TEST_STRING1));
    }

}
