public class App {
    // variables and datatypes

    public int forDemo(String s) {
        int count = 0;
        aa: for (int i = 0; i < s.length(); i++) {
            char var_A = s.charAt(i);
            if (var_A == ' ')
                continue aa;
            if (var_A == 'a' || var_A == 'A') {
                count++;
            }
        }
        return count;
    }

    public double switchDemo(int s, double a, double b) {
        switch (s) {
            case 1:
                return a + b;
            case 2:
                return a - b;
            case 3:
                return a * b;
            case 4:
                return a / b;
            default:
                return 0.0;
        }
    }

    public int whileDemo(int n) {
        int count = 0;
        while (count < 10) {
            count++;
            n++;
        }
        return n;
    }

    public static void main(String[] args) throws Exception {
        App obj = new App();
        int s = obj.forDemo("Full Creative");
        System.out.println("There are " + s + " A's present in the word");
        System.out.println(obj.switchDemo(2, 10, 4));

    }

}
