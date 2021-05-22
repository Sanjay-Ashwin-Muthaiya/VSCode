import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.SortedSet;
import java.util.TreeSet;

import org.junit.Test;

public class TreeSetDemoTest {
    TreeSetDemo obj = new TreeSetDemo();
    TreeSet<String> ts_obj = new TreeSet<String>();

    @Test
    public void objNotNullTest() {
        assertNotNull(obj);
    }

    @Test
    public void getSubsetTest() {
        ts_obj = obj.setData();
        SortedSet<String> sub_set= ts_obj.subSet("Bala", "Meena");
        String ss_val = sub_set.first();
        assertEquals("Bala", ss_val);
    }

    @Test
    public void lastEntryTest() {
        ts_obj = obj.setData();
        String ts_val = ts_obj.pollLast();
        assertEquals("Selvam", ts_val);
    }
    @Test
    public void treeSetEmptySetTest(){
        assertTrue(ts_obj.isEmpty());
    }

    @Test
    public void treeSetNotEmptyTest(){
        ts_obj=obj.setData();
        assertFalse(ts_obj.isEmpty());
    }

    @Test
    public void sizeTest(){
        ts_obj=obj.setData();
        int ts_size=ts_obj.size();
        assertEquals(6,ts_size);
    }

    @Test
    public void checkSpecificDataTest(){
        ts_obj=obj.setData();
        assertTrue(ts_obj.contains("Bala"));

    }
}
