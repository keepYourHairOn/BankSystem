package Transaction;

import java.util.Date;

/**
 * Created by Admin on 26.07.2015.
 */
public class Withdrawal extends Transaction {
    private Double withdraw;
    private Double balance;
    private String transaction;
    private Transaction_types type = Transaction_types.Withdrawal;

    /**
     * constructor with parameters
     *
     * @param withdraw is money to withdraw from the balance
     * @param balance  is current balance of the account
     */
    public Withdrawal(double withdraw, double balance) {
        this.withdraw = withdraw;
        this.balance = balance;
        this.date = new Date();
        this.name = "Withdrawal";

    }

    @Override
    public void description() {
        System.out.println("Taking of money from the bank account.");
    }

    @Override
    public void makeTransaction() {
        if (withdraw <= balance && withdraw > 0) {
            balance -= withdraw;
            this.isValid = true;
            transaction = "Withdraw of: " + withdraw + " rubles.";
            System.out.println("Withdrawal operation complete successfully!");
        } else {
            this.isValid = false;
            System.out.println("Withdrawal operation failure!");
        }
    }

    /**
     * getter for transaction
     *
     * @return all info about transaction
     */
    public String getTransaction() {
        return transaction;
    }
}
