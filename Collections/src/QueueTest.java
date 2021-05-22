import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.util.ArrayDeque;
import java.util.Arrays;

import org.junit.Test;

public class QueueTest {
    Queue obj = new Queue();

    @Test
    public void objNotNull() {
        assertNotNull(obj);
    }

    @Test
    public void dequeueMethodTest() {
        ArrayDeque<String> result = obj.dequeueMethod();
        assertEquals("ChatSupport", result.poll());
        assertEquals("Setmore", result.poll());
        assertEquals("AdaptiveU", result.peek());
        assertEquals("AdaptiveU", result.peek());

    }

}
