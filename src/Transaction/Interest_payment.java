package Transaction;

import java.util.Date;

/**
 * Created by Admin on 26.07.2015.
 */
public class Interest_payment extends Transaction {
    private String transaction;
    private Transaction_types type = Transaction_types.Transfer;


    @Override
    public void description() {
        System.out.println("Interest calculation for the account according to its type.");
    }

    @Override
    public void makeTransaction() {
        if (firstAccount.getBalance() > 0) {
            this.isValid = true;
            firstAccount.calculate();
            transaction = "Interest payment: " + firstAccount.getInterest() + " per day. Balance: " + firstAccount.getBalance();
            this.firstAccount.addTransaction(this);
            System.out.println("Interest payment operation success!");
        } else {
            this.isValid = false;
            System.out.println("Interest payment operation success!");
        }
    }
}
