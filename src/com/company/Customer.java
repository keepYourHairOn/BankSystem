package com.company;

import Accounts.*;

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
    private Branch branch;

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
    public void openAccount(Accounts_type type, Double cash, Branch branch) {
        if (account == null && branch != null) {
            if (type.equals(Accounts_type.Business)) {
                if (cash >= 5000000d) {
                    account = new BusinessAccount(this, cash);
                    this.branch = branch;
                    account.setBranch(branch);
                    this.branch.addAccount(account);
                } else {
                    System.out.println("There is not enough of money to open such an account!");
                }
            } else if (type.equals(Accounts_type.Chequing)) {
                if (cash >= 1000) {
                    account = new ChequingAccount(this, cash);
                    this.branch = branch;
                    account.setBranch(branch);
                    this.branch.addAccount(account);
                } else {
                    System.out.println("There is not enough of money to open such an account!");
                }
            } else if (type.equals(Accounts_type.Saving)) {
                if (cash >= 50000) {
                    account = new SavingAccount(this, cash);
                    this.branch = branch;
                    account.setBranch(branch);
                    this.branch.addAccount(account);
                } else {
                    System.out.println("There is not enough of money to open such an account!");
                }
            }
        } else {
            System.out.println("You already have an account!");
        }
    }

    /**
     * method for deletion of account
     *
     * @return deleted account
     */
    public Account closeAccount(Integer id) {
        Account tmp = branch.getAccountById(id);
        if (tmp != null) {
            branch.deleteAccount(id);
        } else {
            System.out.println("There is no such account!");
        }
        return tmp;
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