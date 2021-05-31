public class Cash implements PaymentInterface {

    @Override
    public void transfer() {
        System.out.println("Transfered through Cash");

    }

}
