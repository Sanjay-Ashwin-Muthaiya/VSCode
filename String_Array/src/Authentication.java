import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Authentication {
    String userid, password;

    public static void main(String[] args) throws Exception {
        Authentication obj = new Authentication();
        // String in=obj.unameInput();
        // System.out.println(obj.usernameCheck(in));
        String passin = obj.passInput();
        obj.passwordCheck(passin);
    }

    public String unameInput() {
        Scanner sc = new Scanner(System.in);
        userid = sc.next();
        sc.close();
        return userid;
    }

    public String passInput() {
        Scanner sc = new Scanner(System.in);
        password = sc.next();
        sc.close();
        return password;
    }

    public String usernameCheck(String userid) {
        String res = "Invalid";
        if (userid.endsWith(".com") && userid.contains("@")&&(false==userid.startsWith("@"))) {
            res = "Valid";
        }
        return res;
    }

    public String passwordCheck(String password) {
        String regex = "^(?=.*[0-9])" + "(?=.*[a-z])(?=.*[A-Z])" + "(?=.*[@#$&])" + "(?=\\S+$).{6,20}$";
        Pattern p = Pattern.compile(regex);
        String res = "Invalid";
        if (password == null) {
            res = "Invalid";
        }
        Matcher m = p.matcher(password);
        boolean b_res = m.matches();
        if (b_res)
            res = "Valid";

        return res;

    }
}
