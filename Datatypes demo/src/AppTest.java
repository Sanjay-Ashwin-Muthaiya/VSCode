import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

//import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
//import org.junit.jupiter.api.DisplayName;

public class AppTest {

    @BeforeClass
    public static void methodB4Class(){
        System.out.println("Started testing all test cases");
    }

    App obj=new App();
    @Test
    public void objNotNull(){
        assertNotNull(obj);
    }
    @Test
    public void forDemoTest1 (){
        assertEquals(3,obj.forDemo("Sanjay Ashwin"));
        
    }

    @Test
    public void forDemoTest2 (){
        assertEquals(1,obj.forDemo("Chat Support12"));
    }

    @Test
    public void switchDemoAdd(){
        assertTrue(obj.switchDemo(1, 2.0, 4.0)== 6.0);
    }

    @Test
    public void switchDemoSub(){
        assertTrue(obj.switchDemo(2, 20.0, 10.0)==10.0);
    }

    @Test
    public void switchDemoMul(){
        assertTrue(obj.switchDemo(3, 10.0, 6.0)==60.0);
    }

    @Test
    public void switchDemoDiv(){
        assertTrue(obj.switchDemo(4, 10.0, 2.0)==5.0);
    }
   
    @Test
    public void whileDemoTest(){
        assertEquals(110,obj.whileDemo(100));
    }

}
