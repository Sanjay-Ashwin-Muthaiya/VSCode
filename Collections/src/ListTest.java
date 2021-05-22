import static org.junit.Assert.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import java.util.ArrayList;

import org.junit.Test;

public class ListTest {
    ArrayListClass obj = new ArrayListClass();

    @Test
    public void objNotNull() {
        assertNotNull(obj);
    }

    @Test
    public void evenNumbersTest() {
        // ArrayList<Integer> al=new ArrayList<Integer>();
        int expected[] = { 2, 4, 6, 8, 10, 12, 14 };
        assertArrayEquals(expected, obj.evenNumbers(14));
    }

    @Test(expected = NegativeArraySizeException.class)
    public void evenNumbers_forNegTest() {
        obj.evenNumbers(-4);
    }

}
