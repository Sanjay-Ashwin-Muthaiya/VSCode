import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegDemo {
    public static void main(String[] args) throws Exception {
        RegDemo obj=new RegDemo();
        obj.panCard("PABAC1234E");
    }

    

    public boolean panCard(String pan_string) {
        Pattern p=Pattern.compile("[A-Z]{5}\\d{4}[A-Z]{1}");
        Matcher m=p.matcher(pan_string);
        boolean result=m.matches();
        return result;
    }
}
