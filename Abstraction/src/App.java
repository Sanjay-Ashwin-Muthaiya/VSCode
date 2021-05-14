abstract class Abstract_A{
    public abstract int mul(int a,int b);
}


public class App extends Abstract_A {
    public int mul(int a,int b){
        return a*b;
    }
    public static void main(String[] args) throws Exception {
        App obj=new App();
        obj.mul(10,6);
    }
}
