package Transaction;

import Accounts.Account;

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
     */
    public Withdrawal(double withdraw, Account type1) {
        this.firstAccount = type1;
        this.withdraw = withdraw;
        this.balance = firstAccount.getBalance();
        this.secondAccount = null;
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
            this.firstAccount.addTransaction(this);
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
