public class CustomerPaymentWay {

    public static void main(String[] args) throws Exception {
        PaymentInterface cashObject = new Cash();
        PaymentInterface debitObject = new Debit();
        TransactionInterface transactionObject = new Transaction(cashObject);
        transactionObject.transfer();
    }
}
