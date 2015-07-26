package Transaction;

import java.util.Date;

/**
 * Created by Admin on 26.07.2015.
 */
public class Interest_payment extends Transaction {
    private Double interest;
    private Double balance;
    private String transaction;
    private Transaction_types type = Transaction_types.Transfer;

    /**
     * constructor with parameters
     *
     * @param interest is interest to add to the balance
     * @param balance  is current balance of the account
     */
    public Interest_payment(double interest, double balance) {
        this.interest = interest;
        this.balance = balance;
        this.date = new Date();
    }

    @Override
    public void description() {
        System.out.println("Interest calculation for the account according to its type.");
    }

    @Override
    public void makeTransaction() {

    }
}
