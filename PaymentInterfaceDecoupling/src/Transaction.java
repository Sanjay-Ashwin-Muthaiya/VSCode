public class Transaction implements TransactionInterface {

    private PaymentInterface paymentObject;

    public Transaction(PaymentInterface paymentObject) {
        this.paymentObject = paymentObject;
    }

    @Override
    public void transfer() {
        paymentObject.transfer();
    }

}
