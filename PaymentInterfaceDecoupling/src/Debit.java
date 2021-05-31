public class Debit implements PaymentInterface {

    @Override
    public void transfer() {
        System.out.println("Transfered through DebitCard");

    }

}
