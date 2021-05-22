import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

class ArrayListClass {

    public int[] evenNumbers(int num) {
        ArrayList<Integer> al = new ArrayList<Integer>();
         //CopyOnWriteArrayList<Integer> al=new CopyOnWriteArrayList<Integer>();
        int arr[] = new int[num / 2];
        int count = 0;
        if (num < 0) {
            throw new NegativeArraySizeException("Not valid");
        } else {
            for (int i = 1; i <= num; i++) {
                if (i % 2 == 0) {
                    al.add(i);
                    arr[count] = al.get(count);
                    count++;
                }
            }
            Iterator<Integer> itr=al.iterator();
            while(itr.hasNext()){
                if(itr.next()==4){
                    itr.remove();
                }
            }
            for (int n : al) {
                System.out.println(n);
            }
            return arr;
        }

    }
}

public class List {
    public static void main(String[] args) throws Exception {
        ArrayListClass obj = new ArrayListClass();
        obj.evenNumbers(10);
    }
}
