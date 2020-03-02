package rocks.zipcode;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;

import static org.junit.Assert.assertEquals;

public class HashMapTest {
    private static String TEST_KEY = "Test_String1";
    private static String TEST_VALUE = "Test_String2";
    private HashMap<String,String> map;

    @Before
    public void setUp() throws Exception {
        map = new HashMap<>();
        map.put(TEST_KEY,TEST_VALUE);
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void testArrayList() {
        assertEquals(map.size(),1);
        assertEquals(map.keySet().size(),1);
        assertEquals(map.get(TEST_KEY),TEST_VALUE);
    }
}
