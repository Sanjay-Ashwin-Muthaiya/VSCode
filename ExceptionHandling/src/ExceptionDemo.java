public class ExceptionDemo {

    public static void main(String[] args) throws Exception {
        ExceptionDemo obj = new ExceptionDemo();
        try {
            obj.lenOfString(null);
        } catch (NullPointerException npe) {
            System.out.println("Exception Handled");
        }
        System.out.println("Length of a word " + obj.lenOfString("Chat"));
        System.out.println(obj.divide_A_Num(10, 2));
    }

    public int lenOfString(String s) {
        int name_length = 0;
        try {
            name_length = s.length();
        } catch (NullPointerException npe) {
            throw new NullPointerException();
        } finally {
            System.out.println("Thanks of your Visit!");
        }
        return name_length;
    }

    public float divide_A_Num(int i, int j) {
        float div = 0;
        try {
            div = i / j;
        } catch (ArithmeticException ae) {
            System.out.println("Please enter a valid number");
            throw new ArithmeticException("Not Valid");
        }
        return div;
    }

}
