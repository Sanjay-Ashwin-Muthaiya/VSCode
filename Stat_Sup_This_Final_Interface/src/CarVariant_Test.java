import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Test;

public class CarVariant_Test {
    CarVariant obj = CarVariant.getObject();

    @Test
    public void carName_Test() {
        assertEquals("Dzire TN 01 AB 5001", obj.carName());
    }

    @Test
    public void carModel_Test() {
        CarVariant obj_model = new CarVariant("Dzire", "VXI");
        assertNotNull(obj_model);
        assertEquals("Dzire VXI TN 01 AB 5001", obj_model.carModel());
    }

}
