import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.Test;

public class DateAndCalenderTest {
    DateAndCalender obj=new DateAndCalender(); 
    @Test
    public void objNotNull(){
        assertNotNull(obj);
    }
    
    @Test
    public void dateNegValTest(){
        assertEquals(10,obj.calenderVerify(-10));
    }

    @Test
    public void datePosValCheck(){
        assertEquals(22,obj.calenderVerify(2));
    }
    @Test
    public void dateRollOverValCheck(){
        assertEquals(9,obj.calenderVerify(20));
    }
    @Test
    public void checkDayTest(){
        assertTrue(obj.checkDay()== "Thursday");
    }

    @Test
    public void checkthirdmonthTest(){
        assertEquals(2,obj.checkThirdMonth());

    }

}
