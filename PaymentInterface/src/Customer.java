import java.util.Scanner;

interface Balance {
    void amount();

    void transfer();
}

class Debit implements Balance {
    @Override
    public void amount() {
        System.out.println("Amount detected");
    }

    public void transfer() {
        System.out.println("Amount withdraw from Debit Card");
    }
}

class Cash implements Balance {
    public void transfer() {
        System.out.println("Amount withdraw from Cash");
    }

    @Override
    public void amount() {
        System.out.println("Amount detected");
    }
}

interface TransactionInterface {
    void amount();

    void transfer();
}

class Transaction implements TransactionInterface {
    private Balance balance;

    public Transaction(Balance balance) {
        this.balance = balance;
    }

    @Override
    public void amount() {
        balance.amount();
    }

    @Override
    public void transfer() {
        balance.transfer();
    }
}

public class Customer {
    Scanner scannerObject = new Scanner(System.in);

    public boolean checkCashOrCardAvailability() {
        int cashOrDebit;
        System.out.println("Enter 0 for Cash or 1 for Debit Card");
        cashOrDebit = scannerObject.nextInt();
        if (cashOrDebit == 0) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) throws Exception {
        Customer customerObject = new Customer();
        Balance cashObject = new Cash();
        Balance debitObject = new Debit();
        boolean cashOrDebit = customerObject.checkCashOrCardAvailability();
        if (cashOrDebit) {
            TransactionInterface transactionObject = new Transaction(cashObject);
            transactionObject.amount();
            transactionObject.transfer();
        } else {
            TransactionInterface transactionObject = new Transaction(debitObject);
            transactionObject.amount();
            transactionObject.transfer();
        }
    }
}
