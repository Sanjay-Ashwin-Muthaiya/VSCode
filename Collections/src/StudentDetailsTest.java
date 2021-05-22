import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Scanner;

import org.junit.Test;

public class StudentDetailsTest {
    StudentDetails ob = new StudentDetails();

    @Test
    public void objNotNull() {
        assertNotNull(ob);
    }

    @Test
    public void listTest() {
        ArrayList<StudentDetails> al = new ArrayList<StudentDetails>();
        StudentDetails obj = new StudentDetails("Sanjay", "Siva", "14CS048", "BE", "9484746454", "24",
                "asanjay@gmail.com", "Rasipuram", "TN", "India");
        assertNotNull(obj);
        al.add(obj);
        assertEquals("Sanjay", obj.getName());
        assertEquals("BE", obj.getGrade());
        /*
         * String expected= "StudentDetails [Name=" + "Sanjay" + ", Surname=" + "Siva" +
         * ", RollNo=" + "1234" + ", Grade=" + "BE" + ", Mobile Number=" + "1234" +
         * ", Age=" + "23" + ", Email=" + "asanjay@gmail.com" + ", City=" + "Rasipuram"
         * + ", State=" + "TN" + ", Country=" + "India" + "]";
         */

    }

    /*
     * @Test public void getIntputTest() throws IOException{ Scanner sc = new
     * Scanner(System.in); String input=
     * "Sanjay\nSiva\n1234\nBE\n9136\n23\nasanjaysiva@gmail.com\nRasipuram\nTN\nIndia";
     * ByteArrayInputStream in=new ByteArrayInputStream(input.getBytes());
     * System.setIn(in);
     * 
     * ByteArrayOutputStream out=new ByteArrayOutputStream(); System.setOut(new
     * PrintStream(out)); String [] args={}; obj.getIntput();
     * 
     * String consoleoutput="Enter name:"+System.getProperty("line.seperator");
     * consoleoutput+="Enter Surname:"+System.getProperty("line.seperator");
     * consoleoutput+="Enter RollNo:"+System.getProperty("line.seperartor");
     * consoleoutput+="Enter Grade:"+System.getProperty("line.seperator");
     * consoleoutput+="Enter Mobile Number:"+System.getProperty("line.seperator");
     * consoleoutput+="Enter Age:"+System.getProperty("line.seperator");
     * consoleoutput+="Enter Email:"+System.getProperty("line.seperator");
     * consoleoutput+="Enter City:"+System.getProperty("line.seperator");
     * consoleoutput+="Enter Sate:"+System.getProperty("line.seperator");
     * consoleoutput+="Enter Country:"+System.getProperty("line.seperator");
     * consoleoutput+="Continue: y/n"+System.getProperty("line.seperator");
     * 
     * assertEquals(consoleoutput,out.toString());
     */

    /*
     * String data = "asanjaysiv@anywhere.com"; String actual; InputStream stdin =
     * System.in; try { System.setIn(new ByteArrayInputStream(data.getBytes()));
     * actual = obj.unameInput(); } finally { System.setIn(stdin); } actual =
     * obj.usernameCheck(actual); assertEquals("Valid", actual);
     */

    /*
     * ArrayList<StudentDetails> result= obj.getIntput();
     * assertEquals("SAnjay",result.get(0));
     */

}
