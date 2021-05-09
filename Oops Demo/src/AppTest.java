
import static org.junit.Assert.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import org.junit.Test;
import org.junit.jupiter.api.DisplayName;

public class AppTest {

    App obj = new App();

    @Test
    public void objTest() {
        assertNotNull(obj);
    }

    @Test
    @DisplayName("Testing private method with reflection")
    public void addTest() throws NoSuchMethodException, SecurityException, IllegalAccessException,
            IllegalArgumentException, InvocationTargetException {
        Method method = App.class.getDeclaredMethod("add", int.class, int.class);
        method.setAccessible(true);
        int sum = (int) method.invoke(obj, 20, 30);
        assertEquals(50, sum);

    }

    @Test
    @DisplayName("2 arguments add polymorhpism")
    public void sumOfNumbersTest_1() {
        assertEquals(10, obj.sumOfNumbers(5, 5));
    }

    @Test
    @DisplayName("3 arguments add polymorphism")
    public void sumOfNumbersTest_2() {
        assertEquals(6, obj.sumOfNumbers(1, 2, 3));
    }

    public App cons;

    @Test
    @DisplayName("Constructor with positive values")
    public void consTest_1() {
        cons = new App(2, 3);
        assertEquals(5, cons.sum());
    }

    @Test(expected = IllegalArgumentException.class)
    @DisplayName("Construcotr with Negative values")
    public void consTest_2(){
        cons = new App(-2,4);
    }
}