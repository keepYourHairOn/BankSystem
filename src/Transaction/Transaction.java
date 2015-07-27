package Transaction;

import Accounts.Account;
import Accounts.Accounts_type;
import com.company.Branch;

import java.util.Date;

/**
 * Created by Admin on 25.07.2015.
 */
public abstract class Transaction {
    protected String name;
    protected Date date;
    protected boolean isValid;
    protected Account firstAccount;
    protected Account secondAccount;
    protected Branch firstAccountBranch;
    protected Branch secondAccountBranch;

    /**
     * constructor with parameters
     * */

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
