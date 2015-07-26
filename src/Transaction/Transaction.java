package Transaction;

import Accounts.Account;

import java.util.Date;

/**
 * Created by Admin on 25.07.2015.
 */
public abstract class Transaction {
    protected String name;
    protected Date date;
    protected boolean isValid;
    protected Account account;

    /**
     * default constructor
     */
    public Transaction() {
    }

    public abstract void description();

    public abstract void makeTransaction();

    /**
     * getters and setters for private variables
     */
    public String getName() {
        return name;
    }

    public Date getDate() {
        return date;
    }

    public boolean isValid() {
        return isValid;
    }
}
