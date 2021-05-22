import java.util.ArrayDeque;
import java.util.Deque;

public class Queue {
    public ArrayDeque<String> dequeueMethod() {
        ArrayDeque<String> deque = new ArrayDeque<String>();
        deque.add("ChatSupport");
        deque.add("Setmore");
        deque.add("AdaptiveU");
        deque.add("YocoBoard");
        for (String s : deque) {
            System.out.println(s);
        }
        return deque;
    }

    public static void main(String[] args) {
        Queue obj = new Queue();
        obj.dequeueMethod();
    }

}
