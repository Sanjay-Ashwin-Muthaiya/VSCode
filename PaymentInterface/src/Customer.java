import java.util.Scanner;

interface Balance {
    void amount();
}

interface Debit extends Balance {
    String debitTransfer();

    @Override
    default void amount() {
        System.out.println("Amount detected");
    }
}

interface Cash extends Balance {
    String cashTransfer();

    @Override
    default void amount() {
        System.out.println("Amount detected");
    }
}

public class Customer implements Cash, Debit {
    Scanner scannerObject = new Scanner(System.in);

    @Override
    public String cashTransfer() {
        return "Cash Spent for Shopping";
    }

    @Override
    public String debitTransfer() {
        return "DebitCard used for Shopping";
    }

    @Override
    public void amount() {
        System.out.println("Amount Detected");
    }

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

    public Cash intitializeCard() {
        Cash cashObject = new Customer();
        return cashObject;
    }

    public Debit intitializeDebit() {
        Debit debitObject = new Customer();
        return debitObject;
    }

    public static void main(String[] args) throws Exception {
        Customer customerObject = new Customer();
        boolean cashOrDebit = customerObject.checkCashOrCardAvailability();
        if (cashOrDebit) {
            Cash cashObject = customerObject.intitializeCard();
            System.out.println(cashObject.cashTransfer());
            cashObject.amount();
        } else {
            Debit debitObject = customerObject.intitializeDebit();
            System.out.println(debitObject.debitTransfer());
            debitObject.amount();
        }
    }
}
