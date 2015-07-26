package com.company;

import Accounts.Account;
import Accounts.Accounts_type;
import Accounts.BusinessAccount;

/**
 * Created by Admin on 25.07.2015.
 */
public class Customer {
    protected String firstName;
    protected String lastName;
    protected String patronym;
    protected String dateOfBirth;
    protected String sex;
    protected String passportId;
    private Account account;

    /**
     * constructor with parameters
     *
     * @param firstName   is name of the customer
     * @param lastName    is surname of the customer
     * @param patronym    is patronym of the customer
     * @param dateOfBirth is day month and year of birth
     * @param sex         is gender characteristics of the customer
     * @param passportId  is passport identification of the customer
     */
    public Customer(String firstName, String lastName, String patronym, String dateOfBirth, String sex, String passportId) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.patronym = patronym;
        this.dateOfBirth = dateOfBirth;
        this.sex = sex;
        this.passportId = passportId;
        this.account = null;
    }

    /**
     * method for creation an account for the user
     */
    public void openAccount(Accounts_type type) {
        if (account == null) {
            if (type.equals(Accounts_type.Business)) {
                account = new BusinessAccount(account);
                account.setCustomer(this);
                //account.setBalance();
                // add logic of making account, when initial deposit is less than needed and so on

            }
        }
    }

    /**
     * method for deletion of account
     *
     * @return deleted account
     */
    public Account closeAccount() {
        return null;
    }

    /**
     * method for making transaction
     *
     * @return true if transaction flows without problems
     */
    public boolean makeTransaction() {
        return true;
    }
}