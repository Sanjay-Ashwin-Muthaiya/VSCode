import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;

import org.junit.Test;

public class RegDemoTest {
    RegDemo obj=new RegDemo();

    @Test
    public void objNotNull(){
        assertNotNull(obj);
    }

    @Test
    public void validPanCardTest(){
        assertTrue(obj.panCard("ABCAD1234U"));
    }
    @Test
    public void invalidPanCardTest(){
        assertFalse(obj.panCard("AS12A1234A"));
    }
}
