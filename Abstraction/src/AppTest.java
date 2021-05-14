import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.Test;

public class AppTest {
    App obj = new App();

    @Test
    public void objNotnullTest() {
        assertNotNull(obj);
    }

    @Test
    public void mulPosVal_Test(){
        assertEquals(66,obj.mul(11, 6));
    }
@Test
public void mulNegVal_Test(){
    assertEquals(-20,obj.mul(-2,10));

}
}
