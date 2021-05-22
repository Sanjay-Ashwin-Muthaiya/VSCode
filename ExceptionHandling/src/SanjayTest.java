import java.io.ByteArrayOutputStream;
import java.io.OutputStream;
import java.io.PrintStream;

import org.junit.Test;
import org.junit.jupiter.api.AfterEach;

import junit.framework.TestCase;

public class SanjayTest extends TestCase {
    SanjayTest capture;
    Sanjay obj = new Sanjay();

    protected void setUp() throws Exception {
    super.setUp();
        capture = new SanjayTest();
        }

        @Test
    public final void testMyPrint() {
        // Prepare to capture output
        PrintStream originalOut = System.out;
        OutputStream os = new ByteArrayOutputStream();
        PrintStream ps = new PrintStream(os);
        System.setOut(ps);
        // Perform tests

        String separator = System.getProperty("line.separator");
        obj.myPrint("Hello, output!");
        assertEquals("Hello, output!" + separator, os.toString());
        // Restore normal operation
        System.setOut(originalOut);
    }

}
