public class App {
    public static void main(String[] args) throws Exception {
        App obj=new App();
        //int a=15;
        System.out.println(obj.add((short)2,(short)3));
        
        
    }

    public int add(short num_1,short num_2){
         int sum=num_1+num_2;
         return sum;
    }
}
