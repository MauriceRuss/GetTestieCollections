package rocks.zipcode;

import java.util.ArrayList;
import org.junit.*;
import static org.junit.Assert.assertEquals;

public class ArrayListTest {

    private static String TEST_STRING1 = "Test_String1";
    private static String TEST_STRING2 = "Test_String2";
    private ArrayList<String> array;

    @Before
    public void setUp() throws Exception {
        array = new ArrayList<>();
        array.add(TEST_STRING1);
        array.add(TEST_STRING2);
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void testArrayList() {
        assertEquals(array.size(),2); // false
        assertEquals(array.get(0),TEST_STRING1);
        array.remove(TEST_STRING1);
        assertEquals(array.size(),1);
    }
}
