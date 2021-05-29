import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.io.ByteArrayInputStream;
import java.io.InputStream;

import org.junit.Before;
import org.junit.Test;

public class CustomerTest {

    String cash, debit;
    Customer customerObject = new Customer();

    @Test
    public void objectNotNullTest() {
        assertNotNull(customerObject);
    }

    @Before
    public void cashTransferInput() {
        String cashInput = "0";
        InputStream stdin = System.in;
        try {
            System.setIn(new ByteArrayInputStream(cashInput.getBytes()));
            cash = customerObject.cashTransfer();
        } finally {
            System.setIn(stdin);
        }
    }

    @Before
    public void debitTransferInput() {
        String debitInput = "1";
        InputStream stdin = System.in;
        try {
            System.setIn(new ByteArrayInputStream(debitInput.getBytes()));
            debit = customerObject.debitTransfer();
        } finally {
            System.setIn(stdin);
        }
    }

    @Test
    public void cashTransferTest() {
        assertEquals("Cash Spent for Shopping", cash);
    }

    @Test
    public void debitTransferTest() {
        assertEquals("DebitCard used for Shopping", debit);
    }

}
