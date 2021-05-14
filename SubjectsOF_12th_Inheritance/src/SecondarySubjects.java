
class CommonSub{
    String Sub_1="Tamil";
    String Sub_2="English";
    String Sub_3="Maths";
    public String allSubjects(){
        String res=Sub_1+" "+Sub_2+" "+Sub_3;
        return res;
    }
}

class Cse extends CommonSub{
String Sub_4="Social";
String Sub_5="Computer Science";
public String allSubjects(){
String res=Sub_1+" "+Sub_2+" "+Sub_3+" "+Sub_4+" "+Sub_5;
return res;
}
}

class Science extends Cse{
    String Sub_4="Botany";
    String Sub_5="Zoology";
    public String allSubjects(){
        System.out.println(super.allSubjects());
        String res=Sub_1+" "+Sub_2+" "+Sub_3+" "+Sub_4+" "+Sub_5;
        return res;
    }
}

public class SecondarySubjects  {
    public static void main(String[] args) throws Exception {
        Science obj=new Science();
        System.out.println(obj.allSubjects());

    }
}
