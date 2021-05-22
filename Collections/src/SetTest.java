import static org.junit.Assert.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.HashSet;

import org.junit.Test;

public class SetTest {
    Set obj = new Set();

    @Test
    public void objNotNull() {
        assertNotNull(obj);
    }

    @Test
    public void wordcheckTest() {
        HashSet<String> result = obj.hashSetDemo();
        assertEquals(true, result.contains("Spring"));
        assertEquals(5, result.size());
        assertEquals(false, result.isEmpty());
    }
}
