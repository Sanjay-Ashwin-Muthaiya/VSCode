import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Before;
import org.junit.Test;

public class SecondarySubjects_Test {
    CommonSub obj=new CommonSub();
    Cse cse_obj=new Cse();
    Science sci_obj=new Science();
    @Test
    public void ObjNotNull_Test(){
        assertNotNull(obj);
    }

    @Test
    public void ObjNotNullCse_Test() {
        assertNotNull(cse_obj);
    }

    @Test
    public void ObjNotNullScience_Test(){
        assertNotNull(sci_obj);
    }

    @Test
    public void ComnSub_Test() {
        ObjNotNull_Test();
        assertEquals("Tamil English Maths",obj.allSubjects());
    }
    @Test
    public void Cse_Test() {
        ObjNotNullCse_Test();
        assertEquals("Tamil English Maths Social Computer Science", cse_obj.allSubjects());
    }
    @Test
    public void Science_Test() {
        ObjNotNullScience_Test();
        assertEquals("Tamil English Maths Botany Zoology", sci_obj.allSubjects());
    }
}
