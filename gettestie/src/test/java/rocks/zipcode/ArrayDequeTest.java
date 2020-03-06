package rocks.zipcode;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayDeque;

import static org.junit.Assert.assertEquals;

public class ArrayDequeTest {
    private static String TEST_STRING1 = "Test_String1";
    private static String TEST_STRING2 = "Test_String2";
    private ArrayDeque<String> array;

    @Before
    public void setUp() throws Exception {
        array = new ArrayDeque<>();
        array.add(TEST_STRING1);
        array.add(TEST_STRING2);
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void testArrayDeque() {
        assertEquals(array.size(),2);
        array.remove(TEST_STRING1);
        assertEquals(array.size(),1);
        Assert.assertFalse(array.isEmpty());
    }

}
