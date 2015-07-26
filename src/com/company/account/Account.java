package com.company.account;

import com.company.Transaction;
import com.company.account.type.ACCOUNT_TYPE;

/**
 * Created by Admin on 25.07.2015.
 */
public abstract class Account {
    /**
     * variables for storing account's data
     */
    private static Integer transactionsCount = 0;
    protected String id;
    protected String firstName;
    protected String lastName;
    protected String patronym;
    protected String dateOfBirth;
    protected String sex;
    protected String passportId;
    protected Transaction[] transactions = new Transaction[100];

    public Account() {

    }



    /**
     * abstract methods for child classes to implement
     */
    public abstract void calculate();

    public abstract void description();

    public Object changeTypeTo(ACCOUNT_TYPE type) {
        Object result = null;

        if(type.equals(ACCOUNT_TYPE.BUSINESS)){
            BusinessAccount businessAccount = new BusinessAccount(this);
            result = businessAccount;
        }else if(type.equals(ACCOUNT_TYPE.CHEQUING)){
            ChequingAccount chequingAccount = new ChequingAccount(this);
            result = chequingAccount;
        }else if(type.equals(ACCOUNT_TYPE.BUSINESS)){
            SavingAccount savingAccount = new SavingAccount(this);
            result = savingAccount;
        }

        return result;
    }

    /**
     * method for adding transaction
     * @param transaction
     * @return
     */
    public Transaction addTransaction(Transaction transaction){
        transactionsCount++;
        return null;
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

    public String getId() {
        return id;
    }
}
