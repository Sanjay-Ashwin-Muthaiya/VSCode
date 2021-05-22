import java.util.TreeSet;

public class TreeSetDemo {
    TreeSet<String> ts = new TreeSet<String>();

    public TreeSet<String> setData() {
        System.out.println("Student Barcode Entry for Attendence:");
        ts.add("Selvam");
        ts.add("Aanand");
        ts.add("Bala");
        ts.add("Meena");
        ts.add("Antony");
        ts.add("Deva");

        for (String s : ts) {
            System.out.println(s);
        }
        return ts;
    }

    public static void main(String[] args) {
        TreeSetDemo obj = new TreeSetDemo();
        obj.setData();
    }

}
