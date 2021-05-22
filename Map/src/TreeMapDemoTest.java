import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.*;

import org.junit.Test;
public class TreeMapDemoTest {
    TreeMapDemo obj=new TreeMapDemo();
    TreeMap<String,Integer> tm=new TreeMap<String,Integer>();

    @Test
    public void objNotNullTest(){
        assertNotNull(obj);
    }

    @Test(expected = NullPointerException.class)
    public void nullKeyTest(){
        tm=obj.storeData();
        tm.put(null,100);
    }

    @Test
    public void nullValueTest(){
        tm=obj.storeData();
        tm.put("Vellore",null);
        assertNull(tm.get("Vellore"));
    }
    @Test
    public void sizeTest(){
        tm=obj.storeData();
        int tm_size= tm.size();
        assertEquals(4, tm_size);
    }

    @Test
    public void replaceDataTest(){
        tm=obj.storeData();
        tm.replace("Chennai", 200, 300);
        int value=tm.get("Chennai");
        assertEquals(300,value);
    }

    @Test
    public void duplicateEntryTest(){
        tm=obj.storeData();
        tm.put("Chennai",500);
        int value=tm.get("Chennai");
        assertEquals(500, value);
    }
    @Test
    public void containsKeyTrueTest(){
        tm=obj.storeData();
        assertTrue(tm.containsKey("Trichy"));
    }
    
    @Test
    public void containsValueFalseTest(){
        tm=obj.storeData();
        assertFalse(tm.containsValue(10));
    }

}
