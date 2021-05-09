import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

public class AppTest {
    App obj=new App();

    @Test
    public void testAddPositive(){
        
        assertEquals(6, obj.add((short)2,(short)4));
    }
    @Test
    public void testAddOneNegative(){
        assertEquals(2,obj.add((short)-3,(short)5));
    }
    @Test
    public void testAddTwoNegative(){
        assertEquals(-5,obj.add((short)-3,(short)-2));
    }
}
