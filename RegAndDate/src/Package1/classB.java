package Package1;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class classB {
    void m2(){
        Calendar calen=Calendar.getInstance();
        int i=calen.get(Calendar.DATE);
        Date ii=calen.getTime();
        System.out.println(ii);
        SimpleDateFormat sdf1=new SimpleDateFormat("dd");
        System.out.println(sdf1.format(i));

        SimpleDateFormat sdf=new SimpleDateFormat("MM/dd/YYYY hh");
        Date d=new Date();
        long dd=d.getTime();
        System.out.println(sdf.format(d));
      //  System.out.println(sdf.format(dd));
        System.out.println(dd);
    }

    public static void main(String[] args) {
        classA obj = new classA();
        obj.m1();
        classB objB=new classB();
        objB.m2();
    }

}
