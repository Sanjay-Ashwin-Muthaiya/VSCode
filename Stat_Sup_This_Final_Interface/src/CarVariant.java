interface Car {
    final String carNumber = "TN 01 AB 5001";

    String carName();
}
public class CarVariant implements Car {
    String name;
    String model;

    private CarVariant(String name) {
        this.name = name;
    }
    private static CarVariant obj=new CarVariant("Dzire");
    public static CarVariant getObject(){
        return obj;
    }

    CarVariant(String name, String model) {
        this(name);
        this.model = model;
    }

    public String carName() {
        return name+" "+carNumber;

    }

    public String carModel() {
        return name + " " + model + " " + carNumber;
    }

    public static void main(String[] args) throws Exception {
        CarVariant cc=new CarVariant("hi");
        System.out.println("Hello, World!");
    }
}
