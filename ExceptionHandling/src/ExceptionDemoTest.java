import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Assert;
import org.junit.Test;

public class ExceptionDemoTest {
    ExceptionDemo obj = new ExceptionDemo();

    @Test
    public void objNotNullTest() {
        assertNotNull(obj);
    }

    @Test(expected = NullPointerException.class)
    public void lenOfStringNullTest() {
        obj.lenOfString(null);
    }

    @Test
    public void lenOfStringValueTest() {
        assertEquals(11, obj.lenOfString("ChatSupport"));
    }

    @Test(expected = ArithmeticException.class)
    public void divide_A_Num_Zero_Test() {
        obj.divide_A_Num(1, 0);
    }

    @Test
    public void divide_A_Num_Value_Test() {
        float f = obj.divide_A_Num(5, 2);
        double delta = 1e-15;
        assertEquals(2, f, delta);
    }

}
