import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import org.junit.Test;

public class Authentication_Test {
    Authentication obj = new Authentication();

    @Test
    public void objNotNull() {
        assertNotNull(obj);
    }

    @Test
    public void usernameCheck_Test() {
        String data = "asanjaysiv@anywhere.com";
        String actual;
        InputStream stdin = System.in;
        try {
            System.setIn(new ByteArrayInputStream(data.getBytes()));
            actual = obj.unameInput();
        } finally {
            System.setIn(stdin);
        }
        actual = obj.usernameCheck(actual);
        assertEquals("Valid", actual);
    }

    @Test
    public void passwordCheck_Test() {
        String data = "1aA@1223";
        String actual;
        InputStream stdin = System.in;
      //  try {
            System.setIn(new ByteArrayInputStream(data.getBytes()));
            actual = obj.passInput();
      //  } finally {
            System.setIn(stdin);
       // }
        actual = obj.passwordCheck(actual);
        assertEquals("Valid", actual);
    }



}