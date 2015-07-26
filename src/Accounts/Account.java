package Accounts;

import Transaction.Transaction;
import com.company.Branch;
import com.company.Customer;

import java.util.Random;

/**
 * Created by Admin on 25.07.2015.
 */
public abstract class Account {
    /**
     * variables for storing account's data
     */
    protected Customer customer;
    protected static Integer transactionsCount = 0;
    protected Integer id;
    protected Transaction[] transactions = new Transaction[100];
    protected Accounts_type type;
    protected Double balance;
    protected Branch branch;
    protected Double interest;

    /**
     * constructor
     */
    public Account() {
        Random random = new Random();
        this.id = random.nextInt(1000);
    }

    /**
     * abstract methods for child classes to implement
     */
    public abstract void calculate();

    public abstract void description();

    /**
     * method for changing account's type
     */
    public Account changeType(Accounts_type type) {
        if (type.equals(Accounts_type.Business)) {
            return new BusinessAccount(this);
        } else if (type.equals(Accounts_type.Saving)) {
            return new SavingAccount(this);
        } else {
            return new ChequingAccount(this);
        }
    }

    /**
     * method for adding transaction
     *
     * @param transaction
     */
    public void addTransaction(Transaction transaction) {
        if (transactionsCount < 100) {
            transactions[transactionsCount] = transaction;
            transactionsCount++;
        } else {
            System.out.println("This account already has 100 transactions!");
        }
    }

    /*
     * getters and setters for private variables
     */

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Accounts_type getType() {
        return type;
    }

    public Integer getId() {
        return id;
    }

    public Double getBalance() {
        return balance;
    }

    public void setBalance(Double balance) {
        this.balance = balance;
    }

    public Branch getBranch() {
        return branch;
    }

    public void setBranch(Branch branch) {
        this.branch = branch;
    }

    public Double getInterest() {
        return interest;
    }
}
