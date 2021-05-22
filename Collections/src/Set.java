import java.util.HashSet;
import java.util.Iterator;

public class Set {
    public HashSet<String> hashSetDemo() {
        HashSet<String> hs = new HashSet<String>();
        hs.add("Servlet");
        hs.add("JSP");
        hs.add("Hibernate");
        hs.add("Spring");
        hs.add("Microservices");
        hs.add("Microservices");

        Iterator itr = hs.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }

        return hs;

    }

    public static void main(String[] args) {
        Set obj = new Set();
        obj.hashSetDemo();
    }

}
