package Accounts;

import com.company.Transaction;

/**
 * Created by Admin on 25.07.2015.
 */
public abstract class Account {
    /**
     * variables for storing account's data
     */
    protected static Integer transactionsCount = 0;
    protected Integer id;
    protected String firstName;
    protected String lastName;
    protected String patronym;
    protected String dateOfBirth;
    protected String sex;
    protected String passportId;
    protected Transaction[] transactions = new Transaction[100];
    private Accounts_type type;


    /**
     * default constructor
     */
    public Account() {
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
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPatronym() {
        return patronym;
    }

    public void setPatronym(String patronym) {
        this.patronym = patronym;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getPassportId() {
        return passportId;
    }

    public void setPassportId(String passportId) {
        this.passportId = passportId;
    }

    public Accounts_type getType() {
        return type;
    }

    public Integer getId() {
        return id;
    }
}
