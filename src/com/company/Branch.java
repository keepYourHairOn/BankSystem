package com.company;

import Accounts.Account;

/**
 * Created by Admin on 25.07.2015.
 */
public class Branch {
    /**
     * variables for storing branch's data
     */
    private static Integer accountsCount = 0;
    private int id;
    // manager of the branch
    private Account manager;
    private String address;
    private String phoneNumber;
    private String businessHoursListing;
    private Account[] accounts = new Account[100];

    /**
     * method for adding account to the branch
     * @param account to add
     */
    public void addAccount(Account account){
        if (accountsCount < 100) {
            accounts[accountsCount] = account;
            accountsCount++;
        } else {
            System.out.println("This branch already has 100 accounts!");
        }
    }

    /**
     * method for deletion account
     * @param id is id of account to delete
     * @return deleted account
     */
    public Account deleteAccount(Integer id) {
        return null;
    }

    /*
     * getters and setters for private variables
     */
    public Account getAccountById(Integer id){
        for (Account account : accounts) {
            if (account.getId().equals(id)) {
                return account;
            }
        }
        return null;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getBusinessHoursListing() {
        return businessHoursListing;
    }

    public void setBusinessHoursListing(String businessHoursListing) {
        this.businessHoursListing = businessHoursListing;
    }
}
