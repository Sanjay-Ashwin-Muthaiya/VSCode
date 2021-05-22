import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;
public class TreeMapDemo {
    public static void main(String[] args) throws Exception {
        TreeMapDemo obj=new TreeMapDemo();
        obj.storeData();
    }

    public TreeMap<String, Integer> storeData() {
        TreeMap<String,Integer> tm=new TreeMap<String,Integer>();
        System.out.println("Bed availability for covid patients");
        tm.put("Chennai",200);
        tm.put("Villupuram",100);
        tm.put("Kanniyakumari",150);
        tm.put("Trichy",300);
        for(Map.Entry m:tm.entrySet()){
            System.out.println(m.getKey()+"--"+m.getValue());
        }

        return tm;
    }
}
