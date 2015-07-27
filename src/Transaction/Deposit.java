package Transaction;

import Accounts.Account;

import java.util.Date;

/**
 * Created by Admin on 26.07.2015.
 */
public class Deposit extends Transaction {
    private Double deposit;
    private Double balance;
    private String transaction;
    private Transaction_types type = Transaction_types.Deposit;

    /**
     * constructor with parameters
     *
     * @param deposit is deposit to add to the balance
     */
    public Deposit(double deposit, Account type1) {
        this.firstAccount = type1;
        this.deposit = deposit;
        this.balance = firstAccount.getBalance();
        this.secondAccount = null;
        this.date = new Date();
    }

    @Override
    public void description() {
        System.out.println("Putting money to the bank account.");
    }

    @Override
    public void makeTransaction() {
        if (deposit > 0) {
            balance += deposit;
            this.isValid = true;
            transaction = "Deposit of: " + deposit + " rubles.";
            this.firstAccount.addTransaction(this);
            System.out.println("Deposit operation complete successfully!");
        } else {
            this.isValid = false;
            System.out.println("Depositing operation failure!");
        }
    }

    /**
     * getter for the transaction
     *
     * @return the information about transaction
     */
    public String getTransaction() {
        return transaction;
    }
}
