import static org.junit.Assert.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

public class SonTest {

    // Inheritance,overriding,Super
    Son son_obj = new Son();
    Father far_obj = new Father();

    @Test
    public void sonObjNotNull() {
        assertNotNull(son_obj);
    }

    @Test
    public void farObjNotNull() {
        assertNotNull(far_obj);
    }

    @Test
    public void workFather_Test() {
        String expected = "Software Engineer 55 GrandFatherAge 80";
        String actual = far_obj.work();
        assertEquals(expected, actual);
    }

    @Test
    public void workSon_Test() {
        String expected = "MBA 25 Software Engineer 55 GrandFatherAge 80";
        String actual = son_obj.work();
        assertEquals(expected, actual);
    }
}