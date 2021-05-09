public class App {
    private int num_1,num_2;
    public App(){
        
    }
    public App(int a,int b){
         num_1=a;
         num_2=b;
        if(num_1<=0||num_2<=0){
            throw new IllegalArgumentException();
        }
    }
    public int sum(){
        return num_1+num_2;
    }

    private int add(int a, int b) {
        return a + b;
    }

    public int sumOfNumbers(int a, int b) {
        return a + b;
    }

    public int sumOfNumbers(int a, int b, int c) {
        return a + b + c;
    }

    public static void main(String[] args) throws Exception {
        App obj = new App();
        System.out.println(obj.add(2, 3));
        obj.sumOfNumbers(1, 2);
        obj.sumOfNumbers(1, 2, 3);
    }
}
