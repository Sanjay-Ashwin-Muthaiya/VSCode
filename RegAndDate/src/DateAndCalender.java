import java.util.*;

public class DateAndCalender{

    public int calenderVerify(int d) {
        Calendar calen=Calendar.getInstance();
        System.out.println(calen.getWeekYear());
        System.out.println(calen.getTime());
        calen.add(Calendar.DATE,d);
        int date=calen.get(Calendar.DATE);
        return date;
    }

    
    public String checkDay() {
        Date date_obj=new Date();
        int current_day=date_obj.getDay();
       /* Calendar c=Calendar.getInstance(); //Deprecated
        int calendar_obj=c.get(Calendar.DAY_OF_WEEK);*/
        switch(current_day){
            case 0:
            //return "Sunday";
            case 1:
           // return "Monday";
            case 2:
           // return "Tuesday";
            case 3:
          //  return "Wednesday";
            case 4:
           // return "Thursday";
            case 5:
            //return "Friday";
            case 6:
            return "Saturday";
            default:
            return "Enter valid day";
        }


    }
    public int checkThirdMonth() {
        Calendar calen=Calendar.getInstance();
        calen.add(Calendar.DATE,-18);
        calen.add(Calendar.MONTH,3);
        //calen.get
        //calender_obj.add(CALENDER.YEAR(1));
        int third_Month_Day=calen.get(Calendar.DAY_OF_WEEK);
       // System.out.println(third_Month_Day);
        return third_Month_Day;
    }



    public static void main(String[] args) {
        DateAndCalender obj=new DateAndCalender();
        System.out.println("Calendar after your days "+obj.calenderVerify(10));
        System.out.println("Today's Day "+obj.checkDay());
        System.out.println("Day after 3 months "+obj.checkThirdMonth());
    }


    



}