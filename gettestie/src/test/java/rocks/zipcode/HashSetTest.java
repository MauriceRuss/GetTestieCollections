package rocks.zipcode;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

import static org.junit.Assert.assertEquals;

public class HashSetTest {
    private static String TEST_VALUE = "Test_String";
    private static String TEST_VALUE2 = "Test_String2";
    private HashSet<String> set;

    @Before
    public void setUp() throws Exception {
        set = new HashSet<>();
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void testArrayList() {
        set.add(TEST_VALUE);
        assertEquals(set.size(),1);
        set.add(TEST_VALUE);
        assertEquals(set.size(),1);
        set.add(TEST_VALUE2);
        assertEquals(set.size(),2);
    }
}
